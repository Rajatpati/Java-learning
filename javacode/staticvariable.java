class employee{
    int empid;
    String name;
    static String companyName="prepbytes";
    employee(int eid,String empname){
        empid=eid;
        name =empname;
    }
    void display(){
        System.out.println(empid+" "+name+" "+companyName);
    }
}
public class staticvariable {
    public static void main (String []args){
        employee e1=new employee(1,"prangya");
        employee e2=new employee(2,"Aveek");
        e1.display();
        e2.display();
    }
    
}
