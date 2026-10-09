public class PrincipalData
{
	public static void main (String [] args)
	{
		Data dataCarnaval = new Data();
		Data dataBirth = new Data();
		
		// Data carnaval será 22/02/2027
		dataCarnaval.setMes(02);
		dataCarnaval.setDia(22);
		dataCarnaval.setAno(2027);
		System.out.print("Carnaval: ");
		dataCarnaval.exibirDados();
		
		// Data aniversário será 26/07/2006 
		dataBirth.setMes(07);
		dataBirth.setDia(26);
		dataBirth.setAno(2027);
		System.out.print("Aniversário: ");
		dataBirth.exibirDados();
		
		// Perguntar para a professora se esse print na main
		// é um tipo de corrupção de dados ou de manuseio de 
		// objetos em java ?
	}
}
