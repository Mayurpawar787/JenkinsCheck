package org.example.practice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsQuestions {

    public static void main(String[] args) {

        //Reverse a string without affecting special characters
        //String string = "a,b$c";
        String string = "A#B%C";
        List<String> strList = string.chars().mapToObj(s->String.valueOf((char)s)).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        int a = 0;
        String[] chArr = new String[string.length()];
        for(int i=strList.size()-1;i>=0;i--){
            if(Pattern.matches("[a-zA-Z]*",strList.get(i))) {
                chArr[a] = strList.get(i);
                a++;
            }else {
                chArr[i] = strList.get(i);
                a++;
            }
        }
        for(String str : chArr){
            sb.append(str);
        }
        System.out.println(sb.toString());


        //Array to List:
        int[] arr = {1,2,3};
        List<Integer> listArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        listArr.forEach(System.out::println);

        String[] strArr = {"Test","Array","to","String","list"};
        List<String> stringList = Arrays.stream(strArr).collect(Collectors.toList());
        stringList.forEach(System.out::println);

        //Biggest SubString from sentence:
        String sent = "i love programming very much";
        List<String> splList = List.of(sent.split(" "));
        String biggestSubString = splList.stream().max((s1,s2) -> s1.length()-s2.length()).get();
        System.out.println(biggestSubString);
        System.out.println(splList.stream().min((s1,s2) -> s1.length()-s2.length()).get());

        //ArmStrong Number with Stream:
        int num = 371;
        String strNum = String.valueOf(num);
        List<Integer> stringsList = strNum.chars().mapToObj(s -> String.valueOf((char)s)).collect(Collectors.toList())
                .stream().map(Integer::parseInt).collect(Collectors.toList());
        int val = stringsList.stream().map(s -> s * s * s).mapToInt(s -> s).sum();

        //Check Palindrome
        System.out.println(checkPalindrome("nitina"));

        //Anagrams in String
        String anagram = "ninjas"; String test = "jasnnij";
        //String to List
        List<String> firstList = anagram.chars().mapToObj(s -> String.valueOf((char)s)).collect(Collectors.toList());
        List<String> secondList = test.chars().mapToObj(s -> String.valueOf((char)s)).collect(Collectors.toList());

        List<String> matched = firstList.stream().filter(secondList::contains).map(String::toString).collect(Collectors.toList());
        //if(matched.size() == anagram.length()){
        if(firstList.containsAll(secondList) && firstList.size()== secondList.size()){
            System.out.println("Are Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }

        // Remove White Spaces of String
        String spaces = "a b cd e ";
       // spaces = spaces.replace("\\s*","");
        spaces = spaces.replaceAll(" ","");
        System.out.println(spaces);

        //How to replace a substring of a string
        //Input: S = “abababa”, S1 = “aba”, S2 = “a”
        //Output: aba

        String s = "abababa";
        s= s.replace("aba","a");
        System.out.println(s);

        String s2 = "geeksforgeeks";
        s2 = s2.replace("eek","ok");
        System.out.println(s2);

        //Sum of two large numbers
        String str1 = "3333311111111111"; String str2 ="44422222221111";
        BigInteger bigInteger = new BigInteger(str1);
        BigInteger bigInteger1 = new BigInteger(str2);
        System.out.println(String.valueOf(bigInteger.add(bigInteger1)));

        //Multiply Two Strings
        String num1 = "12345678901234567654632498739473"; String num2 = "12345678901234561247612748612746";
        BigInteger bigi1 = new BigInteger(num1);
        BigInteger bigi2 = new BigInteger(num2);
        System.out.println(String.valueOf(bigi1.multiply(bigi2)));

        //Reverse words in a string
        String str = "i love programming very much";
        String revStr = reverseWords(str);
        //System.out.println(revStr);

        String input = "AnandisanEngineer";
        //How many times "an" repeated in string
        List<String> listInp = List.of(input.split(" "));
        long cnt = listInp.stream().filter(st -> st.indexOf("an") != 0).count();
        System.out.println("Count for An is : "+cnt);

    }

    //Reverse words in a string
    static String reverseWords(String str){
        String[] arr = str.split(" ");
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ",arr);
    }

    //Palindrome
    static String checkPalindrome(String palStr) {
        //String palStr = "nitin";
        String revStr = new StringBuilder(palStr).reverse().toString();
        if(palStr.equalsIgnoreCase(revStr)){
            return "ItsPalindrome";
        }else {
            return "NotPalindrome";
        }
    }





}
