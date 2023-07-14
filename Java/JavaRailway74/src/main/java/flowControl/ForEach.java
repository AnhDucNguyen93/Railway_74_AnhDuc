package flowControl;

import entity.*;

public class ForEach {
    public static Department department1 = new Department("DEV");
    public static Department department2 = new Department("TEST");
    public static Department[] arrDep = {department1,department2};
    public static Position position1 = new Position(1, Position.PositionName.DEV);
    public static Position position2 = new Position(2, Position.PositionName.TEST);
    public static Account account1 = new Account(1, department1, position1);
    public static Account account2 = new Account(2, position2);
    public static Account[] arrAccount = {account1,account2};
    public static Group group1 = new Group(1,"ABC");
    public static Group group2 = new Group(2, "ABD");
    public static Group group3 = new Group(3, "ABE");
    public static GroupAccount groupAccount1 = new GroupAccount(1,1);
    public static GroupAccount groupAccount2 = new GroupAccount(2,2);
    public static GroupAccount groupAccount3 = new GroupAccount(1,2);
    public static GroupAccount groupAccount4 = new GroupAccount(3,1);
    public static GroupAccount[] arrGroupAccount = {groupAccount1,groupAccount2,groupAccount3, groupAccount4};

    public static void main(String[] args) {
        //Question8
        for (Account arrAc: arrAccount){
            System.out.println("Thông tin account thứ  " + arrAc.accountId );
            System.out.println("Email: "+ arrAc.email+ '\n'
                            + "Full name: "+ arrAc.fullName+ '\n'
                            + "Phòng Ban: "+ (arrAc.department ==null ? "khong co phong ban": arrAc.department.departmentName) );
        }
        //Question9
        for (Department dep: arrDep){
            System.out.println("ID: "+ dep.departmentId + "  Name: " + dep.departmentName);
        }
    }
}
