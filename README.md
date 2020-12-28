#Tecnologias Ultilizadas:

Java
Spring Boot
Loobok
Maven

#Instruções de como executar o projeto:

JDK (Java Development Kit) 1.8 ou superior.
Apache Maven 3.2.3 - Para baixar as dependencias da aplicação
Instalar lombok na IDE

# No terminal do seu sistema operacional

Executar os testes da aplicação

mvn test
   
Executar a aaplicação  o comando abaixo

mvn spring-boot:run
  
## Após executar API.

Documentação:
  
http://localhost:8080/swagger-ui.html

Request post:

Http://localhost:8080/validator

payload:

{
  "password": "AbTp9!fok"
}

## Decisão:

Após analise, identifiquei duas formas de realiazar o desafio, Expressão Regular e Logica de programação fazendo tratamento de cada função separada.
Criei 2 Service Impl, um com a Logica de Programação "ValidatorServiceLogicImpl" e outro da expressão regular "ValidatorServiceRegexImpl".
Deixei ativo o da Logica, para uma possivel analise no conhecimento de logica, claro que a expressão regular num projeto seria mas aconselhável devido ser mas performatico.

  
#Descrição do problema

Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

Nove ou mais caracteres
Ao menos 1 dígito
Ao menos 1 letra minúscula
Ao menos 1 letra maiúscula
Ao menos 1 caractere especial
Considere como especial os seguintes caracteres: !@#$%^&*()-+
Não possuir caracteres repetidos dentro do conjunto
Exemplo:

IsValid("") // false	
IsValid("aa") // false	
IsValid("ab") // false	
IsValid("AAAbbbCc") // false	
IsValid("AbTp9!foo") // false	
IsValid("AbTp9!foA") // false	
IsValid("AbTp9 fok") // false	
IsValid("AbTp9!fok") // true	

Nota: Espaços em branco não devem ser considerados como caracteres válidos.

https://github.com/itidigital/backend-challenge