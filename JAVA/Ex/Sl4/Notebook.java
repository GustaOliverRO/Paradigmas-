public class Notebook
{
	// Atríbutos
	private String nomeDono;
	private String marca;
	private int anoFabri;
	private String cor;
	private boolean teclaNum;
	
	public Notebook(String nomeDono)
	{
		this.nomeDono = nomeDono;
	}
	
	public Notebook(String nomeDono, String marca)
	{
		this.nomeDono = nomeDono;
		this.marca = marca;
	}
	
	public Notebook(String nomeDono, String marca, int anoFabri)
	{
		this.nomeDono = nomeDono;
		this.marca = marca;
		this.anoFabri = anoFabri;
		
	}

	public Notebook(String nomeDono, String marca, int anoFabri, String cor)
	{
		this.nomeDono = nomeDono;
		this.marca = marca;
		this.anoFabri = anoFabri;
		this.cor = cor;		
	}
	
	public Notebook(String nomeDono, String marca, int anoFabri, 	String cor, boolean teclaNum)
	{
		this.nomeDono = nomeDono;
		this.marca = marca;
		this.anoFabri = anoFabri;
		this.cor = cor;
		this.teclaNum = teclaNum;		
	}	
	
	public void exibirDados()
	{
		System.out.print("\nNome_Usuário: " +this.nomeDono + "\n");
		System.out.print("Marca: " +this.marca + "\n");
		System.out.print("Ano: " +this.anoFabri + "\n");	
		System.out.print("Cor: " +this.cor + "\n");
		System.out.print("Teclado_Numerico: " +this.teclaNum + "\n");

	}
}
