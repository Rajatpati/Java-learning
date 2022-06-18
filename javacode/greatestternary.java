package javacode;
import java.util.Scanner;
public class greatestternary {
     public static void main(String[]args){
        int a,b,c;
          Scanner scn=new Scanner(System.in);
        System.out.println("Enter three nuber");
        a=scn.nextInt();
        b=scn.nextInt();
        c=scn.nextInt();
      int r= (a>b)?(a>c?a:c):(b>c?b:c);
      System.out.println("The greatest number is "+r);
    }
}
