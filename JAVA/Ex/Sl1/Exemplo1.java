import java.util.Scanner;

public class Exemplo1
{
    public static void main (String[] args)
    {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Digite um numero: \n");

    num = input.nextInt();

    System.out.print("O seu numero digitado foi " + num);
    System.out.print("\n");
    input.close();
    }
}