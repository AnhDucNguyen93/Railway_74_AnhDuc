package entity.exercise1;

public class Contestant {
    public  static int COUNT = 0;
    private int id;
    private String name;
    private String address;
    private int priority;
    private Block block;
    public int getId(){
        return id;
    }
    public Contestant( String name, String address, int priority, Block block) {
        COUNT ++;
        this.id = COUNT;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.block = block;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "soBaoDanh=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                ", block=" + block.getName() +
                ", Subject="+ block.getSubject()+
                '}';
    }
}
