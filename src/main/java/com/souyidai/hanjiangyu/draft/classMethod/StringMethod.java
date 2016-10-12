package com.souyidai.hanjiangyu.draft.classMethod;

/**
 * Created by hanjiangyu on 2016/10/12.
 */
public class StringMethod {
    public static void main(String[] args){
        String str = "01234a";

        System.out.println("String:"+str);

        System.out.println(str.charAt(1));

        //Unicode code point
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(1,5));

        /*compareTo()的返回值是整型,它是先比较对应字符的大小(ASCII码顺序),如果第一个字符和参数的第一个字符不等,结束比较,返回他们之间的
        差值,如果第一个字符和参数的第一个字符相等,则以第二个字符和参数的第二个字符做比较,以此类推,直至比较的字符或被比较的字符有一方
        全比较完,这时就比较字符的长度.*/
        System.out.println(str.compareTo("01234A"));
        //忽略大小写
        System.out.println(str.compareToIgnoreCase("01234A"));

        //添加到末尾
        System.out.println(str.concat("bc"));
        System.out.println(str);

        System.out.println(str.contains("34"));

        CharSequence cs="hello";
        System.out.println(str.contentEquals(cs));
        StringBuffer sb = new StringBuffer(str);
        System.out.println(str.contentEquals(sb));
    }
}
