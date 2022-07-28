import java.util.Scanner;
public class method4 {
    //with arguments with return type
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in); //arguments 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sum(a,b);   // return type  
        System.out.println(x);
    }
    public static int sum(int a,int b){
        return(a+b);
    }
    
}
