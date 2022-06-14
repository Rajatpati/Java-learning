package javacode;
import java.util.Scanner;
public class dowhileonetoten {
    public static void main(String[]args){
        int a;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number :");
		a=scn.nextInt();
		do {
			System.out.println(a);
			a++;
		}
		while (a<=10);
    }
}
