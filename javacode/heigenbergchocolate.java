import java.util.Scanner;
public class heigenbergchocolate {
    public static void main(String[]args){
        /*Heisenberg has N chocolates with increaseing taste value 1,2,...,N. 
        and wants to distribute them to his sons tomm and joffrey.
       Say he gives i chocolates to tomm with sum S1 and N-i chocolates with sum s2 to joffrey.
        He loves both of his sons and wants the value of |s1-s2| to be as minimum as possible .
        heisenberg being theoritacal physicist is not good with such puzzles so he asks for your help 
          input 1-
         3
          output 1
         0
         input 2-
          5
         output 2
          1*/
         /*  explanation
          N chocolates ,1 to N
              Tomm -i chocolates -S1
         joffey-n-i - S2
        Asking -
           |S1-S2| minimum
       N=3
      1 2 3
        tomm -1,2=S1=3
       joffey -3-S2=3
       |S1-S2|=0
         N=5
      1 2 3 4 5
       Tomm-1 3 4= S1=8
            joffey-2 5 =S2=7
        |S1-S2|=1*/
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long sum=n*(n+1)/2;
        if (sum%2==0)
        System.out.println(0);
        else 
        System.out.println(1);


    }
    
}
