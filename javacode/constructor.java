public class constructor {
    int a; String name;
    constructor(){
        a=10; name=null;
    }
    void show(){
        System.out.println(a+" "+name);
    }
    class B{
        public static void main(String[]args){
            constructor ref=new constructor();
            ref.show();
        }
    }
}
