public class superkeyconst1 {
    superkeyconst1(){
        System.out.println("Razz");
    }
}
class const2 extends superkeyconst1{
    const2(){
        System.out.println("king");
    }
}
class E{
    public static void main(String[]args){
       const2 r=new const2();

    }
}

