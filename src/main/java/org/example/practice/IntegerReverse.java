package org.example.practice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerReverse {

    public static void main(String[] args) {
        /*System.out.println("Hello Guys!!! " +
                "Lets Start with java");*/

        int a  = 512;
        String str = String.valueOf(a);
        String revStr = String.valueOf(new StringBuilder(str).reverse());
        System.out.println(revStr);
        List<Integer> list1 = str.chars().mapToObj(s-> String.valueOf((char)s)).map(Integer::parseInt).collect(Collectors.toList());


        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        //List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> list = Arrays.stream(arr).flatMap(s -> IntStream.of(s)).boxed().collect(Collectors.toList());
        System.out.println(list);
        Map<Object,Integer> map = list.stream().filter(s -> Collections.frequency(list,s)>1).collect(Collectors.toMap(s->s,s->1,Integer::sum));
        //Map<Object,Integer> map = list.stream().filter(s -> list.indexOf(s) != list.lastIndexOf(s)).collect(Collectors.toMap(s->s,s->1,Integer::sum));
        //map.forEach((k,v) -> System.out.println(k +" "+v));
        System.out.println(map);

        /*sout
      int x = -123;int n;
        String str;
        StringBuilder sb = new StringBuilder();
        if(x < 0){
            x = Math.abs(x);
            str = String.valueOf(x);
            sb.append(str);
            str = sb.reverse().toString();
            str = "-".concat(str);
            //System.out.println(str);
            n = Integer.parseInt(str);
            //n = Math.negateExact(n);
            System.out.println(n);
        }else {
            str = sb.reverse().toString();
            //System.out.println(str);
            n = Integer.parseInt(str);
            System.out.println(n);
        }

        str = sb.reverse().toString();
        //System.out.println(str);

        //int n = Integer.parseInt(str);
        System.out.println(n);*/
        
        //reverse(9646324351);
    }


    public static int reverse(int x) {
        int num;
        String str;
        StringBuilder sb = new StringBuilder();
        BigInteger bigInteger = new BigInteger(String.valueOf(x));
        x = bigInteger.intValue();
        if(x < 0){
            x = Math.abs(x);
            str = String.valueOf(x);
            sb.append(str);
            str = sb.reverse().toString();
            str = "-".concat(str);
            //System.out.println(str);
            num = Integer.parseInt(str);
            //n = Math.negateExact(n);
            System.out.println(num);
        }else {
            str = sb.reverse().toString();
            //System.out.println(str);
            num = Integer.parseInt(str);
            System.out.println(num);
        }

        return num;
    }

}
