package entity;

import java.util.Arrays;

public class Department {
    public int departmentId;
    public String departmentName;
    public Account[] accounts;
    public  Department(){

    }
    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
