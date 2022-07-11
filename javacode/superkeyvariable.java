public class superkeyvariable {
  int a=10;
}
class const1 extends superkeyvariable{
    int a=20;
void show(){
    System.out.println(super.a);
    System.out.println(a);
}
}
class D{
    public static void main(String []args){
        const1 r=new const1();
        r.show();
    }
}
