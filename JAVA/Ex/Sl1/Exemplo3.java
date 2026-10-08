import java.util.Scanner;

public class Exemplo3
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("Calcular tabuada\n");
        System.out.print("Digite um numero: \n");

        num1 = input.nextInt();

        for(int i = 0; i < 11; i++)
        {
            System.out.print(num1 + " * " + i + " = " + num1*i);
            System.out.print("\n");
        }

        input.close();
    }
}