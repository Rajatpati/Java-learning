package javacode;
import java.util.Arrays;
import java.util.Scanner;
public class sortedarray {
    public static void main(String[]args){
        int a[]=new int [5];
        System.out.println("enter the array elements :");
        Scanner scn=new Scanner(System.in);
        for (int i=0;i<5;i++){
            a[i]=scn.nextInt();
        }
        Arrays.sort(a);
        System.out.print("sorted elements are :");
    for (int b: a){
        System.out.print(b+ " ");
    }
    
}
}
