package com.vti;

import java.time.LocalDate;

public  class Account {
    String email;
    String userName;
    String fullName;
    LocalDate createDate;
    public Account(){}

    public Account(String email, String userName, String fullName, LocalDate createDate) {
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.createDate = createDate;
    }

    public static void Question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account acc = new Account();
            accounts[i] = acc;
            int thutu = i + 1;
            acc.email = "Email " + thutu;
            acc.userName = "userName" + thutu;
            acc.fullName = "fullName" + thutu;
            acc.createDate = LocalDate.now();

            System.out.println("Thông tin Account " + thutu + " Email: " +
                    acc.email + " UserName: " + accounts[i].userName
                    + " FullName: " +
                    accounts[i].fullName + " CreateDate: " + accounts[i].createDate);
        }
    }

    //Chay di em
        public static void Question1s() {
        //Đây mới chỉ là khởi tạo mảng Account. Nhưng các instance của nó em chưa khởi tạo mà.
            Account[] accounts1 = new Account[5];
            for (int i =0; i<accounts1.length; i ++){
                int thutu = i+1;
                accounts1[i] = new Account();
                accounts1[i].email = "Email "+thutu;
                //Dang loi o dong nay
                accounts1[i].userName = "userName"+thutu;
                accounts1[i].fullName = "fullName"+thutu;
                accounts1[i].createDate = LocalDate.now();

                System.out.println("Thông tin Account " + thutu + " Email: " +
                        accounts1[i].email + " UserName: " + accounts1[i].userName
                        + " FullName: " +
                        accounts1[i].fullName + " CreateDate: " + accounts1[i].createDate);
            }
    }

    public static void main(String[] args) {
        Question1s();
    }
}

