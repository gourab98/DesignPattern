package DesignPattern.Composite_Pattern_2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee CEO = new Employee("John","CEO",300000);

        Employee headSales = new Employee("Robert","Head Sales", 200000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 200000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headMarketing.add(salesExecutive1);
        headMarketing.add(salesExecutive2);

        headSales.add(clerk1);
        headSales.add(clerk2);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}