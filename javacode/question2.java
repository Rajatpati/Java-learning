package javacode;
import java.util.Scanner;
public class question2 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in );
        System.out.println("Enter the character");
        char ch=scn.next().charAt(0);
        for (char i='A';i<='Z';i++){
            for (char j='a';j<='z';j++)
        
    
     if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
        System.out.println("vowel");
        break;
    }else{
        System.out.println("consonant");
        break;
    }
    }
    }
}

