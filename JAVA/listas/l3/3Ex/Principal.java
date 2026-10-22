public class Principal 
{
	public static void main (String [] args)
	{
		Turma turma = new Turma("Gustavo", 5);
		
		turma.adicionarAluno("Leonardo", "20255687");
		turma.adicionarAluno("Kaue", "20252424");
		turma.adicionarAluno("Lorenzo", "65784103");
		
		System.out.println(turma.getNomeProf());
		if(turma.getTamAluno() == 0)
		{
			System.out.println("Não tem alunos na turma.");
		}
		else {
			for(int i = 0; i < turma.getTamAluno(); i++)
			{
				turma.exibirAluno(i);
			}
		}	
	}
}
