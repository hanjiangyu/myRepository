package com.souyidai.hanjiangyu.draft.utils;

import com.alibaba.fastjson.*;
import com.souyidai.hanjiangyu.draft.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanjiangyu on 2016/9/22.
 */
public class draftJson2 {
    public static void main(String[] arg){
//        String jsonString = "{\\\"code\\\":\\\"200\\\",\\\"data\\\":{\\\"ISPNUM\\\":{\\\"province\\\":\\\"北京\\\",\\\"city\\\":\\\"北京\\\",\\\"isp\\\":\\\"移动\\\"},\\\"RSL\\\":[{\\\"RS\\\":{\\\"code\\\":\\\"03\\\",\\\"desc\\\":\\\"(24,+)\\\"},\\\"IFT\\\":\\\"A3\\\"}],\\\"ECL\\\":[]},\\\"msg\\\":\\\"成功\\\"}";
//        String  s11 = jsonString.replace("\"", "");
//        String s22 = s11.replace("[", "");
//        String s33 = s22.replace("]", "");
//        String s44 = s33.replace("},{", "}");
//        String s55 = s44.replace("\\", "");
//        System.out.print(s55);
//        JSONObject jsonObject = JSON.parseObject(jsonString);
//        System.out.println(jsonObject);

        String str = "{\"message\":\"查询成功\",\"data\":\"{\\\"overdue\\\":{},\\\"loanRecords\\\":[]}\",\"errorcode\":\"0000\"}";
        System.out.println(str);
        String str2 = str.replace("\\","");
        String str3 = str2.replace("\"{","{");
        String str4 = str3.replace("}\"","}");
        System.out.println(str4);


        //string类型中删除转义字符
//        String ss = "\\\\\\\\\\";
//        String sss = ss.replace("\\","");
//        System.out.print(sss);

    }
}
