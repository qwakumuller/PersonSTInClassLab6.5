package edu.cscc;

public abstract class Person {


    private String fName, lName;

    public Person(String fName,String lName){
        this.fName=fName;
        this.lName=lName;

    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void print(){
        System.out.println("\tName: "+fName + " "+lName);
    }
    public abstract void PrintYourClass();

}
