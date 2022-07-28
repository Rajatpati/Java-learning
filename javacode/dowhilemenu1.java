import java.util.Scanner;
public class dowhilemenu1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Ennter operation number:");
            int i=sc.nextInt();
            if (i==1){
                System.out.println("Enter a:");
                int a=sc.nextInt();
                System.out.println("Enter b:");
                int b=sc.nextInt();
                int addition=a+b;
                System.out.println(addition);
            }
            else if(i==2){
                System.out.println("Enter a:");
                int a=sc.nextInt();
                System.out.println("Enter b:");
                int b=sc.nextInt();
                int substraction=a-b;
                System.out.println(substraction);
            }
            else 
            System.out.println("Invalid input");
            System.out.println("Do you want the operation ? Y/N");
            ch=sc.next().charAt(0);
        }
         while(ch=='y'||ch=='Y');
        }
    }
    
