package javacode;
import java.util.Scanner;
public class eligibleforvote {
    public static void main(String[]args ){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=scn.nextInt();
        while(a>0){
        if (a>=18){
            System.out.println("You are eligible for voteing");
            break;
        }else{
            System.out.println("You are not eligible for voteing");
            break;
        }
    }
}
}
