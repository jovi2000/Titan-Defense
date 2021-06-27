# Projeto `Titan Defense`

# Descrição Resumida do Projeto/Jogo

## Jogo e objetivo o jogador
> Titan Defense é um jogo estilo Tower Defense que funciona dentro de um espaço celular. O objetivo do jogador é defender a cidade, que fica no final do mapa, de criaturas hostis chamadas de "titãs".

## Mapa 
![MapaFinal](https://user-images.githubusercontent.com/62356359/123555138-3e77d000-d75a-11eb-8e10-06221883d25d.png)

## Torres
> * Torres: são construídas pelo jogador, atacam os titãs para impedi-los de chegarem na cidade e tem dois tipos (torre de flechas e torre canhão) com diferentes características, além disso elas podem ser evoluídas pelo jogador para que causem mais dano.

### Torre de Flechas
![torreFlechasAlcance](https://user-images.githubusercontent.com/62356359/123555332-81867300-d75b-11eb-9870-3d6db902e57e.png)
> * O quadrado verde representa a torre e os vermelhos representam as posições que a torre tem de alcance para dano. Como a torre de flechas só ataca uma posição por rodada, caso tenha mais de um titã em seu alcance ela precisa escolher um para atacar e a ordem de prioridade está representada na imagem (sendo o 1 a maior prioridade e o 4 a menor).

### Torre de Canhão
![TorreFlechas](https://user-images.githubusercontent.com/62356359/123555487-551f2680-d75c-11eb-9779-d88592b3fabb.png)
> * O quadrado verde representa a torre e os vermelhos representam as posições que a torre da dano. Como a torre de canhão tem dano em area, toda rodada três posições sofrem dano do canhão.

## Titãs
>* Titãs: são inimigos com objetivo de chegar na cidade para causar dano, andam em linha reta e a cada nova fase ficam mais fortes (a vida e o dano aumentam).

## Cidade
> A cidade fica no final do Mapa e a missão do jogador é proteger ela. Sempre que um titã consegue passar por todas as defesas e chegar vivo na cidade, ela perde uma certa quantidade de vida (depende do dano do titã). Se a vida da cidade acabar, o jogador perde o jogo.

## Fases e sistema de dinheiro
> * Fases: o jogo possui 10 fases e cada fase possui um certo número (que varia aleatoriamente). Antes do começo de cada fase o jogador tem a "fase de preparação" que consiste em um certo tempo para o jogador montar e evoluir suas defesas, nesse periodo não serão gerados titãs. Depois de todos os titãs da fase serem derrotados uma nova fase irá se iniciar.
> * Dinheiro: o jogo também possui um sistema de dinheiro para controlar a compra e a evolução de torres. Sempre que jogador passar de fase ou derrotar um titã ele será recompensado com uma certa quantidade de dinheiro. Esse dinheiro recebido poderá ser usado em toda "fase de preparação" com o intuito de melhorar as defesas.

# Equipe
* `João Vitor Viégas Barreira` - `175116`
* `Arimã da Silva Alves Batista` - `194347`

# Vídeos do Projeto

## Vídeo da Prévia
> https://drive.google.com/file/d/1E2VLxWiYAv0nPFHnypNZxOuoz48CBGjd/view

## Vídeo do Jogo
> <Coloque um link para o vídeo em que é demonstrada a versão final do jogo. Esse vídeo deve ter em torno de 5 minutos. Este vídeo não apresenta slides, nem substitui a apresentação final do projeto, que será feita por conferência. Ele mostra apenas o jogo em funcionamento.>

# Slides do Projeto

## Slides da Prévia
> https://drive.google.com/file/d/1OOp8SSEmv9yHHQGiwm8wtko_4qYf-cZQ/view

## Slides da Apresentação Final
`<Coloque um link para os slides da apresentação final do projeto.>`

## Relatório de Evolução

> <Relatório de evolução, descrevendo as evoluções do design do projeto, dificuldades enfrentadas, mudanças de rumo, melhorias e lições aprendidas. Referências aos diagramas e recortes de mudanças são bem-vindos.>

# Destaques de Código

> <Escolha trechos relevantes e/ou de destaque do seu código. Apresente um recorte (você pode usar reticências para remover partes menos importantes). Veja como foi usado o highlight de Java para o código.>

~~~java
// Recorte do seu código
public void algoInteressante(…) {
   …
   trechoInteressante = 100;
}
~~~

# Destaques de Pattern
`<Destaque de patterns adotados pela equipe. Sugestão de estrutura:>`

## Diagrama do Pattern
`<Diagrama do pattern dentro do contexto da aplicação.>`

## Código do Pattern
~~~java
// Recorte do código do pattern seguindo as mesmas diretrizes de outros destaques
public void algoInteressante(…) {
   …
   trechoInteressante = 100;
}
~~~

> <Explicação de como o pattern foi adotado e quais suas vantagens, referenciando o diagrama.>

# Conclusões e Trabalhos Futuros

> <Apresente aqui as conclusões do projeto e propostas de trabalho futuro. Esta é a oportunidade em que você pode indicar melhorias no projeto a partir de lições aprendidas e conhecimentos adquiridos durante a realização do projeto, mas que não puderam ser implementadas por questões de tempo. Por exemplo, há design patterns aprendidos no final do curso que provavelmente não puderam ser implementados no jogo -- este é o espaço onde você pode apresentar como aplicaria o pattern no futuro para melhorar o jogo.>

# Documentação dos Componentes

# Diagramas

## Diagrama Geral do Projeto

![Arquitetura Final](https://user-images.githubusercontent.com/62356359/123555578-f6a67800-d75c-11eb-8f23-ebfddb4af40e.png)


> <Faça uma breve descrição do diagrama.>

## Diagrama Geral de Componentes

### Exemplo 1

Este é o diagrama compondo componentes para análise:

![Diagrama Analise](diagrama-componentes-analise.png)

### Exemplo 2

Este é um diagrama inicial do projeto de jogos:

![Diagrama Jogos](diagrama-componentes-jogos.png)

### Exemplo 3

Este é outro diagrama de um projeto de vendas:

![Diagrama Vendas](diagrama-componentes-vendas.png)

Para cada componente será apresentado um documento conforme o modelo a seguir:

## Componente `<Nome do Componente>`

> <Resumo do papel do componente e serviços que ele oferece.>

![Componente](diagrama-componente.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `<caminho completo da classe com pacotes>` <br> Exemplo: `pt.c08componentes.s20catalog.s10ds.DataSetComponent`
Autores | `<nome dos membros que criaram o componente>`
Interfaces | `<listagem das interfaces do componente>`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](diagrama-interfaces.png)

Interface agregadora do componente em Java:

~~~java
public interface IDataSet extends ITableProducer, IDataSetProperties {
}
~~~

## Detalhamento das Interfaces

### Interface `<nome da interface>`

`<Resumo do papel da interface.>`

~~~
<Interface em Java.>
~~~

Método | Objetivo
-------| --------
`<id do método em Java>` | `<objetivo do método e descrição dos parâmetros>`

## Exemplo:

### Interface `ITableProducer`

Interface provida por qualquer fonte de dados que os forneça na forma de uma tabela.

~~~java
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
~~~

Método | Objetivo
-------| --------
`requestAttributes` | Retorna um vetor com o nome de todos os atributos (colunas) da tabela.
`requestInstances` | Retorna uma matriz em que cada linha representa uma instância e cada coluna o valor do respectivo atributo (a ordem dos atributos é a mesma daquela fornecida por `requestAttributes`.

### Interface `IDataSetProperties`

Define o recurso (usualmente o caminho para um arquivo em disco) que é a fonte de dados.

~~~java
public interface IDataSetProperties {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
~~~

Método | Objetivo
-------| --------
`getDataSource` | Retorna o caminho da fonte de dados.
`setDataSource` | Define o caminho da fonte de dados, informado através do parâmetro `dataSource`.

# Plano de Exceções

## Diagrama da hierarquia de exceções
`<Elabore um diagrama com a hierarquia de exceções como detalhado abaixo>`

![Hierarquia Exceções](exception-hierarchy.png)

## Descrição das classes de exceção

`<Monte uma tabela descritiva seguindo o exemplo>:`

Classe | Descrição
----- | -----
DivisaoInvalida | Engloba todas as exceções de divisões não aceitas.
DivisaoInutil | Indica que a divisão por 1 é inútil.
DivisaoNaoInteira | Indica uma divisão não inteira.
