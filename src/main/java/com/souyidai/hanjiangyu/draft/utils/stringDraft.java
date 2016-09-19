package com.souyidai.hanjiangyu.draft.utils;

import java.util.Stack;

/**
 * Created by SOUYIDAI on 2016/9/19.
 */
public class stringDraft {
    public static void main(String[] arg){
        String str = "海贼王";
        System.out.println(str);
        str = reverse1(str);
        System.out.println(str);
        str = reverse2(str);
        System.out.println(str);
        str = reverse3(str);
        System.out.println(str);
        str = reverse4(str);
        System.out.println(str);
        str = reverse5(str);
        System.out.println(str);
        str = reverse6(str);
        System.out.println(str);
        str = reverse7(str);
        System.out.println(str);
    }

    //每次反转一半，递归；substring()方法截取字符串
    public static String reverse1(String s) {
        int length = s.length();
        if (length <= 1)
            return s;
        String left = s.substring(0, length / 2);
        String right = s.substring(length / 2, length);
        return reverse1(right) + reverse1(left);
    }

    //charAt()方法取出字符
    public static String reverse2(String s) {
        int length = s.length();
        String reverse = "";
        for (int i = 0; i < length; i++)
            reverse = s.charAt(i) + reverse;
        return reverse;
    }

    //toCharArray()方法转换为数组，然后倒序取出
    public static String reverse3(String s) {
        char[] array = s.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--)
            reverse += array[i];

        return reverse;
    }

    //StringBuffer的reverse()方法
    public static String reverse4(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    //toCharArray()方法转换为数组，然后前后倒换
    public static String reverse5(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length - 1;
        int halfLength = n / 2;
        for (int i = 0; i <= halfLength; i++) {
            char temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
        return new String(s);
    }

    //toCharArray()方法转换为数组，正则
    public static String reverse6(String s) {

        char[] str = s.toCharArray();

        int begin = 0;
        int end = s.length() - 1;

        while (begin < end) {
            str[begin] = (char) (str[begin] ^ str[end]);
            str[end] = (char) (str[begin] ^ str[end]);
            str[begin] = (char) (str[end] ^ str[begin]);
            begin++;
            end--;
        }

        return new String(str);
    }

    //toCharArray()方法转换为数组，利用stack先入后出
    public static String reverse7(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length; i++)
            stack.push(str[i]);

        String reversed = "";
        for (int i = 0; i < str.length; i++)
            reversed += stack.pop();

        return reversed;
    }



}
