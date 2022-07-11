public class superkeyconst2 {
        superkeyconst2(int a){
        System.out.println("Rajat"+" "+a);
        }
        }
        class B extends superkeyconst2 {
            B(){
                super(1000);
                System.out.println("Pati");
            }
        }
        class C{
            public static void main(String[]args){
                B ref=new B();
            }
            
        }
