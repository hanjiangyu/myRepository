package com.souyidai.hanjiangyu.draft.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/19.
 */
public class Cart {

    private Map<Goods, Integer> goodsList = new HashMap<Goods, Integer>();

    public void addGoods(Goods goods){
        for (Map.Entry<Goods, Integer> entry : goodsList.entrySet()) {
            if(entry.getKey().getId().equals(goods.getId())){
                entry.setValue(entry.getValue()+1);
                return;
            }
        }
        goodsList.put(goods,1);
    }

    public void deleteGoods(Goods goods){
        for (Iterator<Map.Entry<Goods, Integer>> it = goodsList.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Goods, Integer> entry = it.next();
            if(entry.getKey().getId().equals(goods.getId())){
                entry.setValue(entry.getValue()-1);
                if(entry.getValue() == 0){
                    it.remove();
                }
                return;
            }
        }
        return;
    }

    public void deleteManyGoods(List<Goods> manyGoods){
       for(Goods goods : manyGoods){
           for (Iterator<Map.Entry<Goods, Integer>> it = goodsList.entrySet().iterator(); it.hasNext();) {
               Map.Entry<Goods, Integer> entry = it.next();
               if(entry.getKey().getId().equals(goods.getId())) {
                   it.remove();
               }
           }
       }
    }

    public void  showCart(){
        for (Map.Entry<Goods, Integer> entry : goodsList.entrySet()) {
            System.out.println("商品编号："+ entry.getKey().getId() + "，商品名称：" + entry.getKey().getName() +
                    ",商品数量："+ entry.getValue() + "，商品价格：" + (entry.getValue()*entry.getKey().getUnitPrice()));
        }
    }
}
