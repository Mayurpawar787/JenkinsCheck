package org.example.objectOrientedClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Output {

    public static void main(String[] args) {

        int armStrngNum = 371;
        String numStr = String.valueOf(armStrngNum);
        char[] arr = numStr.toCharArray();
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            int test = Integer.parseInt(String.valueOf(arr[i]));
            System.out.println(test);
            int temp = test*test*test;
            System.out.println(temp);
            sum += temp;
            System.out.println(sum);
            temp = 0;
        }


        /*Output output = new Output();
        //output.go();
        int a  = 8;
        System.out.println(++a);
        int c = a++;
        System.out.println(c);
        int b = 8;
        System.out.println(--b);
        int d = b--;
        System.out.println(d);*/
    }
    void go(){
        int value = 7;
        for(int i = 1;i<8;i++){
            value++;
            if(i > 4){
                System.out.println(++value + " ");
            }
            if(value >14){
                System.out.println(" i = "+i);
                break;
            }
        }
    }
}
