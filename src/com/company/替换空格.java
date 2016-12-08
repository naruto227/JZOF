package com.company;

/**
 * Created by hzq on 16-12-8.
 */
public class 替换空格 {
    public static void main(String[] args) {
        String s1 = replaceSpace1("We Are Happy");
        System.out.println(s1);
        String s = "my.test.txt";
        System.out.println(s.replace(".", "#"));
        System.out.println(s.replaceAll(".", "#"));
        System.out.println(s.replaceFirst("\\.", "#"));//“.”是正则表达式的元字符，匹配除换行符以外的任意字符
    }

    public static String replaceSpace1(String str) {
        String str1 = str.replace(" ","%20");
        return str1;
    }

    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }

}
