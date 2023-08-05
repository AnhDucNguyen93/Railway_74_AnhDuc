package com.vti.backend;

import com.vti.entity.QLCB;

import java.util.Scanner;

public  class Exercise1 {
    // Question1
        public static int getMaxValue(int[] numbers) {
            int maxValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                }
            }
            return maxValue;
        }

        public static int getMinValue(int[] numbers) {
            int minValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
            }
            return minValue;
        }
        //Question2
    public void question1_2() {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        do {
            System.out.println("Mời bạn nhập vào chức năng muốn dùng\n" + "1.Thêm mới cán bộ\n" + "2.Tìm kiếm theo họ tên\n"
                    + "3.Hiện thị thông tin về danh sách các cán bộ.\n" + "4.Nhập vào tên của cán bộ và delete cán bộ đó\n"
                    + "5.Thoát khỏi chương trình.");
            System.out.print("Mời bạn chọn chức năng: ");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    qlcb.addCanBo();
                    System.out.println("Chon 1 de tiep tuc nhap----- Chon 2 de thoat...");
                    int choose1 = scanner.nextInt();
                   if (choose1==1){
                       break;
                   }
                   return;
                case 2:
                    qlcb.findByName();
                    return;
                case 3:
                    qlcb.printListCanBo();
                    return;
                case 4:
                    qlcb.deleteCanBo();
                    return;
                case 5:
                    return;
                default:
                    System.out.println("Bạn đã nhập sai. Bạn chỉ được nhập từ 1 tới 5 thôi!\n");
                    break;
            }
        }
        while (true);
    }
}

