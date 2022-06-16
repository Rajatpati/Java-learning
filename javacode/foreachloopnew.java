package javacode;
import java.util.Scanner;
public class foreachloopnew {
    public static void main(String[]args){
        int a[]=new int [5];
        System.out.println("Enter the array elements :");
        Scanner scn=new Scanner(System.in);
        for (int i=0;i<5;i++){
            a[i]=scn.nextInt();
        }
        System.out.print("The array elements are :");
        for (int b : a){
            System.out.print(b+" ");
        }
    }
}
