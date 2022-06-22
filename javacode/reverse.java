import java.util.Scanner;
public class reverse {
    public static void main(String[]args ){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        int reverse=0;
        int remainder;
        int num=scn.nextInt();
        while(num>0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;

        }
        System.out.println("The reverse number is:"+reverse);
    }
    
}
