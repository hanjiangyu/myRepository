package com.souyidai.hanjiangyu.draft.utils;

import java.util.*;

/**
 * Created by hanjiangyu on 2016/10/11.
 */
public class leetcodeT {
    public static void main(String[] args){

        String s1 = "aaaa";
        String s2 = "aaaaa";
        //System.out.println(canConstruct(s1,s2));

        String[] str1 = {"1","2"};
        String[] str2 = {"3","4"};
        String[] str3 = addAll(str1,str2);
        System.out.println(str3.length);
    }

    public static <T> T[] addAll(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

}
