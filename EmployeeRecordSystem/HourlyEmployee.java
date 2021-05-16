/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package record.of.employee;

/**
 *
 * @author Administrator
 */
public class HourlyEmployee extends Employee {

    public double hourlyRate;
    public int hourWorked;
    public HourlyEmployee(String name, String id, String designation,double rate,int worked) {
        super(name, id, designation);
        hourWorked = worked;
        hourlyRate = rate;
    }
    
    public double getSalary(int hWorked){
        return (hWorked*hourlyRate);
    } 
    @Override
    public void increaseSalary(double amt) {
        hourlyRate += amt;
    }
    @Override
    public double getSalary() {
        return (hourWorked*hourlyRate);
    }
    @Override
    void display(){
        super.display();
        System.out.println("Rate: "+hourlyRate);
    }
}
