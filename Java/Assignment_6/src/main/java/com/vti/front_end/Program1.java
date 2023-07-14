package com.vti.front_end;

import com.vti.backend.Exercise1;

public class Program1 {
    public static void Question1(){
        int[] numbers = { -1, 1, 3, 5, -5, -8 };
       // Exercise1 debug = new Exercise1();
        int getmaxNumber = Exercise1.getMaxValue(numbers);
        int getminNumber = Exercise1.getMinValue(numbers);
        System.out.println("Nax Value:  "+ getmaxNumber);
        System.out.println("Nax Value:  "+ getminNumber);

    }
    public static void Question2(){
        Exercise1 exercise1 = new Exercise1();
        exercise1.question1_2();
    }

    public static void main(String[] args) {

        //Question1();
        Question1();
    }
}
