package com.objlove.web;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Liao(name = "liaohongdong", age = 28)
public class Liao1 {

    @Liao(name = "hong", age = 18)
    public void info() {

    }

    @Liao(name = "liao", age = 29)
    private String liao;

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Liao1 liao1 = new Liao1();
        Liao ann = liao1.getClass().getAnnotation(Liao.class);
        String s = ann.age() + ann.name();
        System.out.println(s);

        Field liao2 = liao1.getClass().getDeclaredField("liao");
        Liao ann2 = liao2.getAnnotation(Liao.class);
        String s1 = ann2.age() + ann2.name();
        System.out.println(s1);

        Method info = liao1.getClass().getDeclaredMethod("info");
        Liao ann3 = info.getAnnotation(Liao.class);
        String s2 = ann3.age() + ann3.name();
        System.out.println(s2);


    }

}