public class superkeymethode {
    void show(){
        System.out.println("i love you");
    }
}
    class F extends superkeymethode{
        void  show(){
            super.show();
            System.out.println("Bhai");

        }
    }
    class methode{
        public static void main(String[]args){
             F r=new F();
            r.show();
        }
    }
    
