package com.souyidai.hanjiangyu.draft.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hanjiangyu on 2016/12/2.
 */
public class calendar {

    public static void main(String[] arg){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format.format(ca.getTime());
        System.out.println("===============last:"+last);
    }
}
