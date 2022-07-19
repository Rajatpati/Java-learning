import java.util.Scanner;
public class character {
    public static void main(String []args){
       /*you are provided with this table containing a character and
        its value given pone of this character as input
         you need to print its corresponding value 
        P or p  -Prepbytes
        Z  or z   -Zenith
        E  or e  -Expert Coder
         D  or d - Data Structure
        example 
        input 
         e
        output 
       expert coder*/
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch=='P'||ch=='p'){
            System.out.println("Prepbytes");
        }
            else if(ch=='Z'||ch=='z'){
                System.out.println("Zenith");
            }
            else if (ch=='E'||ch=='e'){
                System.out.println("Expert Coder");
            }
            else if (ch=='D'||ch=='d'){
                System.out.println("Data Structure");

            }

        }

    }
