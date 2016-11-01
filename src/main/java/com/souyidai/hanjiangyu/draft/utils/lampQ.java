package com.souyidai.hanjiangyu.draft.utils;

import com.souyidai.hanjiangyu.draft.model.Lamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanjiangyu on 2016/11/1.
 */
public class lampQ {
    public static void main(String[] arg){
        List<Lamp> lamps = new ArrayList<>();
        for(int i=0;i<150;i++){
            Lamp lamp = new Lamp();
            lamp.setId(i+1);
            lamps.add(lamp);
        }
        System.out.println("共有灯："+lamps.size());
        for(Lamp lamp:lamps){
            if(lamp.getId()%3==0) lamp.press();
        }
        for(Lamp lamp:lamps){
            if(lamp.getId()%5==0) lamp.press();
        }
        int account=0;
        for(Lamp lamp:lamps){
            if(lamp.getState()==1) account++;
        }
        System.out.println("亮着的还有："+account);

    }
}
