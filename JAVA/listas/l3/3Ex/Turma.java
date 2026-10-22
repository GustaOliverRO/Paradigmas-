public class Turma
{
	// Atributos
	// Lista de Aluno, preciso trabalhar com ponteiro ? 
	private String nomeProf;
	private int tamTurma;
	private int tamAluno;
	private Aluno [] alunos;
	
	// Contrutores 
	public Turma(){}
	
	public Turma(String nome, int tamTurma)
	{
		this.alunos[tamTurma] = new Aluno[tamTurma];
		this.tamTurma = tamTurma;
		this.nomeProf = nome;
	}

	// Metodos Set e Get
	
	public void setNomeProg(String nome){this.nomeProf = nome;}
	
	public void setTamTurma(int tamTurma){this.tamTurma = tamTurma;}

	public void setTamAluno(int tamAluno){this.tamAluno = tamAluno;}
	
	public void adicionarAluno(String nome, String CR)
	{
		this.alunos[tamAluno] = new Aluno(nome, CR);
		this.tamAluno++;
	}
	
	public String getNomeProf(){return this.nomeProf;}
	
	public int getTamTurma(){return this.tamTurma;}
	
	public int getTamAluno(){return this.tamAluno;}
	
	public void exibirAluno(int i)
	{
		System.out.println(this.alunos[i].getNome());
		System.out.println(this.alunos[i].getCR());
		System.out.println();
	}
}
