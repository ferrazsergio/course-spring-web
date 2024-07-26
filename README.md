# Spring Boot JPA/Hibernate Web Services

## Descrição
Este projeto implementa um serviço web usando Spring Boot e JPA/Hibernate. Ele cobre a criação de um modelo de domínio, estruturação das camadas lógicas, configuração de banco de dados de teste e desenvolvimento, operações CRUD, tratamento de exceções e deployment no Heroku.

## Funcionalidades
- Criar, Recuperar, Atualizar e Deletar entidades (CRUD)
- Tratamento de exceções
- Deployment no Heroku

## Tecnologias Utilizadas
- Java 21
- Spring Boot
- JPA/Hibernate
- H2 Database
- PostgreSQL
- Heroku

## Configuração do Projeto
### Dependências
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Configurações de Banco de Dados
#### application.properties
```properties
spring.profiles.active=test
spring.jpa.open-in-view=true
```

#### application-test.properties
```properties
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### application-dev.properties
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course
spring.datasource.username=postgres
spring.datasource.password=1234567

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

jwt.secret=MYJWTSECRET
jwt.expiration=3600000
```

#### application-prod.properties
```properties
spring.datasource.url=${DATABASE_URL}

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false

jwt.secret=${JWT_SECRET}
jwt.expiration=${JWT_EXPIRATION}
```

## Estrutura do Projeto
- **Domain Model**: Implementação do modelo de domínio.
- **Logical Layers**: Estruturação das camadas lógicas (resource, service, repository).
- **Database Configuration**: Configuração do banco de dados de teste (H2) e perfil de desenvolvimento (PostgreSQL).
- **CRUD Operations**: Implementação das operações de Create, Retrieve, Update, Delete.
- **Exception Handling**: Tratamento de exceções nas operações CRUD.
- **Deployment**: Instruções para deploy no Heroku.

## Diagrama do Modelo de Domínio
![Domain Model](https://github.com/ferrazsergio/course-springboot-3-java-21/blob/main/img/diagrama.png)

## Deploy no Heroku
### Passos
1. Crie uma conta no Heroku e uma nova aplicação.
2. Provisione o PostgreSQL no dashboard do Heroku.
3. Adicione as variáveis de configuração necessárias (DATABASE_URL, JWT_SECRET, JWT_EXPIRATION).
4. Atualize o arquivo `application-prod.properties` com as variáveis de configuração.
5. Faça o deploy usando o Heroku CLI:
    ```sh
    heroku login
    heroku git:remote -a <nome-da-sua-aplicacao>
    git add .
    git commit -m "Deploy app to Heroku"
    git push heroku main
    ```

## Links Úteis
- [Documentação do Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação do JPA/Hibernate](https://hibernate.org/)

## Licença
Este projeto está licenciado sob a licença MIT.
=======

# Spring Boot JPA/Hibernate Web Services

## Descrição
Este projeto implementa um serviço web usando Spring Boot e JPA/Hibernate. Ele cobre a criação de um modelo de domínio, estruturação das camadas lógicas, configuração de banco de dados de teste e desenvolvimento, operações CRUD, tratamento de exceções e deployment no Heroku.

## Funcionalidades
- Criar, Recuperar, Atualizar e Deletar entidades (CRUD)
- Tratamento de exceções
- Deployment no Heroku

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- JPA/Hibernate
- H2 Database
- PostgreSQL
- Heroku

## Configuração do Projeto
### Dependências
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Configurações de Banco de Dados
#### application.properties
```properties
spring.profiles.active=test
spring.jpa.open-in-view=true
```

#### application-test.properties
```properties
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### application-dev.properties
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course
spring.datasource.username=postgres
spring.datasource.password=1234567

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

jwt.secret=MYJWTSECRET
jwt.expiration=3600000
```

#### application-prod.properties
```properties
spring.datasource.url=${DATABASE_URL}

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false

jwt.secret=${JWT_SECRET}
jwt.expiration=${JWT_EXPIRATION}
```

## Estrutura do Projeto
- **Domain Model**: Implementação do modelo de domínio.
- **Logical Layers**: Estruturação das camadas lógicas (resource, service, repository).
- **Database Configuration**: Configuração do banco de dados de teste (H2) e perfil de desenvolvimento (PostgreSQL).
- **CRUD Operations**: Implementação das operações de Create, Retrieve, Update, Delete.
- **Exception Handling**: Tratamento de exceções nas operações CRUD.
- **Deployment**: Instruções para deploy no Heroku.

## Diagrama do Modelo de Domínio
![Domain Model](https://github.com/ferrazsergio/course-springboot-3-java-21/blob/main/img/diagrama.png)

## Deploy no Heroku
### Passos
1. Crie uma conta no Heroku e uma nova aplicação.
2. Provisione o PostgreSQL no dashboard do Heroku.
3. Adicione as variáveis de configuração necessárias (DATABASE_URL, JWT_SECRET, JWT_EXPIRATION).
4. Atualize o arquivo `application-prod.properties` com as variáveis de configuração.
5. Faça o deploy usando o Heroku CLI:
    ```sh
    heroku login
    heroku git:remote -a <nome-da-sua-aplicacao>
    git add .
    git commit -m "Deploy app to Heroku"
    git push heroku main
    ```

## Links Úteis
- [Documentação do Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação do JPA/Hibernate](https://hibernate.org/)

## Licença
Este projeto está licenciado sob a licença MIT.
