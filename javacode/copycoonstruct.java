public class copycoonstruct {
    int a; String b;
    copycoonstruct(){
        a=10; b="Rajat";
        System.out.println(a+" "+b);
    }
    copycoonstruct(copycoonstruct ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
    class B{
        public static void main(String[]args){
            copycoonstruct r=new copycoonstruct();
            copycoonstruct r2=new copycoonstruct(r);
        }
    }
    
}
