package flowControl;

import entity.*;

public class If {
    public static Department department1 = new Department("DEV");
    public static Department department2 = new Department("TEST");
    public static Position position1 = new Position(1, Position.PositionName.DEV);
    public static Position position2 = new Position(2, Position.PositionName.TEST);
    public static Account account1 = new Account(1, department1, position1);
    public static Account account2 = new Account(2, (Department) null, position2);
    //public static Account[] arrAccount = {account1, account2};

    public static Group group1 = new Group(1,"ABC");
    public static Group group2 = new Group(2, "ABD");
    public static Group group3 = new Group(3, "ABE");
    //public static Group[] arrGroup = {group1, group2, group3};
    public static GroupAccount groupAccount1 = new GroupAccount(1,1);
    public static GroupAccount groupAccount2 = new GroupAccount(2,2);
    public static GroupAccount groupAccount3 = new GroupAccount(3,2);

    public static GroupAccount[] arrGroupAccount = {groupAccount1,groupAccount2,groupAccount3};


    // Question1;
    public static void Question1(){
        if (account2.department == null){
            System.out.println(" Khong co phong ban ");
        } else {
            System.out.println(" Phong ban cua nhan vien nay la: "+ account1.department);
        }
    }
    //question2
    public static void Question2() {
        int count = 0;
        for (GroupAccount ga : arrGroupAccount) {
            if (ga.accountId == 2) {
                count++;
            }
        }
        switch (count) {
            case 0: {
                System.out.println("Nhân viên này chưa có group");
                break;
            }
            case 1: {
                System.out.println("Group của nhân viên" + "này là Java Fresher, C# Fresher");
                break;
            }
            case 2: {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            }
            case 3: {
                System.out.println("Nhân viên này là người \n quan trọng, tham gia nhiều group");
                break;
            }
            default: {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
            }
        }
    }
    public static void Question3(){
        System.out.println(account1.department == null ? "Nhân viên này chưa có phòng ban" : "Nhân viên này có phòng ban là: " + account1.department.departmentName);
    }
    // Question4
    public static void Question4(){
        System.out.println(account1.position.positionName.toString() == "DEV" ? "Đây là Develope": "Người này không phải là Developer");
    }
        public static void main (String[]args){
            Question1();
            System.out.println("---------------");
            Question2();
            System.out.println("---------------");
            Question3();
            System.out.println("---------------");
            Question4();
        }

}
