import java.util.Scanner;
public class ifelsestatement {
    public static void main (String []args){
        Scanner scn=new Scanner (System.in);
	System.out.println("Enter your age ");
	int i=scn.nextInt();
	if (i>=18) {
         System.out.println("You are eligible for voteing");
	}
	else {
		System.out.println("You are not eligile for voteing");
		
    }
}
}
