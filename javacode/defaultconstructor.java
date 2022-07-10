public class defaultconstructor {
    int a; String b; boolean c;
    defaultconstructor(){
        a=1000; b="Rajat"; c=true;
        }
        void show(){
            System.out.println(a+" "+b+" "+c);
        }
        class B{
            public static void main(String[]args){
                defaultconstructor ref=new defaultconstructor();
                ref.show();
            }

        }
    }
