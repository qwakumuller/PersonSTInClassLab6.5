package edu.cscc;

public class Employee extends Person {


    private double monthlySalary;
    private boolean hasBenefits;

    public Employee(String fname,String lname, double monthlySalary,boolean hasBenefits) {
        super (fname, lname);
        this.monthlySalary=monthlySalary;
        this.hasBenefits=hasBenefits;

    }

    public void print() {
        System.out.println("Employee Details: ");
        super.print();
        System.out.println("\t Monthly Salary " +monthlySalary + "\n\t Has Benefits " +hasBenefits);
    }

    public void PrintYourClass(){
        System.out.println(" I am an employee");
    }

}
