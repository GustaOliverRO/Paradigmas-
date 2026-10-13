public class Principal
{
	public static void main (String [] args)
	{
		Autor autor = new Autor("Gustavo", "Brasileiro");
		Livro livro = new Livro("O iludido", 2026, 3, autor);
		
		System.out.println("Output dos dados do ex:...\n");
		/*
		System.out.printf("Nome: %s\nNascionalidade: %s\n",
		autor.getNome(), autor.getNascionalidade());
		
		aux = livro.getAutor();
		
		System.out.println("Output dos dados do livro");
		System.out.printf("Nome_Livro: %s\nAno_Publi: %d\n",
		livro.getTitulo(), livro.getAnoPublic());
		System.out.printf("Nome_autor: %s\nNasciona...: %s\n",
		aux.getNome(), aux.getNascionalidade());
		*/
		
		livro.exibirLivro();
	}

}
