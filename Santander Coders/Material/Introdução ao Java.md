# Introdução ao Java

Java é uma linguagem de programação orientada a objetos, criada pela Sun Microsystems em 1995 que, posteriormente, foi adquirida pela Oracle. Apesar disso, a linguagem Java (que também pode ser referida como uma plataforma) é mantida pela JCP (Java Community Press) que organiza as discussões e mudanças através de JSR (Java Specification Requests).

Com o sucesso da internet, também surgiram problemas. Um deles é que, com diversos sistemas operacionais surgindo, um código era escrito por um determinado sistema operacional, gerava um executável, como o ".exe" (no Windows) e esse código só funcionava naquele determinado sistema operacional.

![Novo problema](https://s3-sa-east-1.amazonaws.com/lcpi/d0c0f7f6-35dd-48c3-90ca-8902d1714a20.png)

**Figura 1** – Arquitetura_execução (Fonte da imagem:da autora)

Com isso, foi decidido resgatar uma ideia que não foi bem-sucedida para problemas anteriores e aplicá-la no novo problema. Um código escrito em uma única linguagem, o Java, iria gerar um executável, o *bytecode* Java. Esse executável seria lido e entendido por uma máquina virtual (JVM) e convertido para ser executado no sistema operacional destino.

![resolucao](https://s3-sa-east-1.amazonaws.com/lcpi/ba5c98f0-d0af-4318-806e-34d3ff1e6503.png)

**Figura 2** – resolução (Fonte da imagem:da autora)

O principal diferencial do Java quando foi lançado era o seu suporte multiplataforma, propagado sob o slogan "Write once, run everywhere". Comparada às linguagens da época, distribuídas na forma de código-objeto, Java trazia o diferencial de que seu código era compilado para uma linguagem intermediária (o bytecode), sendo este interpretado por uma **Java Virtual Machine (JVM).** Esse ambiente virtual, sim, sendo dependente de sistema operacional e arquitetura de processadores.

\#![Uma visão geral do processo de desenvolvimento de software. - https://docs.oracle.com/](https://user-content.gitlab-static.net/165b8505c534ed8eec5b6bbf57e41f09ab4b8779/68747470733a2f2f646f63732e6f7261636c652e636f6d2f6a61766173652f7475746f7269616c2f666967757265732f676574537461727465642f676574537461727465642d636f6d70696c65722e676966)

**Figura 3** – Uma visão geral do processo de desenvolvimento de software (Fonte da imagem: [Docs oracle](https://docs.oracle.com/))

## JDK e JRE

- **Java Development Kit - JDK** é basicamente, um conjunto de utilitários, um pacote de software que nos entrega todo o ambiente necessário para que seja possível desenvolver aplicações em Java como bibliotecas, JVM e o compilador.
- **Java Runtime Environment** é uma camada de software, que é executado sobre um sistema operacional, e nos fornece os recursos necessários (bibliotecas de classe e a JVM) para ter um ambiente que seja possível executar programas em Java.

## Configuração de ambiente

Para fazer a configuração do seu ambiente local Java, você precisa:

1. Fazer o download de uma JDK no link a seguir, escolher a versão do Java que você quer instalar e a versão compatível com seu sistema operacional. [Download JDK](https://www.oracle.com/java/technologies/downloads/)
2. Criar a variável de ambiente $JAVA_HOME e adicionar a pasta $JAVA_HOME/bin ao $Path. Você pode verificar como criar essa variável de ambiente de acordo com seu sistema operacional no link a seguir. (https://www.java.com/pt-BR/download/help/path_pt-br.html)
3. Adquirir/instalar uma IDE. Recomendamos o uso do IntelliJ Idea Community (essa é a versão gratuita, enquanto a Ultimate é a versão paga). [Download IntelliJ](https://www.jetbrains.com/pt-br/idea/download/)

Agora que entendemos um pouco mais da história do Java, suas ferramentas e como podemos obter um ambiente para a criação de nossas aplicações, podemos começar a nos aprofundar na linguagem nos próximos tópicos.

### Materiais complementares

- https://www.oracle.com/java/technologies/javase-documentation.html

### Referências

- https://www.devmedia.com.br/java-historia-e-principais-conceitos/25178
- https://www.oracle.com/java/technologies/javase-documentation.html