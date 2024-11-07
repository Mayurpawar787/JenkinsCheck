package org.example;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class LearnRegex {

    /*public static void checkPrime(int... n){
        for(int i : n){
            if(i %2 != 0  || i==2){
                System.out.println(i);
            }else {
                //System.out.println(i+ " is not Prime Number");
            }
        }
    }*/

    /*static boolean isPrime(int n){
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }*/


    public static void main(String[] args) {

        /*String test = "...............";
        String regex = "[a-z0-9]{1,3}";
        String pattern = regex + "\\."+regex+"\\."+regex+"\\."+regex;
        System.out.println(pattern);
        System.out.println(Pattern.matches(pattern,test));*/

        //System.out.println(Pattern.matches("(\\w)\\1+","hackerrank"));


        /*String str = "03-03-1996";
        str = "901";

        //System.out.println(Pattern.matches("-/d{1,3}$",str));
        //System.out.println(Pattern.matches("\\d{1,4}",str));

        System.out.println(Pattern.matches("\\D","-"));
        *//*String newStr = "03-03-1996";
        System.out.println(Pattern.matches("\\d{1,3}",newStr));*/

        //String[] s = {"9","-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
        //String[] arr = new String[s.length];
        //BigDecimal dec = new BigDecimal(Arrays.toString(s));
        /*for(String str : s){
            BigDecimal decimal = new BigDecimal(str);
            System.out.println(decimal.toString());
        }*/
        /*Arrays.sort(s,(a,b) -> {return new BigDecimal(b).compareTo(new BigDecimal(a));});
        Stream.of(s).forEach(System.out::println);*/
        //Stream.of(s).forEach(System.out::println);


        // BigIntegers
        String s1 = "13";
        String s2 = "100000000000000000";
        BigInteger integer1 = new BigInteger(s1);
        BigInteger integer2 = new BigInteger(s2);

        if(integer1.isProbablePrime(1)){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

        /*System.out.println(integer1.add(integer2));
        System.out.println(integer1.multiply(integer2));*/




    }
}
