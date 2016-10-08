package com.souyidai.hanjiangyu.draft.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanjiangyu on 2016/9/23.
 */
public class draftString2 {
    public static void main(String[] arg){
        String str1 = "hello";
        str1 = "123";
        System.out.println(str1);

        //返回一个新字符串，它是此字符串的一个子字符串。该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
        // 因此，该子字符串的长度为 endIndex-beginIndex。
        String str2 = "0123456789";
        System.out.println(str2.substring(0,str2.length()-2));
        System.out.println(str2);
        System.out.println(str2.substring(str2.length()-2,str2.length()));

        String str3 = "qwer";
        str3 = str3.replace("q","w").replace("e","r");
        System.out.println(str3);

        for(int i =0 ;i<10;i++){
            String str11 = String.valueOf(i);
            System.out.println(str11);
        }

        List<String> list1 = new ArrayList<>();
        list1.add("111");
        System.out.print(list1.size());

    }
}
