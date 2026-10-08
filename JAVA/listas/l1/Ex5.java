import java.util.Scanner;

public class Ex5
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int resultado = 0;

        System.out.print("f(x) = ");
        if (0 <= x && x <5)
            resultado = x;
        else if (5 <= x && x < 10)
            resultado = 2*x +1;
        else if (x > 10)
            resultado = x -3;
        
        System.out.print(resultado + "\n");

        input.close();
    }
}