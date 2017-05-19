package aJavaBook;

import java.util.Random;

/**
 * Created by hanjiangyu on 2017/1/5.
 */
public class draft {
    public static void main(String[] arg){
        int max=10000;
        int min=1;
        int s,t=0,total=0;
        int n = 0;

        while(t<100){
            while(true){
                Random random = new Random();
                s = random.nextInt(max)%(max-min+1) + min;
                n++;
                if(s==3||s==88||s==77||s==1998){
                    System.out.println("恭喜，在"+n+"次后你终于成功了");
                    t++;
                    total+=n;
                    break;
                }
            }
        }
        System.out.println("期望："+total/100);
    }
}
