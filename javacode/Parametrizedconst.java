public class Parametrizedconst {
    int x,y;
    Parametrizedconst(int a,int b){
        x=a;y=b;

    }
    void show(){
        System.out.println(x+" "+y);

    }   
    class B{
        public static void main(String[]args){
            Parametrizedconst r=new Parametrizedconst(100,200);
            r.show();
        }
    } 
}
