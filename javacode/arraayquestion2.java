import java.util.Scanner;
public class arraayquestion2 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int even=0;
        int odd=0;
        int zero=0;
        int a[]=new int[20];
        System.out.println("Enter the integer:");
        for (int i=0;i<20;i++){
            a[i]=scn.nextInt();
            if (a[i]>0){
               positive++;
                }else if(a[i]<0){
                    negative++;
                }
                else{
                    zero++;
                }
                if (a[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            System.out.println("The integers are:");
        for (int b:a){
            System.out.println(b);
        }
        System.out.println("total number of even is:"+even);
        System.out.println("total number of odd is:"+odd);
        System.out.println("total number of positive is:"+positive);
        System.out.println("total number of negative is:"+negative);
        System.out.println("total number of zero is:"+zero);
        
    }
    
}
