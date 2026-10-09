public class PriNotebook
{
	public static void main (String [] args)
	{
		Notebook obj1 = new Notebook("Gustavo");
		Notebook obj2 = new Notebook("Gustavo", "Acer");
		Notebook obj3 = new Notebook("Gustavo", "Acer", 2024);
		Notebook obj4 = new Notebook("Gustavo", "Acer", 2024, "Prata");
		Notebook obj5 = new Notebook("Gustavo", "Acer", 2024, "Prata", true);
		obj1.exibirDados();
		System.out.println(obj1.toString());
		obj2.exibirDados();
		System.out.println(obj2.toString());
		obj3.exibirDados();
		System.out.println(obj3.toString());
		obj4.exibirDados();
		System.out.println(obj4.toString());
		obj5.exibirDados();
		System.out.println(obj5.toString());
	}


}
