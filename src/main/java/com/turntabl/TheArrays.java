package com.turntabl;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "green";
        colors[1] = "yellow";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[2]);

//        or
        int[] numbers = {100,200};

//        looping
//        for (int i = 0; i < colors.length;i++){
//            System.out.println(colors[i]);
//        }

//        reverse print
        for (int i = colors.length -1; i>=0;i--){
            System.out.println(colors[i]);
        }

//        enhance loop
        for (int number: numbers){
            System.out.println(number);
        }
//        streams
        Arrays.stream(numbers).forEach(System.out::println);

    }


}
