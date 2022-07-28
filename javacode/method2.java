import java.util.Scanner;
public class method2 {
    //with arguments no return type 
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
    public static void sum(int x,int y){
        System.out.println(x+y);
    }

    }