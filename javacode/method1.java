import java.util.*;
  import java.io.*;
  
  public class method1 {
    // no arguments no return type 
    public static void main(String args[]) throws IOException {
      
      sum();
    }
    public static void sum(){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(a+b);
    }
   }
     