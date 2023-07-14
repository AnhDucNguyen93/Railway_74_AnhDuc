package flowControl;

import entity.*;

public class SwitchCase {
    public static Department department1 = new Department("DEV");
    public static Department department2 = new Department("TEST");
    public static Position position1 = new Position(1, Position.PositionName.DEV);
    public static Position position2 = new Position(2, Position.PositionName.TEST);
    public static Account account1 = new Account(1, department1, position1);
    public static Account account2 = new Account(2, (Department) null, position2);

    public static Group group1 = new Group(1,"ABC");
    public static Group group2 = new Group(2, "ABD");
    public static Group group3 = new Group(3, "ABE");
    public static GroupAccount groupAccount1 = new GroupAccount(1,1);
    public static GroupAccount groupAccount2 = new GroupAccount(2,2);
    public static GroupAccount groupAccount3 = new GroupAccount(1,2);
    public static GroupAccount groupAccount4 = new GroupAccount(3,1);
    public static GroupAccount[] arrGroupAccount = {groupAccount1,groupAccount2,groupAccount3, groupAccount4};

    //Question5
   public static void Question5(){
       int count = 0;
       for (GroupAccount aG: arrGroupAccount){
           if (group1.groupId == aG.groupId){
               count++;
           }
       }
       switch (count){
           case 1:{
               System.out.println("Nhóm có một thành viên");
               break;
           }
           case 2:{
               System.out.println("Nhóm có hai thành viên");
               break;
           }
           case 3:{
               System.out.println("Nhóm có ba thành viên");
               break;
           }
       }
   }
    //Question6
    public static void Question6(){
       int count = 0;
       for (GroupAccount aG : arrGroupAccount) {
           if (account2.accountId == aG.accountId) {
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
    //Question7
    public static void Question7(){
       String positionName = account1.position.positionName.toString();
       switch (positionName){
           case "DEV":{
               System.out.println("Đây là Developer");
               break;
           }
           default:{
               System.out.println("Người này không phải Developer");
               break;
           }
       }
    }
    public static void main(String[] args) {
        Question5();
        Question6();
        Question7();
    }
}
