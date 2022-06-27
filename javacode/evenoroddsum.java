package javacode;
import java.util.Scanner;
public class evenoroddsum{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        char choice;
        int num;
        do {
            System.out.print("enter number :");
             num=scn.nextInt();
            if (num%2==0){
                evensum=evensum+num;
            }else{
                oddsum=oddsum+num;
            }
            System.out.print("Enter your choice ");
            choice =scn.next().charAt(0);/
        }
        while (choice =='y' || choice =='Y');
        System.out.println("The sum of even is :"+evensum);
        System.out.println("The sum of odd is :"+oddsum);
    

    }
    
}