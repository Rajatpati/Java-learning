import java.util.Scanner;
public class operator {
    /*prepbuddy wants you to get familiar with various relational operators.
     you with two numerical value x and y and
      your task is to find the relation between them that is 
      .x is smaller than y
       .x is greater the y
        .x is equal to y
    example 
    input 
    4 6
    output 
     4 is smaller than 6*/
 
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b)
        System.out.println(a+" is greater than "+b);
        else if (a==b)
        System.out.println(a+" is equal to "+b);
        else 
        System.out.println(a+" is smaller than "+b);


    }
}
