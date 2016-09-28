package com.souyidai.hanjiangyu.draft.utils;

import com.souyidai.hanjiangyu.draft.model.Person;

import java.util.*;

/**
 * Created by hanjiangyu on 2016/9/23.
 */
public class draftCollection {
    public static void main(String[] arg){

        Person person1 = new Person();
        person1.setName("tom");
        person1.setSex("man");
        person1.setAge(18);
        Person person2 = person1;

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        System.out.println(personList);

        String[] s1 = {"1","2","3"};
        String[] s2 = {"4","5","6"};
        String[] result = Arrays.copyOf(s1, s1.length + s2.length);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }
        //原数组，原数组起始位置，目的数组，目的数组起始位置，复制长度
        System.arraycopy(s2, 0, result, s1.length, s2.length);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }

        Map<String,String> taskMap = new HashMap<String, String>();
        taskMap.put("1","看框架");
        taskMap.put("2","看单例模式");
        taskMap.put("3","看servlet");
        System.out.println("\n"+taskMap);
        //第一种map遍历
        for (String key : taskMap.keySet()) {
            System.out.println("key= "+ key + " and value= " + taskMap.get(key));
        }
        //第二种map遍历
        for (Map.Entry<String, String> entry : taskMap.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        List<String> taskList = new ArrayList<String>();
        taskList.add("看框架");
        taskList.add("看单例模式");
        taskList.add("看servlet");
        taskList.add("看servlet");
        System.out.println(taskList);
        for(String str : taskList){
            System.out.print(str);
        }
        List<String> typeList = Arrays.asList("1","2","3");
        if(typeList.contains("3")){
            System.out.println("\ninclude");
        }else{
            System.out.println("\nnot include");
        }

        Set<String> taskSet = new HashSet<String>();
        taskSet.add("看框架");
        taskSet.add("看单例模式");
        taskSet.add("看servlet");
        taskSet.add("看servlet");
        System.out.println("\n"+taskSet);
        for(String str : taskSet){
            System.out.print(str);
        }
    }
}
