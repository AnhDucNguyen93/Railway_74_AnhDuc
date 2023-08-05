package backEnd.exercise1;

import entity.exercise1.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    private Scanner scanner;
    private ArrayList<News> listNew;
    public void Question1(){
        scanner = new Scanner(System.in);
        listNew = new ArrayList<News>();
        loadMenu();
    }
     private void loadMenu(){
        while (true){
            System.out.println("Lua chon cac chung nang muon su dung:  ");
            System.out.println("------- 1. Insert News ------------  ");
            System.out.println("------- 2. View list news---------- ");
            System.out.println("------- 3. Average rate ------------  ");
            System.out.println("------- 4. Exit--------------------");

            int menuChoose = scanner.nextInt();
            switch (menuChoose){
                case 1:
                    System.out.println("Nhap vao Title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Nhap vao PublishDate: ");
                    String publishDate = scanner.nextLine();
                    System.out.println("Nhap vao Author:  ");
                    String author = scanner.nextLine();
                    System.out.println("NHap vao Conten:  ");
                    String conten = scanner.nextLine();

                    System.out.println("Nhập vào đánh giá 1");
                    int rate1 = scanner.nextInt();
                    System.out.println("Nhập vào đánh giá 2");
                    int rate2 = scanner.nextInt();
                    System.out.println("Nhập vào đánh giá 3");
                    int rate3 = scanner.nextInt();
                    int[] rates = {rate3,rate1,rate2};
                    News news = new News(title,publishDate,author,conten,rates);
                    listNew.add(news);
                    break;
                case 2:
                    for (News news1: listNew){
                        news1.display();
                    }
                    break;
                case 3:
                    System.out.println("Danh gia trung binh");
                    for (News news2: listNew){
                        System.out.println("Title: " + news2.getTitle()
                                + " RateAVG: " + news2.calculate());}
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Alarm: Lựa chọn đúng số trên menu");
                    break;
            }
        }
     }
}
