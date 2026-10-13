public class Livro
{
	// Atributos
	String titulo;
	int anoPublic;
	Autor autor;
	
	// Construtores
	public Livro(){}
	
	public Livro(Autor autor){this.autor = autor;};
	
	public Livro(String titulo, int anoPublic, Autor autor)
	{
		this.titulo = titulo;
		this.anoPublic = anoPublic;
		/*
		this.autor.setNome(autor.getNome());
		this.autor.setNascionalidade(autor.getNascionalidade());
		*/
		this.autor = new Autor(autor.getNome(),
		autor.getNascionalidade());
	}
	
	// Metodos Set
	public void setTitulo(String titulo){this.titulo= titulo;}

	public void setAnoPublic(int anoPublic)
	{
		this.anoPublic = anoPublic;
	}
	
	// Perguntar se isso é incorreto, pois parece uma 
	// corrupção da ideia de encapsulamento e até mesmo
	// de cada objeto 'cuida de si'
	public void setAutor(String nome, String nascionalidade)
	{
		autor.setNome(nome);
		autor.setNascionalidade(nascionalidade);
	}

	// Metodos Get
	public String getTitulo(){return this.titulo;}
	
	public int getAnoPublic(){return this.anoPublic;}
	
	public Autor getAutor()
	{
			Autor output = new Autor();
			output.setNome(autor.getNome());
			output.setNascionalidade(autor.getNascionalidade());
			return output;			
	}
}
