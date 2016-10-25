package com.souyidai.hanjiangyu.draft.utils;

import com.souyidai.hanjiangyu.draft.model.Person;

import java.util.*;

/**
 * Created by hanjiangyu on 2016/10/11.
 */
public class leetcodeT {
    public static void main(String[] args){

        Person a = new Person();
        Person b = new Person();

        a.setAge(6);
        b.setAge(a.getAge());
        System.out.print(b.getAge());
    }


}
