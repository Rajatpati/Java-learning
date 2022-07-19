import java.util.Scanner;
public class code1 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        int a;
        a= (x>y)?(x>z?z:x) :(y>z?z:y);
        System.out.println(a);

    }
    
}
