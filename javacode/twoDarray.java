package javacode;

import java.util.Scanner;
public class twoDarray {
    public static void main(String[]args){
        int a[][]=new int [2][2];
        System.out.println("enter the array elements:");
        Scanner scn=new Scanner (System.in);
       for (int i=0;i<2;i++){
        for (int j=0;j<2;j++){
            a[i][j]=scn.nextInt();
        }
       }
       System.out.println("Matrix elements are");{
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
       }
       System.out.println();
    }
}
    }
}