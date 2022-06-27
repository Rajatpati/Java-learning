package javacode;
import java.util.Scanner;
public class primeornotpositivenumber {
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=scn.nextInt();
    boolean result=true;
    for (int i=2;i<num;i++){
        if(num%2==0){
           result=false;
        }   
     }
    if (result&&num>1){
        System.out.println("The number is prime");
    }else{
        System.out.println("The number is not prime");
    }
}
}