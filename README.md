<h3>Tecnologias Ultilizadas:</h2>

Java<br>
Spring Boot<br>
Loobok<br>
Maven<br>

<h3>Instruções de como executar o projeto:</h3>

JDK (Java Development Kit) 1.8 ou superior.<br>
Instalar lombok na IDE<br>

<h3>No terminal do seu sistema operacional</h3>

Executar os testes da aplicação

mvn test
   
Executar a aaplicação  o comando abaixo

mvn spring-boot:run
  
<h3>Após executar API.</h3>

Documentação:
  
http://localhost:8080/swagger-ui.html

Request post:

Http://localhost:8080/validator

payload:

{<br>
  "password": "AbTp9!fok"<br>
}

<h3>Decisão:</h3>

Após analise, identifiquei duas formas de realiazar o desafio, Expressão Regular e Logica de programação fazendo tratamento de cada função separada.
Criei 2 Service Impl, um com a Logica de Programação "ValidatorServiceLogicImpl" e outro da expressão regular "ValidatorServiceRegexImpl".
Deixei ativo o da Logica, para uma possivel analise no conhecimento de logica, claro que a expressão regular num projeto seria mas aconselhável devido ser mas performatico.

  
<h3>Descrição do problema</h3>

Considere uma senha sendo válida quando a mesma possuir as seguintes definições:<br>

Nove ou mais caracteres<br>
Ao menos 1 dígito<br>
Ao menos 1 letra minúscula<br>
Ao menos 1 letra maiúscula<br>
Ao menos 1 caractere especial<br>
Considere como especial os seguintes caracteres: !@#$%^&*()-+<br>
Não possuir caracteres repetidos dentro do conjunto<br>
<b><br>Exemplo:<br></b>

IsValid("") // false	<br>
IsValid("aa") // false	<br>
IsValid("ab") // false	<br>
IsValid("AAAbbbCc") // false	<br>
IsValid("AbTp9!foo") // false	<br>
IsValid("AbTp9!foA") // false	<br>
IsValid("AbTp9 fok") // false	<br>
IsValid("AbTp9!fok") // true	<br>

Nota: Espaços em branco não devem ser considerados como caracteres válidos.<br>

<a>https://github.com/itidigital/backend-challenge</a>