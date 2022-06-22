package javacode;
import java.util.Scanner;
public class question3while {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the choice of number ");
        int i=scn.nextInt();
        while(i>0){
            if (i==1){
                System.out.println("The name of the day is "+"Monday");
                break;
            }else if(i==2){
                System.out.println("The name of the day is "+"Tuesday");
                break;
            }else if(i==3){
                System.out.println("The name of the day is "+"Wednesday");
                break;
            }else if(i==4){
                System.out.println( "The name of the day is "+"Thursday");
                break;
            }else if(i==5){
                System.out.println( "The name of the day is "+"Friday");
                break;
            }else if(i==6){
                System.out.println("The name of the day is "+"Saturday");
                break;
            }else if(i==7){
                System.out.println( "The name of the day is "+"Sunday");
                break;
            }
            else{
                System.out.println("Error"); 
                break;
            }
        }
    }
    
}
