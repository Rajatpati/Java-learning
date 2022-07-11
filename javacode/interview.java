import java.util.Scanner;
public class interview {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a[]=new int[7];
        System.out.println("enter the vallues:");
        for (int i=0;i<7;i++){
            a[i]=scn.nextInt();
        }
        for (int b:a){
            if (b%2!=0){
                if (b>0){
                    System.out.println(b);
                }else{
                }
            }
        }
    }
    
}
