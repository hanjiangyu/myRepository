package aJavaBook.utils;

/**
 * Created by hanjiangyu on 2016/9/22.
 * jsonstring标准格式的问题
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

        String st1 = "\\\"success\\\":true,\\\"reason_code\\\":\\\"200\\\",\\\"reason_desc\\\":\\\"获取成功\\\",\\\"rules\\\":[{\\\"conditions\\\":[{\\\"result\\\":15,\\\"dim_type\\\":\\\"id_number\\\",\\\"type\\\":\\\"frequency_one_dim\\\"},{\\\"result\\\":15,\\\"dim_type\\\":\\\"account_mobile\\\",\\\"type\\\":\\\"frequency_one_dim\\\"}],\\\"rule_id\\\":\\\"315676\\\",\\\"score\\\":5}]";
        String st2 = st1.replace("\\","").replace("\"{","{").replace("}\"","}");
        System.out.println(st2);

        //string类型中删除转义字符
//        String ss = "\\\\\\\\\\";
//        String sss = ss.replace("\\","");
//        System.out.print(sss);

    }
}
