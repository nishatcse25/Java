
package uaphr;

public class Uaphr {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1=new Employee("Nishat", "18201084", "Student", 1000);
        e1.display();
        e1.updateSalary(2000);
        System.out.println(e1.getSalary());
        e1.display();
    }
    
}
