import java.util.Scanner;
public class arrayquestion3 {
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        boolean prejent=false;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number to find :");
        int number=scn.nextInt();
        for (int b:a)
            if (b==number)
           prejent=true;
           System.out.println(prejent);
       }
    }
