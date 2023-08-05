package backEnd.exercise1;

import entity.exercise1.TuyenSinh;

import java.util.Scanner;

public class Exer1Que2 {
    private TuyenSinh tuyenSinh;
    private Scanner sc ;
    public void Question2(){
        tuyenSinh = new TuyenSinh();
        sc = new Scanner(System.in);
        loadMenu();
    }
    private void loadMenu(){
        while (true) {
            System.out.println("===================================================== ==================");
            System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
            System.out.println("=== 1. Insert Contestant. ===");
            System.out.println("=== 2. View Contestant. ===");
            System.out.println("=== 3. Find by idNum Contestant . ===");
            System.out.println("=== 4. Exit. ===");
            System.out.println("===================================================== ==================");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    tuyenSinh.addContestant();
                    break;
                case 2:
                    tuyenSinh.showInfoContestant();
                    break;
                case 3:
                    System.out.println("Nhap id can tim kiem:  ");
                    int id = sc.nextInt();
                    tuyenSinh.findByIdNum(id);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Ban hay chon dung so!!");
                    break;
            }
        }
    }

}
