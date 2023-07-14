package entity;

public class Student {
    public int id;
    public String name;
    private static String college;
    private static int moneyGroup;
    public static int count = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public Student() {
    }

    public static int getMoneyGroup(int money) {

        return moneyGroup;
    }

    public static void setMoneyGroup(int money) {
        moneyGroup = money;
    }

    public static String getCollege() {
        return college;
    }
    public static void setCollege(String college) {
        Student.college = college;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' + ",  college:  "+ college+",   moneyGroup:  "+ moneyGroup+'}';
    }
}
