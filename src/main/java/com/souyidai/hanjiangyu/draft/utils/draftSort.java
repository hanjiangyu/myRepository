package com.souyidai.hanjiangyu.draft.utils;

/**
 * Created by SOUYIDAI on 2016/9/13.
 */
public class draftSort {
    public static void main(String[] arg){
        int [] array = {0,2,3,4,5,3,2,1,3};
        bubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }

    }

    public static void bubbleSort(int[] array){
        int i,j,temp;
        int len = array.length;
        for(i=0;i<len-1;i++){
            for(j=len-1;j>i;j--){
                if(array[j]<array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
