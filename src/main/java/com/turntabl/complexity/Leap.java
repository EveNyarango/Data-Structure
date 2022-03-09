package com.turntabl.complexity;

public class Leap {

    public boolean isLeapYear( int year){
        return(year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
    }

    public int arraySum(int[] array){
        int sum = 0;

        for(int i = 0; i <array.length; i++){
            sum += array[i];
        }
        return sum;
    }


    public static boolean hasDuplicateValue(){
        int[] array = {2, 4,2, 5, 6,7};
        int[] existingNumbers = new int[6];

        for(int i = 0; i < array.length; i++){
            if(existingNumbers[array[i]] == 1){
                System.out.println("true");
                return true;

            }else{
                existingNumbers[array[i]] = 1;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        hasDuplicateValue();
    }
}
