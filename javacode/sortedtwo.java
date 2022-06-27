import java.util.Arrays;
import java.util.Scanner;
public class sortedtwo {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size=scn.nextInt();
        int a[]=new int[size];
        System.out.println("Import Array element");
        String c[]={"Rajat,Suubham,Kaushik"};
        for (int i=0;i<size;i++){ 
            a[i]=scn.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(c);
        System.out.print("The Array elements are:");
        for (int b:a){
            System.out.print(b+" ");
        }System.out.println();
        System.out.print("sorted string are :");
        for (String d:c){
            System.out.print(d+" ");
        }
    }
    
}
