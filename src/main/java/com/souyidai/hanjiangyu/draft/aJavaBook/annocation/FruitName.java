package com.souyidai.hanjiangyu.draft.aJavaBook.annocation;

import java.lang.annotation.*;

/**
 * Created by hanjiangyu on 2016/9/28.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
