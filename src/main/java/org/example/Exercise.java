package org.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise {
    static Scanner scanner = new Scanner(System.in);
    public static int b;
    public static int h;


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        //Duplicates in Array

        int[] arr = {1,2,3,4,5,1,2,3};
        List<?> numbers = Arrays.stream(arr).boxed().toList();
        /*numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);*/
        Map<?,?> map = numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toMap(s->s,s->1,Integer::sum));
        map.forEach((k,v) -> System.out.println(k+":"+v));


        String[] strArray = {"Mayur","Tru","Mayur","Abc","def","Tru"};
        List<?> words = Arrays.stream(strArray).toList();
        words.forEach(System.out::println);
        Map<?,?> wordMap = words.stream().filter(s-> Collections.frequency(words,s)>1).collect(Collectors.toMap(s->s,s->1,Integer::sum));
        wordMap.forEach((k,v) -> System.out.println(k+":"+v));


        /*Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        //Anagrams
        List<Character> list1 = str1.chars().mapToObj(s -> (char)s).collect(Collectors.toList());
        List<Character> list2 = str2.chars().mapToObj(s -> (char)s).toList();
        List<?> matched = list1.stream().map(list2::contains).toList();
        if(matched.size() == list1.size() && matched.size() == list2.size()){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
*/

        // Palindrome
        /*int len=0;
        String str1 = A.substring(0,len);
        String str2 = A.substring(len+1);
        if(A.length()%2==0){
            len = A.length()/2;
            str1 = A.substring(0,len);
            str2 = A.substring(len);
        }else {
            len = A.length()/2;
             str1 = A.substring(0,len);
             str2 = A.substring(len+1);
        }
        //System.out.println(len);
        *//*String str1 = A.substring(0,len);
        String str2 = A.substring(len+1);*//*
        StringBuilder sb = new StringBuilder(str2);
        String revStr = sb.reverse().toString();
        if(str1.equals(revStr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
*/
    }

    /*public static void main(String[] args) {

        int n = 100;

        String s = String.valueOf(n);
        System.out.println(s);

        *//*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
       // String s = sc.;

        System.out.println(s+"_"+d+"_"+i);*//*

        *//*Given an integer, , perform the following conditional actions:

        If  is odd, print Weird
        If  is even and in the inclusive range of 2 to 5, print Not Weird
        If  is even and in the inclusive range of 6 to 20, print Weird
        If  is even and greater than , print Not Weird*//*
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }else if(N%2==0){
            if(N <=20 && N>5){
                System.out.println("Weird");
            }else if (N>=6){
                System.out.println("Weird");
            } else if (N<=5) {
                System.out.println("Not Weird");
            } else if (N>=2) {
                System.out.println("Not Weird");
            }
        } else if (N%2!=0) {
            System.out.println("Weird");
        }

        scanner.close();


        // String Reverse Code
       *//* String str= "Truptmay";
        //char[] chars = str.toCharArray();

        List<Character> list = str.chars().mapToObj(s -> (char)s).toList();
        System.out.println(list);*//*
        //Stream.of(str);


        *//*String revStr="";
        *//**//*for(int i = chars.length-1;i>=0;i--){
            revStr = revStr.concat(String.valueOf(chars[i]));
        }
        System.out.println(revStr);*//**//*

        // Reverse By Inbuilt Functions
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder = stringBuilder.reverse();*//*
        //System.out.println(stringBuilder);



    }*/

}
