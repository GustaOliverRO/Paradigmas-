public class Autor
{
	// Atributos
	String nome;
	String nascionalidade;
	
	// Construtores
	public Autor(){}
	
	public Autor(String nome){this.nome = nome;}
	
	public Autor (String nome, String nascionalidade)
	{
		this.nome = nome;
		this.nascionalidade = nascionalidade;
	}
	
	// Metodos Set
	public void setNome(String nome){this.nome = nome;}
	
	public void setNascionalidade(String nascionalidade)
	{this.nascionalidade = nascionalidade;}
	
	// Metodos Get
	public String getNome(){return this.nome;}
	
	public String getNascionalidade()
	{return this.nascionalidade;}
	
	
}
