class count {
    static int i=0;
    count (){
        i++;
        System.out.println(i);
    }
}
public class A {
    public static void main(String []args){
        count c1=new count ();
        count c2=new count();
        count c3=new count();
    }
    
}
