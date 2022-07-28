class mobile {
    String brandname;
    String color;
    mobile(){
        brandname="i phone";
        color ="silver";
    }
    mobile (String bn,String col){
        brandname =bn;
        color=col;
    }
    public void call(){
        System.out.println("calling");
    }
    public void message(){
        System.out.println("Messageing");
    }
}
public class instancevariable {
    public static void main (String [] args) {
       mobile m1=new mobile ();
       m1.call();
       m1.message();
       System.out.println ("Brand name m1 is :"+m1.brandname);
       System.out.println("color name of m2 is :"+m1.color);
       mobile m2=new mobile ("samsung","black");
       m2.call();
       m2.message();
       System.out.println("Brand name m2 is :"+m2.brandname);
       System.out.println("color of m2 is "+m2.color);
        
    }
    
}
