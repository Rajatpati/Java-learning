import java.util.Scanner;
public class secondhighestnum {
    public static void main(String[]args){
        /*you are given 3 intege number x,y,and z .
        task is to print the second smallest number among the three provided numbers0
           example -
          input-
         10 42 15
          output -
          15 */
          //input
        Scanner sc=new Scanner (System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        //output
        //ternary operator
       /* int a;
        a= (x>y)?(x>z?z:x) :(y>z?z:y);
        System.out.println(a);*/
        //useing logical and relational 
        if ((x>y&&x<z)||(x<y&&x>z))
        System.out.println(x);
        else if((y>x&&y<z)||(y<x&&y>z))
        System.out.println(y);
        else
        System.out.println(z);

    }
    
}
