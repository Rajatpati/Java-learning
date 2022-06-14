package javacode;

import java.util.Scanner;
public class ifstatement {
    public static void main(String []args ){
    try (Scanner scn = new Scanner (System.in)) {
        System.out.println("Enter the password ");
        int i=scn.nextInt();
        if (i==2021) {
             System.out.println("Open to the System");}
    }
    }
}
