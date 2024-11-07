package org.example;

import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str = "India is a great country";
        str = str.toLowerCase();
        List<String> strList = str.chars().mapToObj(s-> String.valueOf((char)s)).collect(Collectors.toList());
        long aCoutn = strList.stream().filter(s->s.contains("a")).collect(Collectors.toList()).stream().count();
        System.out.println("Count of A is : "+aCoutn);
        long eCoutn = strList.stream().filter(s->s.contains("e")).collect(Collectors.toList()).stream().count();
        System.out.println("Count of E is : "+eCoutn);
        long iCoutn = strList.stream().filter(s->s.contains("i")).collect(Collectors.toList()).stream().count();
        System.out.println("Count of I is : "+iCoutn);
        long oCoutn=strList.stream().filter(s->s.contains("o")).collect(Collectors.toList()).stream().count();
        System.out.println("Count of O is : "+oCoutn);
        long uCoutn=strList.stream().filter(s->s.contains("u")).collect(Collectors.toList()).stream().count();
        System.out.println("Count of U is : "+uCoutn);







    }
}