package aJavaBook.utils;

import com.souyidai.hanjiangyu.draft.model.Person;

/**
 * Created by SOUYIDAI on 2016/9/14.
 */
public class riverCrossingProblem {

    public static void main(String[] arg){
        System.out.println('a'^'a');
        System.out.println(1^0);

        System.out.println(getStr().equals("abc"));

        int[] aa = {1,2,3};
        System.out.println(aa[0]);

        //a++与++a的区别
        int a = 0;
        System.out.println("/////////"+ a++);
        System.out.println("/////////"+ a);
        System.out.println(Integer.MAX_VALUE);

        int i1= 1;
        long l1=1;
        if(i1==l1){
            System.out.println("==");
        }

        Person p1 = new Person();
        p1.setName("a");
        Person p2 = p1,p3 = p1;
        p3.setName("b");
        System.out.println(p1.getName()+"/"+p2.getName()+"/"+p3.getName()+"/");

        char chr1 = 'a';
        char chr2 = 'a';
        if(chr1==chr2){System.out.println("==");}

    }

    public static String getStr(){
        String s = "";
        return s;
    }





}
