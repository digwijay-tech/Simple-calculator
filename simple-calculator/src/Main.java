import java.util.Objects;
import java.util.Scanner;

class Calculator {
    int result;

    public int add(int n1,int n2){
       result =n1+n2;
        return result;
    };

    public int subtract(int n1 , int n2){
        result=n1-n2;
        return result;
    }
    public int multiply(int n1 ,int n2){
        result=n1*n2;
        return result;
    }
    public int divide(int n1 ,int n2){
        result=n1/n2;
        return result;
    }


}

public class Main{
    public static void main(String[] args) {
       // Calculator
        int number1 = 0;
        int number2 = 0;
        int ans =0;
        String n ="";
        String repley="";

        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
         do{
        System.out.print("Enter the first number :");
        number1= scan.nextInt();
        System.out.print("Great! Enter the Second number :");
        number2 =scan.nextInt();
        System.out.println("Now  ,Enter the Operation to perform ");
        System.out.print("Eg : +,-,/,* \n :");
        n =scan.next();
        switch(n){
            case "+","add" :ans=calc.add(number1,number2);
            n="+";
            break;
            case "-","sub":ans= calc.subtract(number1,number2);
            n="-";
            break;
            case "/","divide":ans= calc.divide(number1,number2);
            n="/";
            break;
            case "*","multi": ans=calc.multiply(number1,number2);
            n="x";
            break;
            default:System.out.println("Enter a valid value");
        };
          System.out.println(number1+" "+n+" "+number2+"="+ans);

            System.out.println("Do you want to continue ??");

            repley=scan.next();

        }while(repley.equals( "yes"));
        System.out.println("Thank you ");
    }
}

