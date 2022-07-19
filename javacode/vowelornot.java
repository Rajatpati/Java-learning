import java.util.*;
  import java.io.*;
  public class vowelornot {
    public static void main(String args[]) throws IOException {
      //write your code here
      //useing if else 
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       /*char ch='a';
       if (ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
       System.out.println(ch +" is a vowel");
       else
       System.out.println(ch+"is not a vowel");*/
       //useing switch  statement 
       switch (ch){
        case ('a'):
        System.out.println(ch +" is a vowel");
        break ;
        case ('e'):
        System.out.println(ch +" is a vowel");
        break ;
        case ('i'):
        System.out.println(ch +" is a vowel");
        break ;
        case ('o'):
        System.out.println(ch +" is a vowel");
        break ;
        case ('u'):
        System.out.println(ch +" is a vowel");
        break ;
        default :
        System.out.println(ch +" is not a vowel");
       }
      }
    }
