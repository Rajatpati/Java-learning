package javacode;
import java.util.Scanner;
public class calculatoruseingswitch {
    public static void main(String[]args){
        int a,b,c,ch;
        System.out.println("Enter two number");
        Scanner scn=new Scanner(System.in);
        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println("Enter your choice");
        ch=scn.nextInt();
        switch (ch){
            case 1:c=a+b;
            System.out.println(c);
            break;
            case 2:c=a-b;
            System.out.println(c);
            break;
            case 3:c=a*b;
            System.out.println(c);
            break;
            case 4:c=a/b;
            System.out.println(c);
            break;
            case 5:c=a%b;
            System.out.println(c);
            break;
            default :
            System.out.println("invalid entry ");
            break;
        }
    }
}
