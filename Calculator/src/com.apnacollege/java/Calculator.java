import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of first number");
        int a = sc.nextInt();
        System.out.println("enter value of first number");
        int b = sc.nextInt();

        System.out.println("1:  Add\n2: Subtract\n3:  Multiply\n4   Modulo");
        int operator = sc.nextInt();

        switch(operator) {
            case 1:
                System.out.println("sum of numbers are:");
                System.out.println(a + b);
                break;
            case 2:
                System.out.println("subtraction of numbers are:");
                System.out.println(a - b);
                break;
            case 3:
                System.out.println("multiplication of numbers are:");
                System.out.println(a * b);
                break;
            case 4:
                System.out.println("modulo of numbers are:");
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid");
        }



    }
}
