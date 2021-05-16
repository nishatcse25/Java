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
public abstract class Employee {

   ///instance Variable
    private String name, id, designation;

	//constructor part
    //public Employee(String rcvName, String rcvId, String rcvDesignation, double rcvSalary) {
    public Employee(String name, String id, String designation) {

        this.name = name;
        this.id = id;
        this.designation = designation;
    }

	//Method Part
    

	//getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    } 

    public void setDesignation(String des){
        this.designation = des;
    }  
    public String getDesignation(){
        return designation;
    }

	//Display
    void display() {
        System.out.println("Name :" + name + " ID :" + id + " Designation :" + designation);
    }
    public abstract double getSalary();
    
    public abstract void increaseSalary(double amt);
}
