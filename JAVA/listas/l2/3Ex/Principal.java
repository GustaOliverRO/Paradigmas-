public class Principal
{
	public static void main(String [] args)
	{
		int cont = 0;
		Data dataAdaLovelace = new Data();
		Data dataGraceHopper = new Data();
		
		
		// Instanciando a Ada Lovelace
		dataAdaLovelace.ajustarData(9,12,1906);
		
		// Instanciando a Grace Hopper
		dataGraceHopper.ajustarData(10,	12,1815);
		
		// Imprimindo os dados
		System.out.print("A data de nascimento de Ada Lovelace:\n");
		dataAdaLovelace.imprimirData();
		System.out.print("A data de nascimento de Grace Hopper:\n");
		dataGraceHopper.imprimirData();
	}
}
