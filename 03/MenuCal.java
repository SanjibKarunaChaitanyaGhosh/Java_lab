import java.util.Scanner;

class Calculate
{
    int ADD(int x,int y){
        return x+y;
    }

    int MUL(int x,int y){
        return x*y;
    }

    int DIV(int x,int y){
        return x/y;
    }

    int SUB(int x,int y){
        return x-y;
    }

    void Cal()
    {
        char ch;
        int x,y;
        int result=0;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("+:Addition");
            System.out.println("-:Substraction");
            System.out.println("*:Multiplication");
            System.out.println("/:Division");
            System.out.println("!:Exit");
            System.out.println("Enter your choice:");
            ch=sc.next().charAt(0);

             switch (ch){

                case '+':
                    System.out.println("Enter your frist Number:");
                     x=sc.nextInt();

                    System.out.println("Enter your second Number:");
                    y=sc.nextInt();

                    result=ADD(x,y);
                    System.out.println("Addition: "+result);

                    break;

                case '-':
                    System.out.println("Enter your frist Number:");
                    x=sc.nextInt();

                    System.out.println("Enter your second Number:");
                    y=sc.nextInt();

                    if (x>=y) {
                        result=SUB(x,y);
                    }
                    else 
                        result=SUB(y,x);

                    System.out.println("Substraction: "+result);

                    break;

                case '*':
                    System.out.println("Enter your frist Number:");
                    x=sc.nextInt();

                    System.out.println("Enter your second Number:");
                    y=sc.nextInt();

                    result=MUL(x,y);
                    System.out.println("Multiplication: "+result);

                    break;

                case '/':
                    System.out.println("Enter your frist Number:");
                    x=sc.nextInt();

                    System.out.println("Enter your second Number:");
                    y=sc.nextInt();

                    if(x>=y)
                        result=DIV(x,y);
                        
                    else
                        result=DIV(x,y);
                    
                    System.out.println("Division: "+result);
                    
                    break;
                        

                case '!': return;
            }
        }
       
   

    }
}
class MenuCal
{
    public static void main(String args[])
    {
       Calculate C= new Calculate();
       C.Cal();

    }

}