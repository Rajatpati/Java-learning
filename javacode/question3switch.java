package javacode;
import java.util.Scanner;
public class question3switch {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the choice ");
        int a=scn.nextInt();
        switch(a){
            case 1:
            System.out.println("The name of the day is "+"Monday");
            break;
            case 2:
            System.out.println( "The name of the day is "+"Tuesday");
            break; case 3:
            System.out.println( "The name of the day is "+"Wednesday");  
            break;
            case 4:
            System.out.println( "The name of the day is "+"Thursday");
            break;
            case 5:
            System.out.println( "The name of the day is "+"Friday");
            break;

            case 6:
            System.out.println( "The name of the day is "+"Saturday");
            break;
            case 7:
            System.out.println( "The name of the day is "+"Sunday");
            break;
            default :
            System.out.println("Error");
        }
    }
}
