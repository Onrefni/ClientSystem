# ClientSystem


Simples aplicação REST utilizando Spring.

A Arquitetura é composta por:
Java 11
Springboot
Spring-data
Spring-security
JWT
Maven
Docker
Docker-compose
flyway
Swagger

para executar, basta clonar o projeto
copiar os arquivos Dockerfile e docker-compose dentro da pasta resourse/files
para fora do projeto, no mesmo nível da pasta raiz

Caso seja a primeira vez, execute o comando:
docker-compose build

depois basta exxecultar o comando:
docker-compose up

Link de acesso a API:
http://localhost:8080/api/client/v1/

Para acessar o Swagger UI
http://localhost:8080/swagger-ui.html

Na pasta resourse/files, tem o arquivo Client System.postman_collection.json, basta importar no Postman

Para ter acesso a API, foram cadastrados 2 usuários para teste.
No Postman, se encontra a a Request Tab "Generate Token", ela gera um token válido
Basta adicionar no header chave "Authorization" com o valor "Baere COLE_A_CHAVE_AQUI"
