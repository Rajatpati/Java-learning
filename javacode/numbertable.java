import java.util.Scanner;
public class numbertable {
    public static void main(String []args) {
        int a,i;
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter any number :");
			a=scn.nextInt();
		
		for (i=1;i<=10;i++) {
			System.out.println(a*i); 
		}  
    }
    
}
