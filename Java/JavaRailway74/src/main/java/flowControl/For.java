package flowControl;

import entity.*;

public class For {
    public static Department department1 = new Department("DEV");
    public static Department department2 = new Department("TEST");
    public static Department[] arrDep = {department1, department2};
    public static Position position1 = new Position(1, Position.PositionName.DEV);
    public static Position position2 = new Position(2, Position.PositionName.TEST);
    public static Account account1 = new Account(1, department1, position1);
    public static Account account2 = new Account(2, position2);
    public static Account[] arrAccount = {account1, account2};
    public static Group group1 = new Group(1, "ABC");
    public static Group group2 = new Group(2, "ABD");
    public static Group group3 = new Group(3, "ABE");
    public static GroupAccount groupAccount1 = new GroupAccount(1, 1);
    public static GroupAccount groupAccount2 = new GroupAccount(2, 2);
    public static GroupAccount groupAccount3 = new GroupAccount(1, 2);
    public static GroupAccount groupAccount4 = new GroupAccount(3, 1);
    public static GroupAccount[] arrGroupAccount = {groupAccount1, groupAccount2, groupAccount3, groupAccount4};

    public static void  Question10(){
        for (int i = 0; i < arrAccount.length; i++) {
            int thutu = i +1;
            System.out.println("Thông tin account thứ  " + thutu);
            System.out.println("Email: " + arrAccount[i].email + '\n'
                    + "Full name: " + arrAccount[i].fullName + '\n'
                    + "Phòng Ban: " + (arrAccount[i].department == null ? "khong co phong ban" : arrAccount[i].department.departmentName));
        }
    }
    public static void Question11(){
        for (int i = 0; i< arrDep.length; i++){
            int thutu = i+1;
            System.out.println("Thong tin department thu" + thutu + "la: ");
            System.out.println("Id: " + arrDep[i].departmentId + '\n'
                                + "Name: " + arrDep[i].departmentName);
        }
    }
    //Question12
    public static void Question12(){
//        int count = 0;
//        for (Department ade: arrDep) {
//            if (count < 2) {


                for (int i = 0; i < arrAccount.length; i++) {
                    int thutu = i + 1;
                    int count = 0;
                    for (Department ade: arrDep) {
                        if (count > 0) {
                            break;}
                    if (arrAccount[i].department != null && arrAccount[i].department.departmentId == ade.departmentId) {
                        System.out.println("Thông tin account thứ  " + thutu);
                        System.out.println("Email: " + arrAccount[i].email + '\n'
                                + "Full name: " + arrAccount[i].fullName + '\n'
                                + "Phòng Ban: " + (arrAccount[i].department == null ? "khong co phong ban" : arrAccount[i].department.departmentName));
                    }
                            count++;
                }
//               count++;
            }
        }
        public static void Question20(){
            for (int i =0; i<=20; i++){
                if (i%2==0){
                    System.out.println("So chan i la  :"+ i);
                }
            }
        }


    public static void main(String[] args) {
        //Question10();
        //Question11();
//        Question12();
        Question20();

        //System.out.println(arrAccount.length);
//        int[] poin = {1,2,3,4,5};
//        System.out.println(poin[0]);
    }
}

