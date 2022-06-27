package javacode;
import java.util.Scanner;
public abstract class countpositivenegativezero {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int positivecount=0;
        int negativecount=0;
        int zerocount=0;
        char choice;
        do{
            System.out.println("Enter the number:");
            int num=scn.nextInt();
            if (num>0){
                positivecount++;
            }else if(num<0){
                negativecount++;
            }else{
                zerocount++;
            }
            System.out.println("Do you want to continue y/n ?");
            choice=scn.next().charAt(0);

        }while (choice=='y'||choice=='Y');
        System.out.println("The Positivecount is :"+positivecount);
        System.out.println("The Negativecount is :"+negativecount);
        System.out.println("The Zerocount is :"+zerocount);
    }
    
}
