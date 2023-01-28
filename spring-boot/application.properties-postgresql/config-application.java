1.1 - spring.datasource.url -> serve para sabermos a URL e, dessa forma, informarmos qual é o SGBD, localizarmos o banco, qual porta ele está utilizando, e qual é o nome da base de dados que a nossa aplicação irá acessar.
1.2 - spring.datasource.username -> como já está claro, serve para informarmos o usuário de acesso ao banco que informamos no tópico 1.1 .
1.3 - spring.datasource.password -> será o campo onde iremos informar a senha do usuário informado no tópico 1.2 .

2) O Spring Boot usa o Hibernate para implementação de JPA, configuramos PostgreSQLDialect para PostgreSQL na linha 7.

3) O spring.jpa.hibernate.ddl-auto é usado para inicialização do banco de dados. Definimos o valor como update na linha 9 para que uma tabela seja criada no banco de dados automaticamente correspondente ao modelo de dados definido. Qualquer alteração no modelo também acionará uma atualização na tabela.

4) O spring.jpa.show-sql = true na linha 11 nos permitirá visualizar pelo terminal a persistência e o acesso a dados sendo feita em tempo real. Geralmente, só deixamos esse recurso habilitado como true, quando estamos desenvolvendo ou quando estamos precisando resolver um bug onde queremos acompanhar a persistência, por exemplo. O comum em ambiente de produção é deixamos como false.

---> Dependências do Maven necessárias:

-> no arquivo pom.xml:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
<groupId>org.postgresql</groupId>
<artifactId>postgresql</artifactId>
<scope>runtime</scope>
</dependency>