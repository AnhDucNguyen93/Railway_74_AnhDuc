package backEnd;

import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondrtStudent;
import entity.Student;

import java.util.Scanner;

public class Exercise1 {
    Student student1 = new Student(1, "Nguyen Van A");
    Student student2 = new Student(2, "Nguyen Van C");
    Student student3 = new Student(3, "Nguyen Van B");
    Student[] students = {student1,student2,student3};

    //Question1
    public void Question1(){
        Student.setCollege("Dai hoc bach khoa");
        for (Student arrStudent: students){
            System.out.println(arrStudent);
        }
        System.out.println("------------");

        Student.setCollege("Dai hoc Cong Nghe");
        for (Student arrStudent: students){
            System.out.println(arrStudent);
        }
        //Question5
        System.out.println("Tong sinh vien sinh ra:  "+ Student.count );
    }
    //Question2
    public  void Question2(){
        System.out.println("Cac sinh vien nop 100k");
        Student.setMoneyGroup(100);
        int sum = 100*students.length;
        System.out.println("Tong quy la:  "+ sum);

            System.out.println(" Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
            System.out.println("Tong quy:  "+ (sum-=50));
            System.out.println("--------------------");
            System.out.println(" Student thứ 2 lấy 20k đi mua bánh mì");
            System.out.println("Tong quy:  "+ (sum-=20));
            System.out.println("--------------------");
            System.out.println(" Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
            System.out.println("Tong quy:  "+ (sum-=150));
            System.out.println("--------------------");
            System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
            System.out.println("Tong quy:  "+ (sum+=50*students.length));
    }
    public void Question3(){
        //MyMath myMath = new MyMath();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();

        int minAb = Math.min(5,7);
        System.out.println("Min:  "+ Math.min(a,b));
        System.out.println("------------");
        System.out.println("Tong a va b:   "+ (a+b) );
    }
    //Question6
    public  void Question6(){
        PrimaryStudent primaryStudent1 = new PrimaryStudent(3, "Nguyen Van E");
        PrimaryStudent primaryStudent2 = new PrimaryStudent(4, "Nguyen Van G");
        PrimaryStudent[] primaryStudents = {primaryStudent1,primaryStudent2};
        Student.setCollege("Dai hoc xay dung");
        for (PrimaryStudent arrPrimaryStudents: primaryStudents){
            System.out.println(arrPrimaryStudents);
            System.out.println("So thu tu PrimaryStudent:  "+ PrimaryStudent.primaryCount );
        }
        SecondrtStudent secondrtStudent1 = new SecondrtStudent(5,"Nguyen Van E");
        SecondrtStudent secondrtStudent2 = new SecondrtStudent(6,"Nguyen Van E");
        SecondrtStudent secondrtStudent3 = new SecondrtStudent(7,"Nguyen Van E");
        SecondrtStudent secondrtStudent4 = new SecondrtStudent(8,"Nguyen Van E");
        SecondrtStudent[] secondrtStudents = {secondrtStudent1,secondrtStudent2,secondrtStudent3,secondrtStudent4};
        for (SecondrtStudent arrSecon: secondrtStudents){
            System.out.println(arrSecon);
            System.out.println("So thu tu SecondrtStudent:  "+ SecondrtStudent.secondrtCount );
        }

        System.out.println("Tong so SV:  "+ PrimaryStudent.count);
    }
    //Question8

}
