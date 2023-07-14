package entity;

public class SecondrtStudent extends Student {
    public static int secondrtCount=0;
    public SecondrtStudent() {
        super();
        secondrtCount++;
    }

    public SecondrtStudent(int id, String name) {
        super(id, name);
        secondrtCount++;
    }

    @Override
    public String toString() {
        return "SecondrtStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "} " + getCollege();
    }
}
