import java.util.Scanner;
public class newline {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int j=1;
        int n=sc.nextInt();
        while (j<=n){
          System.out.print(j+" ");
          if (j%5==0)
          System.out.println();
          j+=1;

        }
        }
    }
