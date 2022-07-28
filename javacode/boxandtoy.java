import java.util.Scanner;
public class boxandtoy {
    public static void main(String[]args){
       /*  Boxes and Toys
            Tinaand Rahul have 1 toy each. They are entering into an amusement park
             but it is not allowed to take the toys inside,
              so they have to keep it in the boxes provided by the park management. 
              They want to keep the toys together in one box. There are N 
              boxes in total, at this moment there are ti toys present in ith box and
               the maximum capacity of the box is denoted by ci. 
               Rahul and Tina want to know in how many boxes can they keep their toys 
               such that both the toys are in the same box.
               Input format
               The first line of the input contains integer N, denoting the count of boxes.
                Each of the next N lines contains two integers ti and ci 
                denoting the number of toys present in the ith 
                box and the maximum capacity of that box.
                output format
                Print the maximum number of boxes that fulfill the conditions.
                Example
                Input 
                4
                1 2
                2 4
                5 6
                6 10
                Output
                2
                Sample test case explanation
                It is only possible to keep both the toys in box2 and box4.*/
                Scanner sc=new Scanner(System.in);
                int N=sc.nextInt();
                int count=0;
                while (N!=0){
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    if (b-a>=0)
                     count++;
                     N--;
                }
                System.out.println(count);
            }
        }
