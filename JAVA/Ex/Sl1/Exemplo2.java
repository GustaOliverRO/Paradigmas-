import java.util.Scanner;

public class Exemplo2
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        int num1,num2;

        System.out.print("Digite um numero: ");
        System.out.print("\n");
        num1 = input.nextInt();
        
        System.out.print("Digite outro numero: ");
        System.out.print("\n");
        num2 = input.nextInt();
        
        if (num1 < num2)
            System.out.print(num1 + " " + num2);

        else
            System.out.print(num2 + " " + num1);

        System.out.print("\n");
        input.close();
    
    }
}