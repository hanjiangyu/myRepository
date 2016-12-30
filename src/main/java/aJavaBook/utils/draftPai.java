package aJavaBook.utils;

/**
 * Created by hanjiangyu on 2016/9/28.
 */
public class draftPai {
    public static void main(String[] args){
       // Random random = new Random();
        double account = 0;
        double sum = 100000000;
        double a,b,c;

        for(int i = 0;i<sum;i++) {
            a = Math.random();
            b = Math.random();
            if((a*a+b*b)<1){
                account++;
            }
        }
        System.out.println(account);

        double pai = (account/sum)*4;
        System.out.println(pai);

    }
}
