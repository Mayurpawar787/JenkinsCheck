package org.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDigits {

    public static void main(String[] args) {

        String s1 = new String("mayur");
        String s2 = new String("mayur");
        String s3 = "mayur";
        String s4 = "mayur";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s1);
        System.out.println(s1.equals(s3));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        int sum = 0;
        String input = "shgfgdsjkghjfkhdsjkh51^%^&%&&*&(*&^^&*^jhghjgdgshgdghjghjghjghjghj$#52dsfsd6cvsdd5dfdf5fdf";
//           input= "abc12bcd13abf4asd5";
//
//        char[] chars = input.toCharArray();
//
//        for(int i=0; i<chars.length-1;i++){
//            if()
//            if(Character.isDigit(chars[i]) && i<=chars.length){
//                if(Character.isDigit(chars[i+1])){
//                    String newStr = String.valueOf(chars[i])+String.valueOf(chars[i+1]);
//                    System.out.println(newStr);
//                    sum += Integer.parseInt(newStr);
//                    i=i+1;
//                }else {
//                    String newStr = String.valueOf(chars[i]);
//                    System.out.println(newStr);
//                    sum += Integer.parseInt(newStr);
//                }
//            }
//        }
//        System.out.println(sum);
//
//    }

        int total = Arrays.stream(input.replaceAll("[^\\d]+"," ").split(" "))
                .collect(Collectors.toList()).stream().filter(e -> !e.equals("") && !e.equals(" ")).map(k-> Integer.parseInt(k)).mapToInt(Integer::intValue).sum();

        //System.out.println(total);

        /*String name = "Mayur city  bank employee";

        List<String> list = Arrays.stream(name.split(" ")).collect(Collectors.toList());
        //System.out.println(list);
        String revName="";
        for(int i =list.size()-1;i>=0;i--){
            //System.out.println(list.get(i));
            revName = revName+" "+list.get(i);
        }
        System.out.println(revName.trim());*/

        /*List<String> li = new ArrayList<>();
        li.add("ahghsghkhjkhd");
        li.add("ahghsghkhjkhd");
        li.add("ahghsghkhjkhd");
        li.add("ahghsghkhjkhd");
        li.add("ahghsghkhjkhd");
        li.add("ahghsghkhjkhd");


        System.out.println(li.size());*/


    }

}
