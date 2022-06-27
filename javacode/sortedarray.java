import java.util.Arrays;
import java.util.Scanner;
public class sortedarray {
    public static void main(String[]args){
        int a[]=new int[5];
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number :");
        for (int i=0;i<5;i++){
          a[i]=scn.nextInt();
        }
        Arrays.sort(a);
        System.out.println("The number are :");
        
        for(int b:a){
            System.out.print(b+" ");
        }

    }
    
}
