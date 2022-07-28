import java.util.Scanner;
public class perfectnumber {
    public static void main(String[]args){
        /*find perfect number if it is a perfect number then print 
         * true other wise print false 
         * perfect number is a integer that equals the sum of all the divisors except 
         * number itself 
         * like number-6
         * divisor is-1 2 3 6
         * sum of divisor=1+2+3=6 dont sum with the number itself 
         * which is equal so the number so it is a perfect number 
         */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t!=0){
            int sum=0;
            int n=sc.nextInt();
            for (int i=1;i<=n/2;i++){
                if (n%i==0)
                sum=sum+i;
            }
                if (sum==n)
                System.out.println("True");
                else
                System.out.println("False");
            }
            t--;
        }
    }

