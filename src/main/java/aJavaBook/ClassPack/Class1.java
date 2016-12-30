package aJavaBook.classPack;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Class1 {
    protected int a;

    public class ClassIner{
        private int b;
        public void func(){
            b = a;
        }
    }

    public static void main(String[] args){
        Date date = new Date();
        System.out.print(date);


    }


}
