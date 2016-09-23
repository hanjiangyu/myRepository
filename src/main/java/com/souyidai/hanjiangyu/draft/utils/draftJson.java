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

        //jsonarray要[]，jsonobject要{}
//        JSONArray jsonArray = JSONArray.parseArray(jsonString);
//        System.out.println(jsonArray);
//

    }
}
