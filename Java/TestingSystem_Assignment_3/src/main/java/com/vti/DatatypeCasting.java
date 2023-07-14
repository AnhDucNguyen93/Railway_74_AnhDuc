package com.vti;

import java.util.Random;
import java.util.Scanner;

public class DatatypeCasting {
    public static void Question1() {
        float luong1 = 5240.5F;
        float luong2 = 10970.055F;
        int luong11 = (int) luong1;
        int luong22 = (int) luong2;
        System.out.println(luong11 + " vs " + luong22);
    }

    //Question 2
    public static void Question2() {
        Random random = new Random();
       // random.nextInt(100000);
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(100000);
           // System.out.printf("So conver: %s \n", covertInto5(a));
            System.out.printf("So conver: %s \n", covertInto5s(a));
        }
    }
    public static void Question3(){
        Random random = new Random();
        // random.nextInt(100000);
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(100000);
            // System.out.printf("So conver: %s \n", covertInto5(a));
            System.out.println("Hai so cuoi   :" + covertInto5s(a).substring(3));
        }
    }
    public static void Question4(){
        int a,  b ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHap a:  ");
        a = scanner.nextInt();

        while (true){
            System.out.print("NHap b:  ");
            b = scanner.nextInt();
            if (b ==0) {
                System.out.print("Vui long nhap b khac 0  ");
                continue;
            }
            System.out.println("Thuong:   "+ (float)a/b);
            break;
        }
    }
    public static void Question4s(){
        int a,  b ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHap a:  ");
        a = scanner.nextInt();

        while (true){
            System.out.print("NHap b:  ");
            b = scanner.nextInt();
            if (b !=0) {
                System.out.println("Thuong:   "+ (float)a/b);
                return;
            }
            System.out.print("Vui long nhap b khac 0  ");
            continue;
        }
    }
    public static void Question4s2(){
        int a,  b ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHap a:  ");
        a = scanner.nextInt();

        do {
            System.out.print("NHap b:  ");
            b = scanner.nextInt();
            if (b ==0) {
                System.out.print("Vui long nhap b khac 0  ");
            }
        } while (b==0);
        System.out.println("Thuong:   "+ (float)a/b);

    }
    // Convert Question2
        public static String covertInto5(int a){
            if (a < 10) {
                return "0000" + a;
            }
            if (a < 100 && a > 9) {
                return "000" + a;
            }
            if (a < 1000 && a > 99) {
                return "00" + a;
            }
            if (a < 10000 && a > 999) {
                return "0" + a;
            }
            if (a < 100000 && a > 9999) {
                return String.valueOf(a);
            }
            return "Khong phai là so tu 1 den 99999";
        }
    public static void Question2s() {
        Random random = new Random();
        // random.nextInt(100000);
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(100000);
                if (a < 10) {
                    System.out.println("0000" + a);
                }
                if (a < 100 && a > 9) {
                    System.out.println("000" + a);
                }
                if (a < 1000 && a > 99) {
                    System.out.println("00" + a);
                }
                if (a < 10000 && a > 999) {
                    System.out.println("0" + a);
                }
                if (a < 100000 && a > 9999) {
                    System.out.println("" + a);
                }
                if (a >= 100000) {
                    System.out.println(a +"   Khong phai là so tu 1 den 99999");
                }
        }
    }
    public static String covertInto5s(int a){
        if (String.valueOf(a).length()==1) {
            return "0000" + a;
        }
        if (String.valueOf(a).length()==2) {
            return "000" + a;
        }
        if (String.valueOf(a).length()==3) {
            return "00" + a;
        }
        if (String.valueOf(a).length()==4) {
            return "0" + a;
        }
        if (String.valueOf(a).length()==5) {
            return String.valueOf(a);
        }
        return "Khong phai là so tu 1 den 99999";
    }
    public static void main(String[] args) {
        //Question2s();
        //Question2();
        //Question3();
        Question4s();

    }
}


