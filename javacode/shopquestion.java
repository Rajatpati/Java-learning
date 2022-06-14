package javacode;
import java.util.Scanner;
public class shopquestion {
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
		System.out.println("Enter the quantity of the product");
		int x=scn.nextInt();
		int a=100;
		if (a*x>=10000){
			System.out.print("The discount amount is "+(.1*x*100)+
					"and the total payable amount is " +(x*a-(.1*x*100)));
		}else {
			System.out.println("no discount");
		}
    }
    
}
