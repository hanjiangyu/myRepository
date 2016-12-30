package aJavaBook.annocation;

/**
 * Created by hanjiangyu on 2016/9/28.
 */
public class FruitRun {
    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);

        Apple apple = new Apple();
        System.out.print(apple);
    }
}
