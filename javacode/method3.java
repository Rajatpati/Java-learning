import java.util.Scanner;
public class method3 {
    // no argumnts with return type 
    public static void main(String []args){
        int x=sum();
        System.out.println(x);
    }
    public static int sum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        return(a+b);

    }
}
