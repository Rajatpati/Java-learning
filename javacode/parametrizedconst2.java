public class parametrizedconst2 {
    int x,y;
    parametrizedconst2(int a,int b){
        x=a;y=b;
    }
    parametrizedconst2(int a,String b){
        System.out.println(a+" "+b);
    }
    void show(){
        System.out.println(x+" "+y);

    }
    class B{
        public static void main(String[]args){
            parametrizedconst2 r=new parametrizedconst2(100,1000);
            r.show();
            parametrizedconst2 ref=new parametrizedconst2(200,"Rajat");
        }
    }
    
}
