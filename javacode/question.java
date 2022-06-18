package javacode;
import java.util.Scanner;
public class question {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        float a=scn.nextFloat();
        if (a>0){
            if(a>1000000){
                System.out.println("large"+" positive");
            }else{
                System.out.println("Small"+" positive");
            }  
                }else if (a<0){
                    if (a<-1000000){
            System.out.println("large"+" Negative");
               }else
               {
            System.out.println("Small"+" Negative");
              }
            }else
         {
            System.out.println("Zero");
        }
    }
    
}

