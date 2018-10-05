package com.company;

import java.util.Scanner;

public class hinh {
    public static void hinh(){
        char tiepTuc;
        do{
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println(" Nhập vào lựa chọn");
        n = scanner.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Print the rectangle");
                int weight;
                int height;
                System.out.println("Nhập vào chiều rộng HCN : ");
                weight = scanner.nextInt();
                System.out.println("Nhập vào chiều dài HCN");
                height = scanner.nextInt();
                for(int i =1 ; i<=height ; i++){
                    for(int j=1;j<=weight;j++)
                        System.out.print("*");
                        System.out.println("");}
                break;
            case 2:
                int t,h;
                System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                System.out.println("1.In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                System.out.println("2.In hình tam giác vuông, có cạnh góc vuông ở top-left ");
                System.out.println("Nhập lựa chọn t = ");
                t=scanner.nextInt();
                System.out.println("Nhập vào 1 cạnh của tam giác ");
                h = scanner.nextInt();
                if(t==1)
                {
                    for(int i=1;i<=h;i++){
                        for(int j=1;j<=i;j++)
                            System.out.print("*");
                            System.out.println("");}
                }
                else if(t==2)
                {
                    int i,j;
                    for(i=h;i>=1;i--){
                        for(j=1;j<=i;j++)
                            System.out.print("*");
                            System.out.println("");}
                }
                else{
                    System.out.println("định dạng vừa nhập ko đúng");}
                    break;
            case 3:
                System.out.println("3.Print isosceles triangle");
                System.out.println("Nhập vào độ cao l : ");
                int l;
                l = scanner.nextInt();
                for(int i=0;i<=l-1;i++)
                {
                    for(int j=0;j<=l+i-1;j++)
                    {
                        if(j<(l-1-i))
                            System.out.print("   ");
                        else
                            System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.out.println("Exit");
                break;
        }
            System.out.println(" DONE !");
            System.out.println("Bạn có muốn tiếp tục (yes or no");
            tiepTuc = scanner.next().charAt(0);}
        while (tiepTuc == 'y');
    }
}
