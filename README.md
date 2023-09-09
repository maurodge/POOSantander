# INTRODUÇÃO DO MÓDULO 
- Parte teórica - Exemplos em SRC
Códigos de exemplo retirados do curso de Fundamentos da Programação Orientada a Objetos com Java da DIO professor ![Gleyson Sampaio](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/enums).

## Tipos de Linguagem

- **Baixo nível:**  Linguagens mais próximas a interpretação da máquina. <b>Assembly, C etc</b>
- **Alto nível:**  Linguagens que disponibilizam uma proposta de sintaxe, mais próxima da interpretação humana. <b>Java, JS, Python, C++ etc </b>

## Programação Estruturada

É um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um programa de computador.

<b>Principais ferramentas na programação estruturada</b>
    - Estruturas de fluxo de controle;
    - Estruturas de repetição;
    - Estrutura de blocos;
    - Estruturas de sub-rotinas.

Esta estrutura é montada de forma que haja uma sequência de ações, <b> procedimentos lineares </b>, podendo afetar as variáveis, tanto de escopo global quanto de escopo local em uma aplicação.

# POO - Progração Orientada a Objetos

É um paradigma de programação baseado no conceito de <b> objetos </b>, que podem conter dados na forma de campos/ <b>atributos</b>, e códigos na forma de procedimentos/<b>métodos</b>.

A <b>programação estruturada</b> é voltada a <b>procedimentos e funções</b> definidas pelo usuário, já a <b>POO</b>, conceitos como <b>classes e objetos</b>.

## Classes

Toda a estrutura de código na linguagem Java é distribuído em arquivos com a extensão .java denominados de classe.

As <b>Classes</b> existentes nos projetos serão compostas por:

### Identificador, Características e Comportamentos.

- **Classe (class):**              Estrutura e/ou representação que direciona a criação dos objetos de um mesmo tipo;      Exemplo: Carro (genérico)
- **Identificador (identity):**    Propósito existencial aos objetos que serão criados;                                    Exemplo: Nome dessa classe
- **Características (states):**    São os atributos ou propriedades, é toda informação que representa o estado do objeto;  Exemplo: Ano, modelo, motor, cor...
- **Comportamento (behavior):**    São as ações ou métodos, é a parte comportamental que um objeto dispõe;                 Exemplo: Acelera, freia, é vendido, é comprado...
- **Instanciar (new):**           É o ato de criar um objeto a partir de uma estrutura definida de uma classe.             Exemplo: Realização literal daquele objeto com seus atributos, disponibilizando-o para os métodos.
Exemplo em código: classe Student e classe school.

## Convenções de Categorias de Classes

- **Modelo (model):** classes que representam uma estrutura de domínio da aplicação, exemplos: Cliente, Pedido, Nota Fiscal etc
- **Serviço (service):** classes que contém regras de negócio e validação do sistema, exemplos: formato de dados (validação), controle de estoque, controle de produção etc
- **Repositório (repository):** classes que contém uma integração com o banco de dados.
- **Controle (controller):** classes que possuem a finalidade de disponibilizar alguma comunicação externa à aplicação, exemplos: armanezamento de info em banco de dados, http web e webservices
- **Utilitaria (util):** que contém recursos comum à toda aplicação, exemplo: calculos fixos, como de aliquotas de imposto etc

Exemplos de nomes e convenções: 

 | Atributos | Serviços | Ferramentas | Repositorios |
 | ----- | ----- | ----- | ----- |
 | Veículo | VeiculoService | Calculadora | VeiculoRepository |
 | Cliente | ClienteService | ValidadorUtil | ClienteRepository |
 | Colaborador | OficinaService | FormatadorUtil | PecaRepository |

 # Pacotes - PACKAGES

 A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão a banco de dados... Para melhor separar essas classes, são criados pacotes separando as <b>CATEGORIAS DE CLASSES</b>. São subdiretorios a partir da pasta src do projeto.

### Convenções
Exemplo: empresa chamada Power

### Nomenclatura

- **Comercial:** com.power
- **Governamental:** gov.power
- **Código aberto:** org.power;

### Categoria de classe

- **model:**        classes que representam uma camada e modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuario...
- **repository:**   classes e interfaces que vão interagir com o banco de dados: ClienteRepository
- **service:**      classe que contém regras de negócio e validações
- **controller:**   disponibiliza os recursos da aplicação a outras aplicações via HTTP
- **view:**         classes com interação à interface gráfica acessada pelo usuário
- **util:**         classes utilitarias do sistema;

### Identificação

- A classe dentro de um pacote passa a ter duas identificações, por exemplo uma classe de usuário no pacote com.controle.acesso.model, seria com.controle.acesso.model.usuario

## "Package vs Import"

A localização da classe é definida pela palavra reservada package, uma classe só contém uma definição de package no arquivo, SEMPRE NA PRIMEIRA LINHA DO CÓDIGO. Para a utilização de uma classe existente em outro pacote, é necessário realizar a importação da classe, portanto ficaria:


```
    package .....
    
    import .....
    import .....

    public class MinhaClass {

    }
```

## Visibilidade dos Recursos

<h3> Modificadores de acesso </h3>

- **public;**
- **protected;**
- **default;**
- **private.**

<h3>Tabela de acessibilidade</h3>

| Visibilidade/Acessibilidade | public | Protected | default | private |
| --- | --- | --- | --- | --- |
| Mesma class | SIM | SIM | SIM | SIM |
| Qlqr class mesmo package | SIM | SIM | SIM | **NÃO** |
| Qlqr class filha mesmo package | SIM | SIM | SIM | **NÃO** |
| Qlqr class filha qlqr package | SIM | SIM | **NÃO** | **NÃO** |
| Qlqr class em qlqr package | SIM | **NÃO** | **NÃO** | **NÃO** |

![Exemplo em código](link do codigo)

## Getters and setters

São métodos utilizados para buscar (**getter**) valores de atributos ou definir (**setter**) novos valores de atributos de instâncias de classes.

O método getter retorna o valor do atributo especificado.

O método setter define um novo valor para o atributo especificado.
Exemplo:
```
//arquivo Aluno.java
public class Aluno {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = idade;
	}
}
```
```
//arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Felipe");
		aluno1.setIdade(8);
		
		System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos ");	

                // O retorno será: O aluno Felipe tem 8 anos
	}
}
```
### Regras

- Os atributos precisam ter o modificador de acesso private;
- Os acessos aos atributos serão feitos por meio dos métodos get e set;
- O método get precisa ser public, pois será chamado em outro package;
- O método set precisa der public para receber o valor em outra package, e como o método não retorna nenhum valor (apenas armazena em um vetor ou matriz, por exemplo) precisa ser void.

Esses metodos podem ser chamados para serem escritos por meio de atalho na IDE.

**ATENÇÃO:** ter mto critério ao utilizar o método set, as vezes não é interessante que se possa mudar livremente o valor de algum atributo, quando isto depende de um outro método, se exclui o médoto set daquele atributo mas não o get. Exemplo: a mudança de valor em uma conta de banco depoende do método depósito, e não de um set direto no atributo saldoConta.

## Construtores

Para **criar/instanciar** um objeto na linguagem Java é utilizada a estrutura a seguir
```
Classe novoObjeto = new Classe();
```
Com isto é criado na memória um novo objeto.
Ao fazê-lo, é possivel que a linguagem já solicite os valores de alguns atributos deste objeto. Por exemplo em uma classe Pessoa onde há os campos(atributos) de CPF, Nome, RG, email...
```
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;

        // metodo construtor (note que não foi feito o método set para cpf e nome)
        public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
        }
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}

```
```
public class SistemaCadastro {
	public static void main(String[] args) {

		//criamos uma pessoa no sistema
        // aqui é preciso definir os valores dos atributos que estão no método contrutor
		Pessoa pessoa1 = new Pessoa("100.100.100-65" , "Pedro Felipe" );
		
		//definimos o endereço de pessoa1
		marcos.setEndereco("RUA DAS MARIAS");
	
		//imprimindo o pessoa1 sem o nome e cpf
		
		System.out.println(pessoa1.getNome() + "-" + pessoa1.getCpf());
	}
}

```

**ATENÇÃO:** não usar o método construtor para todo e qualquer atributo indiscriminadamente, pensar quais são os atributos realmente necessários para aquele objeto.

**ATENÇÃO:** vale criar um construtor sem atributos obrigatórios, e também vale ter mais de um construtor para o mesmo objeto.

## ENUMS

Enum é um tipo especial de classe onde os objetos são previamente criados **IMUTÁVEIS E DISPONÍVEIS POR TODA APLICAÇÃO.**

Quando usar?

Quando no modelo de negócio existe objetos do mesmo contexto (uma classe de objetos) já pré-estabelecidos e que com certeza não sofrerão alterações. Exemplos: Classe de estados brasileiros, estados civis, escolaridade... 

Estes objetos do Enum podem ter varios atributos, como por exemplo, os estados brasileiros (objetos) que tem uma sigla (atributo), um nome (atributo), uma região (atributo)...

Os enums estruturam-se tambem com construtores e getters. Exemplo:
```
// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}

```
```
// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	}
}

```


Códigos de exemplo retirados do curso de Fundamentos da Programação Orientada a Objetos com Java da DIO professor ![Gleyson Sampaio](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/enums).
