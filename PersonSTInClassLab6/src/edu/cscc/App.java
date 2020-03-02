package edu.cscc;
/*Name: Richmond Awuah Adjei
    Date: 02-19-20
    Lab: In Class Lab 6
 */

public class App {
    public static void main(String[] args) {
        //Polymorphic Array
Person persons[]= new Person[3];

persons[0]=new Employee("Kyle","Patterson",5425.50,true);
persons[1]=new Employee("Juan","Rodriguez",4465.67,false);
persons[2]=new Volunteer("Pat","Roberts",.48);

        Volunteer vol1 = new Volunteer("Bob", "Jones",.55);

        Employee emp1 = new Employee("Jane", "Smith",3475.75,true);
        //printing Bob Jones Record
        vol1.print();
        System.out.println();
        //printing Jane Smith Record
        emp1.print();
        System.out.println();
        // Printing all person records
        for (Person element : persons){
            element.PrintYourClass();
            element.print();
            System.out.println();
        }
        //This last line is going to print directly in this method. What do I need?
        //The variables in the classes are private, so I need get methodsin the classes in which they originate,
        // then call those methods

        System.out.println("Volunteer Details: \n\t" +
                vol1.getfName()+" "+ vol1.getlName()+"\n\tMileage Reimbursement per mile: " + vol1.getMileageReimbursement());
    }
}

