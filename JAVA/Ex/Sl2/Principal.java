public class Principal
{
    public static void main (String [] args)
    {
        Funcionarios [] teste = new Funcionarios[2];
        teste[0] = new Funcionarios();
        teste[1] = new Funcionarios();

        teste[0].cadastrar("Gustavo", 2026, 20000.50);
        teste[0].exibirDados();

        teste[1].cadastrar("Edna", 1991, 55508.75);
        teste[1].exibirDados();
    }
}