package javacode;

public class greatest {
    public static void main(String[]args){
        int a=52;
        int b=525;
        int c=252;
        if (a>b){
            if (a>c){
                System.out.println("The greatest number is "+a); 
            }else{
                System.out.println("The greatest number is "+c);
            }
        }else{
            if (b>c){
                System.out.println("The greatest number is "+b);
            }else{
                System.out.println("The greatest number is "+c);
            }
        }
        }
    }
    
