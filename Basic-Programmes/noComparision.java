import java.util.Scanner;

class noComparision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("Enter first integer: ");
        n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        n2 = input.nextInt();

        if(n1==n2)
        {
            System.out.print("n1 = n2");
        }
        if(n1<n2)
        {
            System.out.print("n1 < n2");  
        }
        if(n1>n2)
        {
            System.out.print("n1 > n2");  
        }

    }
}
