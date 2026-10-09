import java.util.Scanner;

public class Ex8
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		int peso, altura, iSP;
		int somaSobrePeso = 0;
		
		while(flag)
		{
			System.out.println("Digite o peso e altura, respetivamente");
			
			peso = input.nextInt();
			altura = input.nextInt();
			
			if(peso == -1 || altura == -1)
				flag = false;
			else
			{
					iSP = (peso/(altura*altura));
	
					if(iSP <= 25)
						System.out.println("Peso saudável");
					else
						System.out.println("Cuidado!!! Vai Explodir");
			}

		}
		
		input.close();
	
	}

}// Qual o bendito erro ?
