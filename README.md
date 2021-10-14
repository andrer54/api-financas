# <img align="center" alt="Java" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"> API-FINANÇAS 

 
> API com CRUD completo,  
> Tecnologias:  
> JAVA, Spring, SpringJPA, MySQL, Docker  
>
> O Backend de um gerenciador financeiro simples.  
> que estou construindo nas minhas horas vagas.  
>
>
> Obs: já está com docker configurado para rodar spring+mysql


---

## Instruções de instalação
baixe em uma pasta o projeto

#### primeiro crie uma build para o projeto com o comando:
    mvn clean install

#### agora (é preciso ter docker-compose instalado), subir a aplicação no docker
    docker-compose up --build --force-recreate

#### obs: se estiver utilizando linux adicione sudo no inicio, assim:  
    sudo docker-compose up --build --force-recreate

---
## Instruções de utilização:
#### Obter a lista de TODOS usuários
> GET    http://localhost:8080/usuario/  


#### Obter dados de um usuário  
> GET    http://localhost:8080/usuario/3  


#### Cadastrar um novo usuário
> POST    http://localhost:8080/usuario/  
> {  
>    "nome": "nome_do_usuario",  
>    "email": "email_do_usuario"  
> }  


#### Atualizar um usuário existente
> PUT    http://localhost:8080/usuario/3  
> {  
>    "nome": "novo_nome",  
>    "email": "novo_email"  
> }  


#### Deletar um usuário existente
> DELETE    http://localhost:8080/usuario/2  
  
