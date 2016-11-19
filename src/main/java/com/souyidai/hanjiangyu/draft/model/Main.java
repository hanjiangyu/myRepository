package com.souyidai.hanjiangyu.draft.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/19.
 */
public class Main {
    public static void main(String[] args){

        Goods milk = new Goods();
        milk.setId("m1001");
        milk.setName("光明牛奶(6盒装)");
        milk.setType("食品");
        milk.setUnitPrice(30);
        milk.setPictureUrl("http://xxx.com/N05/M06/m1001.jpg");

        Goods beef = new Goods();
        beef.setId("b1001");
        beef.setName("牛排套装(澳洲进口)");
        beef.setType("食品");
        beef.setUnitPrice(50);
        beef.setPictureUrl("http://xxx.com/N05/M06/b1001.jpg");

        Goods egg = new Goods();
        egg.setId("e1001");
        egg.setName("鸡蛋(优质)");
        egg.setType("食品");
        egg.setUnitPrice(10);
        egg.setPictureUrl("http://xxx.com/N05/M06/e1001.jpg");

        Cart cart1 = new Cart();

        cart1.addGoods(milk);
        cart1.addGoods(beef);
        cart1.showCart();
        System.out.println("-------------------------------------------------");
        cart1.addGoods(milk);
        cart1.addGoods(beef);
        cart1.showCart();
        System.out.println("-------------------------------------------------");
        cart1.deleteGoods(milk);
        cart1.deleteGoods(milk);
        cart1.showCart();
        System.out.println("-------------------------------------------------");
        cart1.addGoods(milk);
        cart1.addGoods(beef);
        cart1.addGoods(egg);
        List<Goods> deleteList = new ArrayList<>();
        deleteList.add(egg);
        deleteList.add(beef);
        cart1.deleteManyGoods(deleteList);
        cart1.showCart();
        System.out.println("-------------------------------------------------");
    }
}
