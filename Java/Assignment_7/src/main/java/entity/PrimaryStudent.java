package entity;

public class PrimaryStudent extends Student{
    public static int primaryCount =0;
    public PrimaryStudent() {
        super();
       primaryCount++;
    }

    public PrimaryStudent(int id, String name) {
        super(id, name);
        primaryCount++;
    }

    @Override
    public String toString() {
        return "PrimaryStudent{" +
                "id=" + id +
                ", name='" + name +",  " + getCollege()+
                "} " ;
    }
}
