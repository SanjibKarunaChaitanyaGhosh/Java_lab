import java.util.Scanner;

class num
{   
    void InputData() // getting input from User
    {
        Scanner num = new Scanner(System.in);
        int a;
        System.out.println("First Enter any number");
        a = num.nextInt();
        System.out.println("You have entered input :"+a);
        logic(a); // calling of Method
    }

    void logic(int a) // menu and logic
    {
        int choice = 0;
        while(true){
        System.out.println("\n 1. Check for Even or odd\n 2. Check for positive or negative\n 3. press O(zero) for Exit");
        Scanner userInput = new Scanner(System.in);

        choice = userInput.nextInt();
         if (choice==0)
                {
                    System.out.println("The Given number is Zero");
                    break;
                }

        switch(choice){
            case 1:
                if (a%2==0)
                    System.out.println("The Given number is Even");
                else
                    System.out.println("The Given number is ODD");
                break;
            case 2:
                if (a>0)
                    System.out.println("The Given number is Positive");
                
                else
                    System.out.println("The Given number is negative");
                break;

            default :
                    System.out.println("Please Enter a number");
             }
        }

    }

    public static void main(String args[])
    {
        num Analyze = new num();
        Analyze.InputData();
    }
}
