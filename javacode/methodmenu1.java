import java.util.Scanner;
     public class methodmenu1 {
    public static void main(String []args ){
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
        System.out.println("Please enter a valid operation number from the below menu");
        System.out.println("1.Calculate area of circle\n2.Calclulate area of Square\n3.Calculate area of rectangle ");
        int operationNumber=sc.nextInt();
        switch (operationNumber){
            case 1:
            double x=circleArea();
            System.out.println(x); 
            break;
            case 2:
            int side =sc.nextInt();
            squareArea(side);
            break;
            case 3:
            int a=sc.nextInt();
            int b=sc.nextInt();
            int y=rectangleArea(a,b);
            System.out.println(y);
            break;
            default :
            System.out.println("invalid input");
            break;
            }
         System.out.println("Are you want to Display the Menu: (y/n) ?");
            ch=sc.next().charAt(0);}
            while (ch =='y' || ch =='Y');
         }
        public static double circleArea(){
        Scanner sc=new Scanner(System.in);
        double radious=sc.nextDouble();
        return(3.14 *radious *radious );
    }
    public static void squareArea(int a){
        System.out.println(a*a);
      }
    public static int rectangleArea(int a,int b){
        return(a*b);

    }
}
     
    

