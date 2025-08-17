import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number: -");
        int num1=sc.nextInt();
        System.out.print("Enter Operation '+, -, *, /, % ' : -");
        char operation=sc.next().trim().charAt(0);
        System.out.print("Enter second Number: -");
        int num2=sc.nextInt();

        switch(operation){
            case '+':
                System.out.print("Addition :-" + (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction :-" + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication :-"+(num1*num2));
                break;
            case '/':
                System.out.println("Division :-"+(num1/num2));
                break;
            case '%':
                System.out.println("Moduls :-"+num1%num2);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        } 
    }    
}
