package com.souyidai.hanjiangyu.draft.utils;

import com.alibaba.fastjson.*;
import com.souyidai.hanjiangyu.draft.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SOUYIDAI on 2016/9/13.
 * Json.parseObject()
 * Json.parseArray()
 * 对象.toJSONString
 */
public class draftJson {

    public static void main(String[] arg){
        Person person = new Person();
        person.setName("tom");
        person.setSex("man");
        person.setAge(18);
        System.out.println("输出person对象:"+person);
        System.out.println("输出person对象覆写后的toString():"+person.toString());

        //对象转jsonString
        String jsonString = JSON.toJSONString(person);
        System.out.println("person对象转jsonString:"+jsonString);

        //jsonString转对象
        Person person1 = new Person();
        person1 = JSON.parseObject(jsonString,person1.getClass());
        System.out.println("jsonString转回person对象："+person1);

        //jsonString转jsonObject
        JSONObject jsonObject = new JSONObject();
        System.out.println("输出空的jsonObject："+jsonObject);
        jsonObject = JSON.parseObject(jsonString);
        System.out.println("jsonString转jsonObject:"+jsonObject);
        System.out.println(jsonObject.get("name"));

        String s1 = "{\"final_decision\":\"Review\",\"final_score\":30,\"hit_rules\":[{\"decision\":\"Accept\",\"id\":\"315586\",\"name\":\"手机号格式校验错误\",\"parentUuid\":\"\",\"score\":30,\"uuid\":\"be84ed93b8174412966e448fa49425a4\"}],\"policy_name\":\"借款事件_网站\",\"policy_set\":[{\"hit_rules\":[{\"decision\":\"Accept\",\"id\":\"315586\",\"name\":\"手机号格式校验错误\",\"parentUuid\":\"\",\"score\":30,\"uuid\":\"be84ed93b8174412966e448fa49425a4\"}],\"policy_decision\":\"Review\",\"policy_mode\":\"Weighted\",\"policy_name\":\"异常借款_网站\",\"policy_score\":30,\"policy_uuid\":\"b81d9532669941178cbcb6c9acc177ea\",\"risk_type\":\"suspiciousLoan\"}],\"policy_set_name\":\"借款事件_网站\",\"risk_type\":\"suspiciousLoan_review\",\"seq_id\":\"1461047313115611F31352EE88201031\",\"spend_time\":133,\"success\":true}";
        jsonObject = JSON.parseObject(s1);
        System.out.println(jsonObject.get("final_score"));

        //jsonarray要[]，jsonobject要{}
        String strj = "[{\"age\":18,\"name\":\"tom\",\"sex\":\"man\"},{\"age\":18,\"name\":\"tom\",\"sex\":\"man\"}]";
        JSONArray jsonArray = JSONArray.parseArray(strj);
        System.out.println(jsonArray);


    }
}
