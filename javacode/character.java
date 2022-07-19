import java.util.Scanner;
public class character {
    public static void main(String []args){
       /*you are provided with this table containing a character and
        its value given pone of this character as input
         you need to print its corresponding value 
        P or p  -prepbytes
        Z  or z   -zenith
        E  or e  -expert coder
         D  or d - data structure
        example 
        input 
         e
        output 
       expert coder*/
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch=='P'||ch=='p'){
            System.out.println("prepbytes");
        }
            else if(ch=='Z'||ch=='z'){
                System.out.println("zenith");
            }
            else if (ch=='E'||ch=='e'){
                System.out.println("expert coder");
            }
            else if (ch=='D'||ch=='d'){
                System.out.println("Data structure");

            }

        }

    }
