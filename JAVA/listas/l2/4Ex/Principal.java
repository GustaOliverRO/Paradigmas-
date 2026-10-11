public class Principal
{
	public static void main(String [] args)
	{
		Pessoa AdaLovelace = new Pessoa ();
		Pessoa GraceHopper = new Pessoa ();
		
		// Instanciando a Ada Lovelace
		AdaLovelace.setNome("Ada Lovelace");
		AdaLovelace.ajustarData(10,10,1815);
		AdaLovelace.calcularIdade(11,10,2026);
				
		// Instanciando a Grace Hopper
		GraceHopper.setNome("Grace Hopper");		
		GraceHopper.ajustarData(9,10,1906);
		GraceHopper.calcularIdade(11,10,2026);
		
		// Imprimindo dados do objeto AdaLovelace
		System.out.printf("%s, idade %d.\n", AdaLovelace.retornarNome(), 
		AdaLovelace.retornarIdade());
		AdaLovelace.imprimirData();

		// Imprimindo dados do objeto GraceHopper
		System.out.printf("%s, idade %d.\n", GraceHopper.retornarNome(), 
		GraceHopper.retornarIdade());
		GraceHopper.imprimirData();

	}
}
