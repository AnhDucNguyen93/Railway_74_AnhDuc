package com.vti;

import java.time.LocalDate;

public class DefaultValue {
//    Account account1 = new Account();
    public static void Question1() {
        Account[] accounts = new Account[5];
        for (int i =0; i<accounts.length; i ++){
            int thutu = i+1;
        accounts[i] = new Account("Email "+thutu, "userName"+thutu,"fullName"+thutu,LocalDate.now());

        System.out.println("Thông tin Account " + thutu + " Email: " +
                    accounts[i].email + " UserName: " + accounts[i].userName
                    + " FullName: " +
                    accounts[i].fullName + " CreateDate: " + accounts[i].createDate);
        }
    }
    public static void main(String[] args) {
        Question1();
    }
}
