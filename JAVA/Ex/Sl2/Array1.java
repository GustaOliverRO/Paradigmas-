public class Array1
{
    public static void main (String [] args)
    {
        int [] vet = {0,1,2,3,4};
        int cont = 0;
        int soma = 0;
        while (cont < 5)
        {
            soma = soma + vet[cont];
            cont++;

        }

        System.out.println("A soma do vetor eh " + soma);
    }

}