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
> * Fases: o jogo possui 10 fases, cada fase possui um número de rodadas e um certo número (que varia aleatoriamente). Antes do começo de cada rodada o jogador tem a "preparação das defesas" que consiste no tempo para o jogador montar e evoluir suas defesas. Depois da "preparação das defesas" o jogador pressiona o botão "Play" e a rodada começa. Durante a rodada ocorrem certas ações na seguinte ordem: os titãs se movem (caso haja titãs no mapa), titãs são gerado(caso ainda tenham titãs para serem gerados na fase) e as torres atacam(caso haja titãs no mapa).
> * Dinheiro: o jogo também possui um sistema de dinheiro para controlar a compra e a evolução de torres. Sempre derrotar um titã ele será recompensado com uma certa quantidade de dinheiro. Esse dinheiro recebido poderá ser usado na "preparação das defesas" com o intuito de melhorar a defesa da cidade.

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

> * GameView: componente que implementa a interface gráfica e que recebe o que é feito pelo jogador, como por exemplo a construção de uma torre. Sempre que o jogador realiza uma nova ação o GameView solicita ao Controller para que ele realize as modificações necessárias.
> * Controller: componente que recebe ações do GameView e se comunica diretamente com o Model para realizar as modificações e ações solicitadas. Cada componente do Controller possui seu próprio Model e só pode se comunicar diretamente com ele. Caso um componente do Controller deseje algum dado ou alguma modificação em outro Model que não seja o dele, ele precisa se comunicar com o Controller daquele Model.
> * Model: componente que armazana todas os dados (em atributos) dos modelos das Entidades(Cidade, Titã e Torre) e do Mapa. Caso um controller deseje receber ou modificar um dado, ele sempre precisa se comunicar com o Model. 

## Diagrama Geral de Componentes

## Componente `GameView`

> Componente que implementa a interface gráfica e que recebe as ações realizadas pelo jogador

![GameView](https://user-images.githubusercontent.com/62356359/123559745-56f4e400-d774-11eb-968f-9b55188395c7.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `view.GameView`
Autores | `João Barreira e Arimã Batista`
Interfaces | `IMapaController, ICidadeController, ITitaController, ITorreController`

## `Controller`

> Componente que recebe ações do GameView e se comunica diretamente com o Model para realizar as modificações e ações solicitadas

![Controller](https://user-images.githubusercontent.com/62356359/123563407-d7beda80-d78a-11eb-975a-e8e4968ac6c0.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `package controller (Esse componente é um conjunto de 5 classes)`
Autores | `João Barreira e Arimã Batista`
Interfaces | `IMapaController, ICidadeController, ITitaController, ITorreController, IMapaModel, ICidadeModel, ITitaModel, ITorreModel`

## `Model`

> Componente que armazana todas os dados (em atributos) dos modelos das Entidades(Cidade, Titã e Torre) e do Mapa

![Model](https://user-images.githubusercontent.com/62356359/123565426-3720e880-d793-11eb-9ead-60b8e0db4f3d.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `package model (Esse componente é um conjunto de 7 classes)`
Autores | `João Barreira e Arimã Batista`
Interfaces | `IEntidade, IMapaModel, ICidadeModel, ITitaModel, ITorreModel`

### Interfaces

Interfaces associadas a esse componente:

![Model_Interfaces](https://user-images.githubusercontent.com/62356359/123567693-283d3480-d799-11eb-8675-8644337902cb.png)

Interfaces herdeiras de IEntidade:

~~~java
public interface ICidadeModel extends IEntidade{...}
public interface ITitaModel extends IEntidade {...}
public interface ITorreModel extends IEntidade {...}
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
