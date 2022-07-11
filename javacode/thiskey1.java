public class thiskey1 {
    void show (){
        System.out.println(this);
    }
    public static void main(String[]args){
        thiskey1 r=new thiskey1();
        r.show();
        System.out.println(r);
    }
    
}
