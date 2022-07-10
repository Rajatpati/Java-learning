package javacode;

public class person {
    int weight=75;
    int age=22;
    String colour="light" ;
    void eat() {
        System.out.println("I am eating ");
    }
    void sleep(){
        System.out.println("I am sleeping");
    }
    public static void main(String[]args){
        person p=new person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.colour);
        p.eat(); p.sleep();

        
    }
    
}
