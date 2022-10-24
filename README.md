
# API-com-Spring

Exigencias basicas:

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

- Docker instalado corretamente.

- MySQL instalado corretamente.

- ✨ JDK 11 ✨

Para começar apenas limpe o projeto e build novamente, coloquei em Docker para facilitar a manipulação de banco de dados e também de um sevidor.

Comando para iniciar o projeto:

## Iniciando o Projeto

iniciei com npm e depois start com o docker

```bash
  mvn clean install
  docker-compose up --build --force-recreate
```
## Seguindo

 Feito isto, siga com a criação do banco de dados propriamente dito. PS: Caso use o Intellij, ele contem ferramentas que auxiliam na criação de uma base de dados na própria IDE, sendo assim, dispensando qualquer dependencia de instalação de uma IDE e do banco de dados para o uso do mesmo.

![App Screenshot](https://user-images.githubusercontent.com/68565187/197428001-8e0d5fd7-b7aa-40be-b8c5-5ba73eca14c2.png)

Query para a criação da tabalea no formato correto para o uso da minha aplicação:

- create table pessoa ( cd_pessoa int primary key auto_increment not null, nome varchar(200), sobrenome varchar(200), email varchar(200), Logradouro varchar(200), número int, bairro varchar(200), cidade varchar(200), estado varchar(200), cep int );

Seguindo com a base de dados, realize um INSERT para fazer os testes através do DB:

## Querys
```querys
insert into pessoa values(null, 'Thomaz', 'Poentes', 'thomazpoentes@hotmail.com', 'Rua Ana Moreira dos Santos Mattos', 68 ,'Jardim Paulistano', 'São Paulo', 'SP', 0281300);
```
Confira a base de dados:

```querys
select * from pessoa;
```

No documento PDF ao qual se diz como deve ser feita cada etapa, pede para que busquemos as informações do usuário através do email cadastrado, como achei desfuncional este método, tive a iniciativa de fazer um auto-incremento de ID para facilitar a busca, caso seja nescessário que realize a busca pelo email do usuário, é simples e rápido para se fazer a alteração.

para seguir com a busca de usuário voce deve usar:

na página WEB: 

```web
http://localhost:8080/pessoa/{numero do ID}
```

## PostMan

No PostMan: 
```postman
localhost:8080/pessoa/:pessoaid 
```

- com isto você deve inserir o valor do ID no campo Path Variables em Values.

## Considerações finais

- Siga os teste no PostMan com a collection anexada para testar as funcionalidades da API.

Thomaz Poentes.

Obrigado!
