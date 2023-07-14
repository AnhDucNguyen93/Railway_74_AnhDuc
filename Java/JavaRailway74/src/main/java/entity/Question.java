package entity;

import java.time.LocalDate;

public class Question {
    public int questionId;
    public String content;
    public CategoryQuestion categoryQuestion;
    public TypeQuestion typeQuestion;
    public Account creatorId;
    public LocalDate createDate;
    public Answer[] answers;
    public Exam[] exams;
}
