package javacode;
import java.util.Scanner;
public class multipleoffive {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scn.nextInt();
        if (a%5==0){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
    }
}
