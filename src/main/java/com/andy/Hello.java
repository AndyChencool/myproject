package com.andy;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        new Person().hello();
        //物件 = 參照資料型態 通常宣告名稱開頭是大寫
        Person p = new Person();
        p.hello();
        int age = 19;
        Integer age2 = 19; //代表放在物件當中
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        Byte b2 = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "andy";

    }
}
