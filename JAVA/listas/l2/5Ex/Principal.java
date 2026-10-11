import java.util.Scanner;

public class Principal
{
	public static void main(String [] args)
	{
		Estudante [] vet = new Estudante [5];
		Scanner input = new Scanner (System.in);
		String nome;
		double nota, media, soma = 0;
		int exames = 0;
		int aprovados = 0;
		int reprovados = 0;
		
		/*System.out.println("Digite o nome seguido da nota,"
		+ " para cada um dos alunos: \n")*/
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Digite o nome seguido da nota:\n");
			vet[i] = new Estudante();
			nome = input.nextLine();
			media = input.nextDouble();
			input.nextLine();
			vet[i].setNome(nome);
			vet[i].setNotaFinal(media);
		}
		
		for(int i = 0; i < 5 ; i++)
		{
			soma = soma + vet[i].getNotaFinal();
			
			if(vet[i].getNotaFinal()< 4) {reprovados++;}
			else if(vet[i].getNotaFinal() >= 7) {aprovados++;}
			else {exames++;}
			
		}
		
		for(int i = 0; i < 5; i++){vet[i].imprimirEstudante();}
		media = soma/5;
		System.out.println("Alunos de Reprovados -> " + reprovados);
		System.out.println("Alunos de Exame -> " + exames);
		System.out.println("Alunos de Aprovados -> " + aprovados);
		System.out.println("Media final da turma -> " + media);
		input.close();
	}
}
