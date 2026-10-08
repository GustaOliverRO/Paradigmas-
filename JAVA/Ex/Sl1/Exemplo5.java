import java.util.Scanner;

public class Exemplo5
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);

        boolean flag = true;
        int numero;
        int soma = 0;

        System.out.print("Digite numeros: \n");

        while(flag)
        {
            numero = input.nextInt();

            if(numero == -1)
                flag = false;
            else
                soma = soma + numero; 
           
        }

        System.out.print("A soma foi " + soma + "\n");
        input.close();
    }
}