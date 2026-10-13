public class Aluno
{
	// Atributos
	private String nome;
	private String CR;
	
	// Contrutores
	public Aluno(){}
	
	public Aluno(String nome, String cr)
	{
		this.nome = nome;
		this.CR = cr;
	}
	
	// Metodos Set
	public void setNome(String nome){this.nome = nome;}
	
	public void setCR(String CR){this.CR = CR;}
	
	// Metodos Get
	public String getNome(){return this.nome;}
	
	public String getCR(){return this.CR;}
	
	
	
}
