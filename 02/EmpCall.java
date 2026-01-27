/** To calculate employee Salary using Modular Methods */

// import Scanner class
import java.util.Scanner;

// Salary Calculator
class EmployeeSalary{
    String Name;
    double Basic_Salary,HRA,DA;
    // Salary Methods
    double  Salary(){
        Scanner input_sal = new Scanner(System.in);
        /** input of all Data */

        System.out.println("Enter your Name : ");
        Name = input_sal.nextLine();

        System.out.println("Enter Salary of the Employee : ");
        Basic_Salary = input_sal.nextLong();

        HRA = (Basic_Salary*10)/100;

        DA = (Basic_Salary*10)/100;

        return Basic_Salary+HRA+DA ;
    }

}

// main method
class EmpCall{
    public static void main(String args[]){
        EmployeeSalary Em = new EmployeeSalary();
        double sal= Em.Salary();
        System.out.println("your Salary is :"+sal);
    }
}