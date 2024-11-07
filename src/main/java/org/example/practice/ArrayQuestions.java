package org.example.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayQuestions {

    public static void main(String[] args) {

        //Push Zeros to end of list
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        //int[] arr1 = {0, 0};
        List<Integer> arrList = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> nonZero = arrList.stream().filter(s -> s != 0).collect(Collectors.toList());
        for(int i= nonZero.size();i<arrList.size();i++){
            nonZero.add(0);
        }
        System.out.println(nonZero);
        //String array to List
        String[] strArray = new String[]{"Mayur","Shubham","trupti","Amol","Mayur","Trupti"};
        List<String> stringList = Arrays.stream(strArray).map(String::toLowerCase).collect(Collectors.toList());
        Map<String,Integer> duplicates = stringList.stream().filter(str -> Collections.frequency(stringList,str)>1).collect(Collectors.toMap(str-> str, str->1,Integer::sum));
        Collections.sort(stringList);
        System.out.println(stringList);

        List<String> dupl = stringList.stream().filter( s -> Collections.frequency(stringList,s)>1).distinct().collect(Collectors.toList());
        Map<String, Integer> duplMap = stringList.stream().filter(s -> Collections.frequency(stringList,s)>1).collect(Collectors.toMap(s->s,s->1,Integer::sum));
        duplMap.forEach((k,v)-> System.out.println(k+" is repeated "+v+" times"));
        System.out.println(dupl);
        //Array reverse
        int[] arr = new int[]{7, 10, 4, 3, 20, 15};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        //Array to List
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        Integer[] revArray = list.toArray(new Integer[0]);
        //Arrays.stream(revArray).forEach(System.out::println);

        //Sorting Array
        //Arrays.stream(revArray).sorted().forEach(System.out::println);

        //kth Smallest Element , K=3
        int k = 4;
        List<Integer> intArray = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
        //System.out.println(intArray.get(k-1));

        //Count number of occurrences (or frequency) in a sorted array
        int x = 2;
        int Arr[] = {1, 1, 2, 2, 2, 2, 3};
        long repNum = Arrays.stream(Arr).filter(s -> s == x).count();
        //System.out.println(repNum);

        int[] testArray = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        Arrays.sort(testArray);
        for(int i : testArray){
            //System.out.print(i+" ");
        }
        //System.out.println(testArray);

        //Subarray with Given Sum //Count pairs with given sum
        int[] arrSum = new int[]{2, 10, 5, 3, 4,2,6};
        List<Integer> arrSumList = Arrays.stream(arrSum).boxed().collect(Collectors.toList());
        int sum=12; int checkSum=0; int temp =0; int count=0;
        for(int i=0;i<arrSumList.size();i++){
            checkSum = arrSumList.get(i);
            if(sum == checkSum){
                //System.out.println("Sum obs at index: "+arrSumList.get(i));
                //break;
            }
            for(int j=i+1;j<arrSumList.size();j++){
                temp = checkSum + arrSumList.get(j);
                if(sum == temp){
                    //System.out.println("Sum observed at "+arrSumList.get(i)+ " and "+arrSumList.get(j));
                    count++;
                }
                else {
                    temp= 0;
                }
            }
        }
        //System.out.println(count);

        //Program to cyclically rotate an array by one
        int arrCycle[] = {1, 2, 4, 5};
        int numT = 5;
        int[] newArrayC = cycleRotate(arrCycle);
        int[] secIter = cycleRotate(newArrayC);
        /*for(int z : newArrayC){
            System.out.print(z+" ");
        }*/


        //Find the Missing Number
        int arrMisNum[] = {3, 5, 6, 7,8};
        Arrays.sort(arrMisNum);
        int arrLen = arrMisNum.length+1;
        int[] newArray = new int[arrLen];
        newArray[0] = arrMisNum[0];
        int tempInt = arrMisNum[0];
        for(int i=1;i<arrLen;i++){
            newArray[i] = ++tempInt;
        }
        List<Integer> oldArr = Arrays.stream(arrMisNum).boxed().collect(Collectors.toList());
        List<Integer> compArr = Arrays.stream(newArray).boxed().collect(Collectors.toList());
        compArr.removeAll(oldArr);
        //System.out.println(compArr);


        //Find Duplicates of an Array
        int array[]={9, 4, 9, 6, 7, 4};
        List<Integer> orList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> rep = orList.stream().filter(s -> Collections.frequency(orList,s)>1).collect(Collectors.toList()).stream().distinct().collect(Collectors.toList());
        //System.out.println(rep);

        //Find the first repeating element in an array of integers
        //System.out.println(rep.get(0));


        //Find first non-repeating element in a given Array of integers
        int arrayTest[]={9, 4, 9, 6, 7, 4};
        List<Integer> listOri = Arrays.stream(arrayTest).boxed().collect(Collectors.toList());
        List<Integer> repeated = listOri.stream().filter(s -> Collections.frequency(orList,s)>1).collect(Collectors.toList());
        //System.out.println(rep);
        for(Integer i : repeated){
            listOri.remove(i);
        }
        //System.out.println(listOri.get(0));


        //Find Factorial

        int n = 4;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

    public static int[] cycleRotate(int[] arr){
        int[] newArr = new int[arr.length];
        newArr[0] = arr[arr.length-1];
        for(int i=1;i< arr.length;i++){
            newArr[i] = arr[i-1];
        }
        /*for(int z : newArr){
            System.out.print(z+" ");
        }*/
        return newArr;

    }
}

