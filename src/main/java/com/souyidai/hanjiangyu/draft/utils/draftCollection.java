package com.souyidai.hanjiangyu.draft.utils;

import com.souyidai.hanjiangyu.draft.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
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

        String[] s1 = {"1","2","3"};
        String[] s2 = {"4","5","6"};
        String[] result = Arrays.copyOf(s1, s1.length + s2.length);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }
        //原数组，原数组起始位置，目的数组，目的数组起始位置，复制长度
        System.arraycopy(s2, 0, result, s1.length, s2.length);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }
}
