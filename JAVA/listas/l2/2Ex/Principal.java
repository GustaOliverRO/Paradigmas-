public class Principal
{
	public static void main(String [] args)
	{
		int cont = 0;
		Pessoa [] vet = new Pessoa[2];
		
		vet[0] = new Pessoa();
		vet[1] = new Pessoa();
		
		// Instanciando a Grace Hopper
		vet[0].ajustarDataDeNascimento(9,10,1906);
		vet[0].setNome("Grace Hopper");
		
		
		// Instanciando a Ada Lovelace
		vet[1].ajustarDataDeNascimento(10,10,1815);
		vet[1].setNome("Ada Lovelace");
		
		// Calculando as idades de ambas hoje
		vet[0].calcularIdade(10,10,2026);
		vet[1].calcularIdade(10,10,2026);		
		
		while(cont < 2)
		{
			// Imprimindo os dados
			System.out.printf("A idade de %s hoje eh %d.\n",
			vet[cont].retornarNome(), vet[cont].retornarIdade());
			cont++;
		}
				 
	}
}
