package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    public int accountId;
    public String email;
    public String userName;
    public String fullName;
    public Department department;
    public Position position;
    public LocalDate createDate;
    public Group[] groups;

    public Account() {
    }

    public Account(int i, Department department1, Group[] arrGroup){}
    public Account(int accountId, Department department, Position position){
        this.accountId = accountId;
        this.department = department;
        this.position = position;

    }

    public Account(int accountId, Position position) {
        this.accountId = accountId;
        this.position = position;
    }

    public Account(int accountId, Department department) {
        this.accountId = accountId;
        this.department = department;
    }

    public Account(int accountId, Group[] groups) {
        this.accountId = accountId;
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
