
import java.util.Scanner;

public class SheetQ5 {
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a 5 digit number: ");
    int number = scanner.nextInt();

    if (number<10000 || number>99999)
    {
        System.out.println("please enter a valid number.");
    }
    else{
        String numberstr = Integer.toString(number);
        //printing each digit Seperated by spaces-

        for (int i=0; i<numberstr.length(); i++)
        {
            System.out.print(numberstr.charAt(i));
            if(i<numberstr.length()-1)
            {
                System.out.print("   ");
            }
        }
    }
    scanner.close();
}    
}
