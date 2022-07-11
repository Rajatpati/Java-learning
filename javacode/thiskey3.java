public class thiskey3 {
    
    thiskey3(){
        System.out.println("Rajat");
    }
    thiskey3(int a){
        this();
        System.out.println(a);
    }
    public static void main(String[]args){
        thiskey3 r=new thiskey3(100);
    }
}
