package com.souyidai.hanjiangyu.draft.model;

import java.util.*;
/**
 * Created by SOUYIDAI on 2016/9/13.
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public int chaiQuan(){
        Random random = new Random();
        int result=random.nextInt(3);
        switch (result){
            case 0 : System.out.println(name+"出石头");break;
            case 1 : System.out.println(name+"出剪子");break;
            case 2 : System.out.println(name+"出布");break;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
