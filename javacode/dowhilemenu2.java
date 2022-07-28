import java.util.Scanner;
public class dowhilemenu2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("List of operation is :\n1.Addition\n2.Substraction");
            System.out.println("Enter the operation Num: ");
            int operationNum=sc.nextInt();
            switch(operationNum){
                case 1:
                System.out.println("Enter two number for Addition:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println("The sum of two number is :"+(a+b));
                break;
                case 2:
                System.out.println("Enter two number for Substraction:");
                int x=sc.nextInt();
                int y=sc.nextInt();
                System.out.println("The sum of two number is :"+(x-y));
                break;
                default :
                System.out.println("Invalid input of operation");
            }
            System.out.println("Do you want to continue operation (Y/N) ?");
            ch=sc.next().charAt(0);
         }while (ch=='Y'||ch=='y');
        }
    }
