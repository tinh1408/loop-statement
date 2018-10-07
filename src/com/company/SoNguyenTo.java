package com.company;

import java.util.Scanner;

public class SoNguyenTo {
    public static void SoNguyenTo(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào một số n = ");
        n = scanner.nextInt();
        if(n>2) // nếu anh nhập vào số 5 thì nó sẽ kiểm tra lớn hơn 2 và in ra là không phải số nguyên tố, vậy chưa đúng rồi, em sửa lại chỗ này nhé
        {
            System.out.println(n + "is not a prime");
        }
        else
        {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(n + " is a prime");
            else
                System.out.println(n + " is not a prime");
        }
    }
}
