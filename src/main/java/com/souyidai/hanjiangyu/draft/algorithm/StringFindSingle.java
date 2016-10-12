package com.souyidai.hanjiangyu.draft.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hanjiangyu on 2016/10/12.
 */
public class StringFindSingle {
    public static void main(String[] args){
        String str = "0001112223444";
        System.out.print(findSingle(str));

        char c = '1';
        System.out.println(c-0);
        System.out.println(c-'0');

    }


    public static Character findSingle(String str){
        char[] a = str.toCharArray();
        HashMap<Integer,Character> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(i,a[i]);
        }
        Iterator ite = hm.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry entry = (Map.Entry)ite.next();
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
        return 'a';
    }
}
