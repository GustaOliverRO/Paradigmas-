public class Pessoa
{
	// Atributos
 	private String nome;
 	private int idade;
 	private int dia;
 	private int mes;
 	private int ano;
 	
 	// Construtor
 	public Pessoa(){}
 	
 	// Metodos get e set
 	public String getNome() {return this.nome;}
 	
 	public int getIdade(){return this.idade;}
 	
 	public int getDia(){return this.dia;}
	
	public int getMes(){return this.mes;}
	
	public int getAno(){return this.ano;}
	
	public void setNome (String nome){this.nome = nome;}
	
	public void setIdade(int idade)
	{
		if(idade > 0)
			this.idade = idade;
	}
	
/*	public void setDia(int dia)
	{
		if(this.mes != 2)
			if(0 < this.mes && this.mes < 8)
				if((this.mes % 2) == 1)
					if(0 < dia && dia < 32)
						this.dia = dia;
				else if(0 < dia && dia < 31)
						this.dia = dia;
			else if(this.mes < 13)
				if((this.mes % 2) == 1)
					if(0 < dia && dia < 31)
						this.dia = dia;
				else if(0 < dia && dia < 32)
						this.dia = dia;
		else if(this.bissexto)
				 	if(0 < dia && dia < 30)
				 		this.dia = dia;
				 else if(0 < dia && dia < 29)
				 		this.dia = dia;
	}
	
	public void setMes(int mes)
	{
		if(0 < mes && mes < 13)
			this.mes = mes;
	}
	
	public void setAno(int ano)
	{
		if(0 < ano)
			this.ano = ano;
	}
	*/
	// Outros metodos
	
	public void ajustarDataDeNascimento(int diaDeNasc, int mesDeNasc, int anoDeNasc)
	{
		this.dia = diaDeNasc;
		this.mes = mesDeNasc;
		this.ano = anoDeNasc;
	}
 	
 	public String retornarNome(){return this.nome;}
 	
 	public int retornarIdade(){return this.idade;}
 	
 	public void calcularIdade(int diaAtual, int mesAtual, int anoAtual)
 	{
 		int idade = anoAtual - this.ano;

 		if(mesAtual < this.mes){idade--;}
 		else if(mesAtual == this.mes)
 			{
 				if(diaAtual < this.dia){idade--;}
 			}
 			
 		this.idade = idade;
  	}


}

