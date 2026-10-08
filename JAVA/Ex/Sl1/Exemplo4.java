import java.util.Scanner;

public class Exemplo4
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: \n");

        numero = input.nextInt();

        if((numero % 2) == 0)
            System.out.print(numero + " eh par\n");
        else
            System.out.print(numero + " eh impar\n");
        
        input.close();
    
    }
}