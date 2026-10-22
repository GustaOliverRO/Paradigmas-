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

## Construtores
> De forma geral, contrutores é uma das várias subpartes da 
classe, como os métodos a exemplo. O construtor possui algumas 
peculiariedades como não ter tipo de retorno e ter o nome como o 
nome da classe do mesmo, sendo sua principal função instanciar os
atributos em tempo de "criação", podendo ser com valores default 
ou com valores já específicos. Uma característica interessante é 
que uma classe pode ter mais de um contrutor, todos com o mesmo 
nome, entretanto, são distinguidos pelo compilador do java pelos 
seus argumentos. 


## Atributo tipos Classe
> Aqui o foco é quando nossos objetos começam a ficar complexos 
ao ponto de não ter somente atributos trivias, com tipos 
"bases", mas começam a ter atributos que detenham de mais 
informações, a exemplo de uma Data, que é uma classe, e por sua 
vez terá atributos bases, construtores, métodos e etc. 

> Um ponto importante é como será feita essa associação, sempre 
será uma associação forte, entretanto, uma Classe A pode conter 
como atributo uma ou mais atributos da Classe B, isto é 
importante para a parte de representação no diagrama UML. 

> Para manusear esse atributo tipo classe dentro da classe que o 
detem será usado o auxílio do 'this.' e dos métodos 'get/set' da 
classe que está tendo a função de atributo.

## Herança
> De forma geral, a herança é uma forma de modularizar e propor 
uma reutilização de código de maneira a não gerar uma repetição, 
muitas vezes de atributos, por classes que possuem uma 
semelhança entre si. Exemplo as classes Veiculo, Carro, Moto;

> Inicia o conceito de superclasse e subclasse, sendo 
superclasses (pai), aquela que será herdada, subclasse (filho), 
aquela que herda informações da superclasse. De forma geral, 
toda moto e carro (subclasses) são um veículo (superclases), mas 
nem todos os veículos são motos e carros...

> Uma **subclasse** herda atributos e métodos de sua superclasse 
e os utiliza como se fossem declarados dentro da prórpia classe.

### Como implementar Herança
1. Usar a palavra **extends** nas subclasses, seguida do nome da 
superclasse ao lado;
2. Decalarar os atributos da superclasses como **protected**;
OBS: Membros de protected só pode ser acessados por membros da 
própria classe, por subclasses;

### Tipos de Herança 
> Herança Simples: uma classe é derivada de uma única 
superclasses;
> Herança Múltipla: uma classes é derivdada de mais de uma 
superclassse;
OBS: Java não possuiu hernaça kililpa

### Quando utilizar ?
> Usar a pergunta "É um ?"
> Todas as classes são subclasses da classe Object
- equals(Object obj): compara dois objetos e retorna se são 
iguais ou diferentens;
- hashCode(): retorna um código hash (int) para o objeto;

OBS: Nem todo relacionamento é de herança, de forma geral pode
levar o condeito de "É um" -> sim, mas em caso de 
"Tem um" -> não;

### Construtores - Herança
> Construtores de uma superclasse não são herdados pela 
subclasse, mas é possível "utilizá-lo" desde que use o 'super',
para instanciar o atributos herdados no construtor da subclasse.

### Métodos - Herança
> Pode ocorrer sobreposição de métodos da parte da subclasse com 
a superclasse, causando uma forma de "sobrecarga". Para isso, os
parametro, nome e o tipo de retorno precisam ser iguais e o nível
de acesso não pode ser mais seguro do que o da superclasse.
> Ou pode ser usada pela subclasse, desde que seja usado o 
'super' para fazer tal acesso do método da superclasse.
> Uso do '@Override';

### Classe Final ou Método Final
> Em ambos os casos, a ideia será de proibir e restringir tanto
a herança de uma classe por outra ou de proibir que um método 
seja sobrescrito "alterado". Assim restringindo um pouco da 
manipulação dos dados

## Sobrecarga

>
