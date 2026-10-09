public class Data
{
	// Atributos
	private boolean bissexto;
	private int dia;
	private int mes;
	private int ano;
	
	// Metodos
	
	public int getDia()
	{
		return this.dia;
	}
	
	public int getMes()
	{
		return this.mes;
	}
	
	public int getAno()
	{
		return this.ano;
		
	}
	
	public boolean isBissexto()
	{
		return this.bissexto
	
	
	// Corrigir para anos bisextos;
	public void setDia(int dia)
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
	
	public void setBissexto(boolean bissexto)
	{
		this.bissexto = bissexto;
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
	
	public void exibirDados()
	{
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);		
	}
	
}
