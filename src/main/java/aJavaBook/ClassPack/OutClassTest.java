package aJavaBook.classPack;

/**
 * Created by hanjiangyu on 2016/9/26.
 */
public class OutClassTest {

    private String o1="外部类的变量111";

    private static String o2="外部类的静态变量222";

    public void outMethod(){
        System.out.println("外部类的方法。");
    }

// public C c = new C();外部类根本不知道局部内部类的存在，所以访问不了

    class InClassTest{
        public String i1="222";
        A a=new A();
        InClassTest2 test2=new InClassTest2();
        /**
         * 非静态内部类可以直接访问所有的外部类的成员
         */
        public void inMethod(){
            System.out.println("非静态内部类的方法。");
            outMethod();
            System.out.println(o1);
            System.out.println(test2.i2);
            System.out.println(a.a);
        }
    }

    class InClassTest2{
        public String i2="333";
    }

    public static class A{
        public int a=10;
        public static int b =100;

        //  InClassTest inClassTest=new InClassTest();
        public void aMethod(){
            System.out.println("静态内部类的方法。");
            B b=new B();
            /**
             * 静态内部类可直接访问外部类的静态成员，但不能直接访问外部类的非静态成员,需要实例化
             */
            System.out.println(o2);

            OutClassTest outClassTest=new OutClassTest();
            outClassTest.outMethod();
            System.out.println(outClassTest.o1);

        }
    }

    public static class B{
        public int a=20;
        public static int b =200;
    }

    public void cMethod(){
        /**
         * 局部内部类跟实例内部类一样能访问外部类的所有成员
         * @author Administrator
         *
         */
        class C{
            private int a=30;
            public int aa=300;
        }
    }

    public static void main(String[] args) {
        OutClassTest out=new OutClassTest();
        out.outMethod();

        /**
         * 在外部类中不能直接访问内部类的成员，必须通过内部类的实例才可访问
         */
        OutClassTest.InClassTest test=new OutClassTest().new InClassTest();

  /**
   * 外部类中可直接访问静态内部类中的静态变量，若要访问静态内部类中非静态变量则需要实例化才行
   */
        System.out.println(A.b);

        OutClassTest.A in = new OutClassTest.A();
        in.a=1000;
        System.out.println(""+in.a);
    }

}