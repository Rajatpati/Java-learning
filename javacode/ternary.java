package javacode;

public class ternary {
    public static void main(String[]args){
        int a=20;
        int b=30;
        int c=45;
       int r= (a>b)?(a>c?a:c):(b>c?b:c);
       System.out.println(r);
}
    }