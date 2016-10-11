package com.souyidai.hanjiangyu.draft.utils;

import java.util.*;

/**
 * Created by hanjiangyu on 2016/10/11.
 */
public class leetcodeT {
    public static void main(String[] args){

        String s1 = "aaaa";
        String s2 = "aaaaa";
        System.out.println(canConstruct(s1,s2));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] c1 = ransomNote.toCharArray();
        char[] c2 = magazine.toCharArray();

        Map<Integer,Character> l2 = new HashMap();
        for(int i =0; i<c2.length;i++){
            l2.put(i,c2[i]);
        }

        for(int j=0;j<c1.length;j++){
            for(int k = 0;k<l2.size();k++) {
                if (c1[j]==l2.get(k)) {
                    l2.remove(k);
                } else return false;
            }
        }
        return true;

    }
}
