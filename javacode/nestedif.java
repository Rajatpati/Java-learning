import java.util.Scanner;
public class nestedif {
    public static void main (String[]args ){
        Scanner scn=new Scanner (System.in);
		System.out.println("Enter your persentage ");
		int i=scn.nextInt();
		if (i>=60) {
			System.out.println("Fast divison");
		}
		else if (i>=50||i<60) {
			System.out.println("Second divison");
		}
		else if (i<50||i>=35) {
			System.out.println("Third divison");
		}
		else {
			System.out.println("FAIL");
		} 
    }
    
}
