import java.util.Scanner;
public class leapyrornot{
    public static void main(String[]args){
       /*  Leap Year or Not
We all have made fun of our friends who have their birthdays on 29thFebruary.
Given birthday year N of your friend, can you tell her if that is leap year or not?
 Input format
The first line constains an integer T denoting the number of test cases.
Each test case contains one integer N
Example
Input
2
1900
2012
Output
No
Yes*/
             Scanner sc=new Scanner (System.in);
             int T=sc.nextInt();
            while (T!=0){
             int yr=sc.nextInt();
             if ((yr%400==0)||((yr%4==0)&&(yr%100!=0)))
             System.out.println("Yes");
             else 
             System.out.println("No");
              T--;
              }
             }
            }