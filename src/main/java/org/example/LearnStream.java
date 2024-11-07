package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {
    public static void main(String[] args) {

        //String Operations

        String str = "Marayuuyr";

        // String to List
        List<?> list = str.chars().mapToObj(s -> (char)s).toList();
        System.out.println(list);
        //Map<Object,Integer> countMap = list.stream().filter( s -> list.indexOf(s) != list.lastIndexOf(s)).collect(Collectors.toMap(s->s,s->1,Integer::sum));
        Map<Object,Integer> countMap = list.stream().filter( s -> Collections.frequency(list,s)>1).collect(Collectors.toMap(s->s, s->1,Integer::sum));
        System.out.println(countMap);

        // Two Lists to Map



    }
}
