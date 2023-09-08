# INTRODUÇÃO DO MÓDULO - Parte teórica - Exemplos em SRC

## Tipos de Linguagem

<b>Baixo nível: </b> Linguagens mais próximas a interpretação da máquina. <b>Assembly, C etc</b>
<b>Alto nível: </b> Linguagens que disponibilizam uma proposta de sintaxe, mais próxima da interpretação humana. <b>Java, JS, Python, C++ etc </b>

## Programação Estruturada

É um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um programa de computador.
<b>Principais ferramentas na programação estruturada</b>
    - Estruturas de fluxo de controle;
    - Estruturas de repetição;
    - Estrutura de blocos;
    - Estruturas de sub-rotinas.

Esta estrutura é montada de forma que haja uma sequência de ações, <b> procedimentos lineares </b>, podendo afetar as variáveis, tanto de escopo global quanto de escopo local em uma aplicação.

## POO - Progração Orientada a Objetos

É um paradigma de programação baseado no conceito de <b> objetos </b>, que podem conter dados na forma de campos/ <b>atributos</b>, e códigos na forma de procedimentos/<b>métodos</b>.

A <b>programação estruturada</b> é voltada a <b>procedimentos e funções</b> definidas pelo usuário, já a <b>POO</b>, conceitos como <b>classes e objetos</b>.

## Classes

Toda a estrutura de código na linguagem Java é distribuído em arquivos com a extensão .java denominados de classe.

As <b>Classes</b> existentes nos projetos serão compostas por:

### Identificador, Características e Comportamentos.

<b>Classe (class):</b>              Estrutura e/ou representação que direciona a criação dos objetos de um mesmo tipo;      Exemplo: Carro (genérico)
<b>Identificador (identity):</b>    Propósito existencial aos objetos que serão criados;                                    Exemplo: Nome dessa classe
<b>Características (states):</b>    São os atributos ou propriedades, é toda informação que representa o estado do objeto;  Exemplo: Ano, modelo, motor, cor...
<b>Comportamento (behavior):</b>    São as ações ou métodos, é a parte comportamental que um objeto dispõe;                 Exemplo: Acelera, freia, é vendido, é comprado...
<b>Instanciar (new):</b>            É o ato de criar um objeto a partir de uma estrutura definida de uma classe.            Exemplo: Realização literal daquele objeto com seus atributos, disponibilizando-o para os métodos.
Exemplo em código: classe Student e classe school.

## Convenções de Categorias de Classes.

 <b>Modelo (model):</b> classes que representam uma estrutura de domínio da aplicação, exemplos: Cliente, Pedido, Nota Fiscal etc
 <b>Serviço (service):</b> classes que contém regras de negócio e validação do sistema, exemplos: formato de dados (validação), controle de estoque, controle de produção etc
 <b>Repositório (repository):</b> classes que contém uma integração com o banco de dados.
 <b>Controle (controller):</b> classes que possuem a finalidade de disponibilizar alguma comunicação externa à aplicação, exemplos: armanezamento de info em banco de dados, http web e webservices
 <b>Utilitaria (util):</b> que contém recursos comum à toda aplicação, exemplo: calculos fixos, como de aliquotas de imposto etc

Exemplos de nomes e convenções: 

 | Atributos | Serviços | Ferramentas | Repositorios |
 | ----- | ----- | ----- | ----- |
 | Veículo | VeiculoService | Calculadora | VeiculoRepository |
 | Cliente | ClienteService | ValidadorUtil | ClienteRepository |
 | Colaborador | OficinaService | FormatadorUtil | PecaRepository |

 ## Pacotes - PACKAGES

 A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão a banco de dados... Para melhor separar essas classes, são criados pacotes separando as <b>CATEGORIAS DE CLASSES</b>. São subdiretorios a partir da pasta src do projeto.

 <b>Convenções:</b>
Ex. empresa chamada Power

    Nomenclatura:
            - Comercial: com.power
            - Governamental: gov.power
            - Código aberto: org.power
    
    Categoria de classe:
            - model:        classes que representam uma camada e modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuario...
            - repository:   classes e interfaces que vão interagir com o banco de dados: ClienteRepository
            - service:      classe que contém regras de negócio e validações
            - controller:   disponibiliza os recursos da aplicação a outras aplicações via HTTP
            - view:         classes com interação à interface gráfica acessada pelo usuário
            - util:         classes utilitarias do sistema

    Identificação: 
            - a classe dentro de um pacote passa a ter duas identificações, por exemplo uma classe de usuário no pacote com.controle.acesso.model, seria com.controle.acesso.model.usuario


## Package vs Import

    A localização da classe é definida pela palavra reservada package, uma classe só contém uma definição de package no arquivo, SEMPRE NA PRIMEIRA LINHA DO CÓDIGO. Para a utilização de uma classe existente em outro pacote, é necessário realizar a importação da classe, portanto ficaria:

    package .....
    
    import .....
    import .....

    public class MinhaClass {

    }

    
