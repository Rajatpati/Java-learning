package javacode;

import java.util.Scanner;
public class evenoroddwhile {
    public static void main(String[]args){
        int a;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number :");
		a=scn.nextInt();
		while (a>0) {
			if (a%2==0){
				System.out.println("Even number ");
				break;
			}else {
				System.out.println("Odd Number ");
				break;
			}
			} 
    }
    
}
