package javacode;
import java.util.Scanner;
public class positiveornegative {
    public static void main(String[]args ){
        System.out.println("enter the number :");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if (a>0){
            System.out.println("Its a positive number ");
        }
        else if(a<0){
            System.out.println("Its a negative number");
        }
        else{
            System.out.println("Its neutral");

        }
    }
    
}
