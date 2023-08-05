package entity.exercise1;

import abstraction.exercise1.ITuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<Contestant> contestantArrayList;
    private Scanner scanner;

    public TuyenSinh(){
        scanner = new Scanner(System.in);
        contestantArrayList = new ArrayList<Contestant>();
    }

    @Override
    public void addContestant() {
        System.out.println("NHap ten thi sinh: ");
        String name = scanner.nextLine();
        System.out.println("NHap dia chi thi sinh: ");
        String address = scanner.nextLine();
        System.out.println("NHap muc uu tien thi sinh: ");
        int prortity = scanner.nextInt();
        System.out.println("NHap Khoi thi sinh chon: A B C ");
        scanner.nextLine();
        String block = scanner.nextLine();
        Contestant contestant = new Contestant(name,address,prortity,new Block(block));
        contestantArrayList.add(contestant);
    }
    @Override
    public void showInfoContestant() {
        for (Contestant contestants: contestantArrayList){
            System.out.println(contestants);
        }
    }

    @Override
    public void findByIdNum(int id) {
        for (Contestant contestants: contestantArrayList){
            if (contestants.getId()==id){
                System.out.println(contestants);
            }
        }
    }
}
