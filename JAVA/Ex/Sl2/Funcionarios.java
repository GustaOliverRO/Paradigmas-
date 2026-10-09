public class Funcionarios
{
    // Atributos
    public String nome;
    public int anoDeContra;
    public double salario;

    public void cadastrar(String nome, int anoDeContra, double salario)
    {
        this.nome = nome;
        this.anoDeContra = anoDeContra;
        this.salario = salario;
    }

    public void exibirDados()
    {
        System.out.print("Nome: " + this.nome + "\n");
        System.out.print("Ano: " + this.anoDeContra + "\n");
        System.out.print("Salario: " + this.salario + "\n\n");
    }
}