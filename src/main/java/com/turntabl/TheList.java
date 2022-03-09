package com.turntabl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {

        List<String> immutableList = List.of("aqua", "peach", "orange");
        System.out.println(immutableList);
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("pink");
        System.out.println(colors);

        for (String color : colors){
            System.out.println(color);
        }

//        or
        colors.forEach(System.out::println);
        System.out.println("========");

//        or
       for(int i = 0; i< colors.size();i++){
           System.out.println(colors.get(i));
       }

    }
}
