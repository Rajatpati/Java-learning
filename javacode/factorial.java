package javacode;
import java.util.Scanner;
    public class factorial {
        public static void main(String[]args){
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter the number");
            int i=scn.nextInt();
            int fact=1;
            for (int a=1;a<=i;a++){
              fact=fact*a;
              
            }
            System.out.println(fact);
        }
    }