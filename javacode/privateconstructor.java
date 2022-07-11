public class privateconstructor {
    int a;double b;String c;
    privateconstructor(){
        a=10;b=25.5;c="Rajat";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[]args){
        privateconstructor r=new privateconstructor();
    }
    
}
