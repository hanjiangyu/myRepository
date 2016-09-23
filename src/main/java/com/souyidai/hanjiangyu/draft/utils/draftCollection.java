package com.souyidai.hanjiangyu.draft.utils;

import com.souyidai.hanjiangyu.draft.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanjiangyu on 2016/9/23.
 */
public class draftCollection {
    public static void main(String[] arg){
        Person person1 = new Person();
        person1.setName("tom");
        person1.setSex("man");
        person1.setAge(18);
        Person person2 = person1;

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        System.out.println(personList);
    }
}
