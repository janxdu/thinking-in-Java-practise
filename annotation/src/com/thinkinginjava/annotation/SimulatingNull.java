package com.thinkinginjava.annotation;

/**
 * Created by dujian on 12/03/2017.
 */
public @interface SimulatingNull {
    public int id() default -1;
    public String desc() default "";
    public int value() default 2;
}
