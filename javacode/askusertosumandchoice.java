package javacode;
import java.util.Scanner;
public class askusertosumandchoice {
  public static void main(String[]args){
     Scanner scn=new Scanner(System.in);
     char choice;
    do{
        System.out.println("Enter fast number:");
        int num1=scn.nextInt();
        System.out.println("Enter second number");
        int num2=scn.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
        System.out.println("Do you want to continue y/n ?");
        choice =scn.next().charAt(0);
        System.out.println();
    }while (choice=='y'||choice=='Y');
    }  
}
