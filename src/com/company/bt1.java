package com.company;
//in ra dãy số 1 2 4 7 11 16 32 39 47 56 66
import java.util.Scanner;

public class bt1 {
    public static void bt1(){
        int so =1;
        for(int i = 1; i <= 11 ; i++)
        {
            System.out.println(so);
            if(i==2){
                System.out.println(+so );
                so = so*2;
                continue;
            }
            so=so+i;
        }
    }
}
