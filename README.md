# ClientSystem


Simples aplicação REST utilizando Spring.

Para testar deve seguir os passos abaixo:
clonar o projeto
ir até a pasta ClientSystem/src/main/resources/files
mover ou copiar os aqueivos
docker-compose.yml e Dockerfile, para 1(um) nível acima da pasta raiz do projeto.

Instalar o Docker e o Docker-compose
execultar o comando: docker-compose build
posteriormente o comando: docker-compose up

quando o processo finalizar, é possível testar de 2 formas
Por meio do Swagger, http://localhost:8080/swagger-ui.html
ou pelo requisições rest como o postman, que basta importar o arquivo "Client System.postman_collection.json" 
dentro da pasta files informada acima
