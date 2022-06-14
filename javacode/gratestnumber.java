package javacode;
import java.util.Scanner;
public class gratestnumber {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int x=scn.nextInt();
		System.out.println("Enter 2nd  number :");
		int y=scn.nextInt();
		if (x>y) {
			System.out.println("The greatest number is :"+x);
		}else {
			System.out.println("The greatest number is :"+y);
		}
    }
    }
    

