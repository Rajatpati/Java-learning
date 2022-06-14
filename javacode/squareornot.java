package javacode;
import java.util.Scanner;
public class squareornot {
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the value of length:");
    float a=scn.nextFloat();
    System.out.println("Enter the value of breadth:");
    float b=scn.nextFloat();
    if (a==b) {
        System.out.println("It is a Square");
    }
    else {
        System.out.println("It is a Rectange");
    }   
}
}
