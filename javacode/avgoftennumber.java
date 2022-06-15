package javacode;
import java.util.Scanner;
public class avgoftennumber {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    System.out.println("enter first number:");
    int a=scn.nextInt();
    System.out.println("enter second number:");
    int b=scn.nextInt();
    System.out.println("enter third number:");
    int c=scn.nextInt();
    System.out.println("enter fifth number:");
    int d=scn.nextInt(); 
    System.out.println("enter sixth number:");
    int e=scn.nextInt();
    System.out.println("enter seventh number:");
    int f=scn.nextInt(); 
    System.out.println("enter eightth number:");
    int g=scn.nextInt(); 
    System.out.println("enter nineth number:");
    int h=scn.nextInt(); 
    System.out.println("enter tenth number:");
    int i=scn.nextInt(); 
    int sum =(a+b+c+d+e+f+g+h+i);
    int avg=(sum/10);
 System.out.println("The avarage is :"+ avg);
    }
 } 
