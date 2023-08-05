package entity.exercise1;

public class Block {
    private String name;
    private String subject;
    public Block(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getSubject() {
        switch (this.name){
            case "A":
                this.subject = "Toan, Ly, Hoa";
                break;
            case "B":
                this.subject = "Toan, Sinh, Hoa";
                break;
            case "C":
                this.subject = "Van, Su, Dia";
                break;
        }
        return subject;
    }
}
