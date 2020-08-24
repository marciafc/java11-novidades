# Algumas das novidades do Java 11

Exemplos baseados nos tutoriais:

  - [Java 11: funcionalidades e principais novidades](https://www.zup.com.br/blog/java-11-principais-novidades)
  
  - [As boas partes do Java 11](https://www.devmedia.com.br/as-boas-partes-do-java-11/40193)

## javac + java => java 

"*Antes era preciso compilar um arquivo Java usando javac primeiro, agora você pode usar o comando java diretamente e a compilação vai ser implícita antes da execução. Essa funcionalidade chegou após a especificação JEP 330.*"

## Cliente HTTP

Java 9
  - Incluiu cliente HTTP ao conjunto de APIs da plataforma a partir da inclusão do pacote jdk.incubator.http 

- Java 11
  - Troca do pacote jdk.incubator.http por java.net.http
  
  - Modelo não blocante de comunicação 
  
  - Suporte ao HTTP 1.1/2 (opção mais robusta comparada a API URLConnection)