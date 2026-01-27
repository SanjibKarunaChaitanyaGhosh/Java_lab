/****** Student info Input and Output ********/

import java.util.Scanner;

class Student_info{
    public static void main(String args[]){
        /********* Scanner Class Object **************/
        Scanner info = new Scanner(System.in);

        /********* Declaration of Variables **************/
        String name, DOB ;
        int Age;
        long Mobile_no;
        /********* Input of Student info **************/
        System.out.println("Enter your Name:");
        name= info.nextLine();
        System.out.println("Enter your D.O.B:");
        DOB = info.nextLine();
        System.out.println("Enter your Age:");
        Age = info.nextInt();
        System.out.println("Enter your Mobile no:");
        Mobile_no = info.nextLong();

        /********* Display of Student info **************/

        System.out.println("Name: "+ name+"\n Date of Birth: "+DOB+"\n Your Age is: "+Age+"\n your mobile no is: "+Mobile_no);

    }
}