import java.util.Scanner;

public class PrincipalArrayUsuario
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int [] vet = new int[5];
        int cont = 0;
        int soma = 0;
        System.out.println("Digite 5 números. ");

        while(cont < 5)
        {
            vet[cont] = input.nextInt();
            soma = soma + vet[cont];
            cont++;
        }

        System.out.println("A soma dos numero eh " + soma);

        input.close();
    
    }
}