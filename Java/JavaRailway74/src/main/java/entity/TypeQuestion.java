package entity;

public class TypeQuestion {
    public int typeId;
    public enum TypeName{
        ESSAY, MULTIPLE_CHOICE
    }
    public TypeName typeName;
    public Question[] questions;
}
