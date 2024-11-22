import java.util.Scanner;
public class nFactorial{
    public static int factorial(int n){
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to find it's Factorial :");
    int num = scanner.nextInt();

    int result = factorial(num);

System.out.println("The factorial of "+ num + " is:"+ result);
}
}