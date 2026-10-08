public class Exemplo6
{
    public static void main (String [] args)
    {
        int cont;
        int soma = 0;
        int numero = 3;

        for(cont = 0; cont < 11; cont++)
        {
            soma = soma + (cont*numero);
        }

        System.out.print("A soma dos 10 multiplos iniciais é " + soma);
        System.out.print("\n");
    }
}