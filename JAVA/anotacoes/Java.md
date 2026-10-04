# JAVA ESTUDO

## INTRODUÇÃO A LINGUAGEM JAVA

> Uma linguagem com orientada a objetos, com portabilidade e 
gerência automática de memória (garbecolector).

> Composta por dois ambientes: 

>> Ambiente de desenvolvimento - JDK (Java Development Kit)
>> Ambiente de Execução - JRE (Java Runtime Environment)

> JRE, JVM, JDK;
> JSE, JEE, JME;

### Programa Principal

> Todo programa Java consiste de pelo menos uma declaração de
classe definida pelo programador. Introduzida pela palavra
**class** seguida pelo nome da classe.

>> Regras para nomes de classes
- Primeiro caractere: letra, underscore, cifrão;
- Após o primeiro caractere: qualquer letra ou número;
- Não é permitido espaço em branco e operadores;
- Não é permitido palavras reservadas;
- Convenção de Código: Nomes de classes iniciam com letra 
maiúscula e apresentam a letra iniciam de cada palavra do nome
em maiúsculo;

>> Instrução de Saída
- 'System.out'
- System.out.print:
- System.out.println:
- System.out.printf:

> **Import**, é usado para o compilador localizar uma classe, 
"equivalente" ao include;

> Qual a intrução para leitura de dados númericos no JAVA?
- 

> Palavra-chave **final** serve para especificar que uma variável
não é modificável (constante) e que qualquer tentativa de
modificar é um erro.

***Fazer Exercicios do Slide 1;***

## Classe e Objeto

> **Classe**, representa um grupo de objetos com características
(atributos) e comportamentos (métodos) semelhantes.

>> Convenção
- Nome Simples, inicial em maiúsculo.
- Nome composto, inicial da primeira e das demais palavras em 
maiúsculo.
- EX:
-	public class <Nome da classe>{
-		// Atributos
-		//	Metodos
-	}

>> Atributos da Classe 
- Quais seriam os atributos de um funcionário ?

>>> Declaração de atributos:

- <modificador_acesso><tipo><identificador>
- **Modificador de Acesso**: visibilidade do atributo
1. Publico (public): visível a todas as classes.
2. Privado (private): visível somente na classe em que está.
3. Protegido (protected): visível na classe em que está e na 
classe pai (Herança).

- **Tipo**: valor a ser armazenado, o "tamanho" do dado
- **Identificador**: nome do atributo
1. Nome simples: inicial em minúsculo.
2. Nome composto: (snake) inicial em minúsco e demais palavras
com inicial em maísculo.

>> Métodos da Classe
- **Método** são responsáveis pelo comportamento do objeto.

>>> Declaração de métodos
- <modif_acesso><tipo><identificador>(parâmetros){}
- **Modificador de Acesso**: visibilidade do método.
- **Tipo**: valor retornado pelo método
1. Quando não retorna nada *void*.
2. Quando retornar colocar o tipo da estrutura retornada.
-> Incluir a palavra **return**
- **Identificador**: nome do método (mesma regra do atributo).
- **Parâmetro**: informações passadas para o método.

>>> Palavra-chave **this**, usada para referenciar um atributo
da classe. Diferencia uma variável de escopo (parâmetro) de uma 
variável de classe (atributo). (Melhor legibilidade de código)

>>> **REPRESENTAÇÃO UML**

>>> **Método toString()**, retorna a representação textual de um
objeto, nome@codigo(representação id em hexadecimal)

***Fazer Exercicios do Slide***

## Arrays em Java

> **Array** é um grupo de variáveis que contém valores que são 
do mesmo tipo. 
- Array são objetos.
- Possui métodos já implementados para algumas manipulações.
- Ver sobre o método length e se há outros já prontos.

> Para criar arrays usa-se a palavra-chave **new**, especificando
o tipo dos elementos do array e o número de elementos.

>> **Array Unidimencional**
- Ex.1 - tipo primitivo
- int [] x;
  x = new [6];
- Ex.2 - tipo referência
- Funcionario [] x = new [7];

>> **Array Multidimencional**
- Ex.1 
- int [][] m;
  m = new int[3][4];
- Ex.2
- int [][] m = {{1,2},{]3,4},{5,6}};

## Encapsulamento

