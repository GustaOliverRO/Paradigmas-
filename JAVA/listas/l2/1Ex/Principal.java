public class Principal
{
	public static void main(String [] args)
	{
		Pessoa GraceHopper = new Pessoa();
		Pessoa AdaLovelace = new Pessoa();
		
		// Instanciando a Grace Hopper
		GraceHopper.ajustarDataDeNascimento(9,10,1906);
		GraceHopper.setNome("Grace Hopper");
		
		
		// Instanciando a Ada Lovelace
		AdaLovelace.ajustarDataDeNascimento(10,10,1815);
		AdaLovelace.setNome("Ada Lovelace");
		// Calculando as idades de ambas hoje
		GraceHopper.calcularIdade(10,10,2026);
		AdaLovelace.calcularIdade(10,10,2026);		
		
		// Imprimindo os dados
		System.out.printf("A idade de %s hoje eh %d.\n", GraceHopper.retornarNome(), GraceHopper.retornarIdade());
		System.out.printf("A idade de %s hoje eh %d.\n", AdaLovelace.retornarNome(), AdaLovelace.retornarIdade());
				 
	}
}
