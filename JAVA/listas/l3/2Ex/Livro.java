public class Livro
{
	// Atributos
	String titulo;
	int anoPublic;
	int edicao;
	Autor autor;
	
	// Construtores
	public Livro(){}
	
	public Livro(Autor autor){this.autor = autor;};
	
	public Livro(String titulo, int anoPublic, int ed, 
	Autor autor)
	{
		this.titulo = titulo;
		this.anoPublic = anoPublic;
		this.edicao = ed;
		/*
		this.autor.setNome(autor.getNome());
		this.autor.setNascionalidade(autor.getNascionalidade());
		*/
		this.autor = new Autor(autor.getNome(),
		autor.getNascionalidade());
	}
	
	public Livro(String titulo, int anoPublic, int ed, 
	String nome, String nascionalidade)
	{
		this.titulo = titulo;
		this.anoPublic = anoPublic;
		this.edicao = ed;
		/*
		this.autor.setNome(autor.getNome());
		this.autor.setNascionalidade(autor.getNascionalidade());
		this.autor = new Autor(autor.getNome(),
		autor.getNascionalidade());
		*/
		this.autor = new Autor(nome, nascionalidade);
	}
	
	// Metodos Set
	public void setTitulo(String titulo){this.titulo= titulo;}

	public void setAnoPublic(int anoPublic)
	{
		this.anoPublic = anoPublic;
	}
	
	public void setEdicao(int ed){this.edicao = ed;}
	
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
	
	public int getEdicao(){return this.edicao;}
	
	// Mesma dúvida conceitual do setAutor()
	public Autor getAutor()
	{
			Autor output = new Autor();
			output.setNome(autor.getNome());
			output.setNascionalidade(autor.getNascionalidade());
			return output;			
	}
	
	// Outros Metodos
	public void exibirLivro()
	{
		System.out.println("Título: " + this.titulo);
		System.out.println("Ano: " + this.anoPublic);
		System.out.println("Autor: " + this.autor.getNome());
		System.out.println("Edição: " + this.edicao);
	}
}
