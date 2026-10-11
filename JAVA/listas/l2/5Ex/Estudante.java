public class Estudante
{
	// Atríbutos
	String nome;
	double notaFinal;
	
	// Construtor
	public Estudante(){}
	
	// Metodos Set
	public void setNome(String nome){this.nome = nome;}
	
	public void setNotaFinal(double nota){this.notaFinal = nota;}
	
	// Metodos Get
	public String getNome(){return this.nome;}
	
	public double getNotaFinal(){return this.notaFinal;}
	
	public void imprimirEstudante()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Nota final: " + this.notaFinal);
	}

}

