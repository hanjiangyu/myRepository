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
public class jsonDraft {

    public static void main(String[] arg){
        Person person = new Person();
        person.setName("tom");
        person.setSex("man");
        person.setAge(18);
        System.out.println(person);
        System.out.println(person.toString());

        JSONObject jsonObject = new JSONObject();
        System.out.println(jsonObject);
        //对象转jsonString
        String jsonString = JSON.toJSONString(person);
        System.out.println(jsonString);
        //jsonString转对象
        Person person1 = new Person();
        person1 = JSON.parseObject(jsonString,person1.getClass());
        System.out.println(person1);
        //jsonString转jsonObject
        jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("name"));

        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person1);
        System.out.println(personList);
    }
}
