import java.util.Scanner;
 class Calculate{
    //function for addition
    public int Addition(int n1,int n2) {
        return  n1+n2;
    }
    //function for subtraction
     public int Subtraction (int n1,int n2){
        return n1-n2;
     }
     // function for multiplication
     public int Multiply(int n1,int n2){
        return n1*n2;
     }
     //function for division
     public int Division(int n1,int n2) throws  ArithmeticException{
        return n1/n2;
     }

}

public class Calculator {
    public static void main(String[] args) {
        int n1,n2 ;// for number1 and number 2
        Scanner sc=new Scanner(System.in);
        //object of calculate class
        Calculate c=new Calculate();
        boolean exit=false;
        // main calculator menu
        System.out.println("-----OUR CALCULATOR IS STARTED---------");
        while(!exit){
            System.out.println("Please Select any operation");
            System.out.println("1 : Addition");
            System.out.println("2 : Subtracion");
            System.out.println("3 : Multiplication");
            System.out.println("4 : Division");
            System.out.println("5 : Exit");
            System.out.println("choose the operation you want to perform");
            int choice=sc.nextInt();
            if(choice==5){
                exit=true;
                System.out.println("Exiting the Calculator!!");
                break;
            }
            //ask for two numbers
            System.out.println("Enter Number 1 :");
            n1=sc.nextInt();
            System.out.println("Enter Number 2 :");
            n2=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Result : "+c.Addition(n1,n2));
                    break;
                case 2:
                    System.out.println("Result : "+c.Subtraction(n1,n2));
                    break;
                case 3:
                    System.out.println("Result : "+c.Multiply(n1,n2));
                    break;
                case 4:
                    try {
                        System.out.println("Result : " + c.Division(n1, n2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error : can not divide by 0");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");

            }


        }
        sc.close();




    }
}
