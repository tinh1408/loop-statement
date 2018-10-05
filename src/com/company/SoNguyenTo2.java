package com.company;

import java.util.Scanner;

public class SoNguyenTo2 {
    public static void SoNguyenTo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n;
        int i;
        int j;
        int dem=0;
        n = scanner.nextInt();
        for(i=2;i<=n;i++)
        {
            for(j=1; j<=i;j++)
            {
                if(i%j==0)
                dem++;
            }
            if(dem==2)
                System.out.println(i);
            dem=0;
        }


    }
}
