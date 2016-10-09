package com.souyidai.hanjiangyu.draft.aJavaBook.classPack;

import com.souyidai.hanjiangyu.draft.model.Person;

/**
 * Created by hanjiangyu on 2016/9/29.
 */
public class Party {
    public static void main(String[] args){
        Person man1 = new Person();
        Person man2 = new Person();
        Person man3 = new Person();
        Person man4 = new Person();
        Person man5 = new Person();
        Person woman1 = new Person();
        woman1.setName("jerry");
        Person woman2 = new Person();
        Person woman3 = new Person();
        Person woman4 = new Person();
        Person woman5 = new Person();

        Party party = new Party();
        party.makeCouple(man1,woman1);
        System.out.println(man1.getCouple());

        int a = 1;
        int b = 2;
        party.testInt(a,b);
        System.out.println(a);

        //不可变类 s1.replace()一定要接收一下，否则不生效
        String s1 = "123";
        String s2 = "456";
        s1.replace("1","2");
        System.out.println(s1);

    }

    //引用类型引用传递
    public void makeCouple(Person p1, Person p2){
        p1.setCouple(p2);
        p2.setCouple(p1);
    }

    //基本类型值传递
    public void testInt(int i,int j){
        i=j;
    }
}
