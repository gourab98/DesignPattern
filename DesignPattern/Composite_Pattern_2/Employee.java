package DesignPattern.Composite_Pattern_2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String Name, String dept, int salary){
        this.name = Name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}