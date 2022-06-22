import java.util.Scanner;
public class power {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
            System.out.println("Enter the base:");
            int a=scn.nextInt();
            System.out.println("Enter the power:");
            int b=scn.nextInt();
            int result=1;
            for (int i=1;i<=b;i++){
              result=result*a;
                 }
                 System.out.println("The result is:"+result);
        }
    }    