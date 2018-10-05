package com.company;

import java.util.Scanner;

public class money {
    public static void money(){
        double money;//không hiểu lý do dùng double ở đây ?
        int months;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào số tiền gữi : ");
        money = scanner.nextDouble();
        System.out.println("Nhập vào số tháng : ");
        months = scanner.nextInt();
        System.out.println("Nhập vào tỉ lệ lãi suất : ");
        interset_rate = scanner.nextDouble();
        if ( money>0&&months>0&&interset_rate>0)
        {
            double tong_interset =0;
            for (int i =1;i<months;i++)
            {
                tong_interset = (money*interset_rate)/12*months;
            }
            System.out.println("Tiền là : " + tong_interset );
        }
        else
        {
            System.out.println("Định dạng vừa nhập không hợp lệ");
        }
    }
}