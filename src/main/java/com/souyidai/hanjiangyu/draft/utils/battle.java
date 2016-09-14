package com.souyidai.hanjiangyu.draft.utils;

import com.souyidai.hanjiangyu.draft.model.*;
import java.util.*;
/**
 * Created by SOUYIDAI on 2016/9/13.
 */
public class battle {
    public static void main(String[] arg){
        Person person1 = new Person();
        person1.setName("hjy");
        person1.setSex("man");
        person1.setAge(22);
        Person person2 = new Person();
        person2.setName("zbw");
        person2.setSex("man");
        person2.setAge(23);


        int r1,r2;
        for(int i =0;i<10;i++){
            r1 = person1.chaiQuan();
            r2 = person2.chaiQuan();
            if((r1==0&&r2==1)||(r1==1&&r2==2)||(r1==2&&r2==0)){
                System.out.println("hjy win！");
            }else if(r1==r2){
                System.out.println("平局！");
            }else{
                System.out.println("zbw win！");
            }
        }
    }
}
