package edu.cscc;

public class




Volunteer extends Person {

    private double mileageReimbursement;
    public Volunteer(String fName,String lName,double mileageReimbursement) {
        super(fName, lName);
        this.mileageReimbursement=mileageReimbursement;
    }

    public double getMileageReimbursement() {
        return mileageReimbursement;
    }

    public void print(){
        System.out.println("Volunteer Details: ");
        super.print();
        System.out.println("\tMileage Reimbursement per mile: "+mileageReimbursement);
    }

    @Override
    public void PrintYourClass() {
        System.out.println("I am a Volunteer");
    }
}

