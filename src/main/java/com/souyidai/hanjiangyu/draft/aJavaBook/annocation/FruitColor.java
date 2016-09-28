package com.souyidai.hanjiangyu.draft.aJavaBook.annocation;

import java.lang.annotation.*;

/**
 * Created by hanjiangyu on 2016/9/28.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     * @author peida
     *
     */
    public enum Color{ BULE,RED,GREEN};

    /**
     * 颜色属性
     * @return
     */
    Color fruitColor() default Color.GREEN;
}
