import java.util.Scanner;

public class Ex1
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero \n");
        numero = input.nextInt();

        if (numero > -1)
            System.out.print(numero + " eh positivo\n");
        else
            System.out.print(numero + " eh negativo\n");
        
        input.close();
    }
}