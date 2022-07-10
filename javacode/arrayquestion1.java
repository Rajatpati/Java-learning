import java.util.Scanner;
public class arrayquestion1 {
    public static void main(String[]args){
      Scanner scn=new Scanner(System.in);
      int a[]=new int[10];
      System.out.println("Enter the integer");
        for (int i=0;i<10;i++){
            a[i]=scn.nextInt();
        }
        System.out.print("The integers are :");
        for (int b:a){
            System.out.print(b+" ");
        }
    }
    
}
