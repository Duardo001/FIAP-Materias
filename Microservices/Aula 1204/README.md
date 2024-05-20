# Continuação Projeto MVC 

Inicie o docker 
Abra o docker  
Abra o git BASH a partir da pasta project  
Rode  

------------------------------- 
```
   docker run -d \ 

    -e MYSQL_ROOT_PASSWORD=root_pwd \ 

    -e MYSQL_USER=new_user \ 

    -e MYSQL_PASSWORD=my_pwd \ 

    -p 3306:3306 \ 

    Mysql 
```
---------------------------------- 

### Crie o perfil PRD e configure  

![alt text](image.png)

Estamos fazendo isso para permitir que aplicação aceite também o MySQL como banco de dados

-------------------------------------- 

### Sobre a classe endereço 

![alt text](image-1.png) 

Aqui do jeito que está o usuário pode digitar qualquer palavra de 2 letrar e vamos alterar isso para que já tenhamos uma base de UF, aplicando um ENUM na classe (Corrija os getters e setters desse atributo)

![alt text](image-2.png)

 
Feito isso e acessando novamento o banco de dados notamos que o UF está como tinyint pois por padrão ele é definido como ORDINAL 

Para corrigir isso importamos 
![alt text](image-3.png)
Agora ele está aceitando VARCHAR

----
## Usando o MySQL 
Iremos baixar um BD para realizar testes 

Acessamos https://dbeaver.io/ 

Vamos em Download 
![alt text](image-4.png)

Pegamos  o zip 
![alt text](image-5.png)

Descompactamos  

Entramos na pasta  

E rodamos o EXE 
![alt text](image-6.png)

Após  abrir clique em sim  

Clique nessa setinha 
![alt text](image-7.png)
 

Faça o download 
![alt text](image-8.png)

Conectando ao banco de dados 
![alt text](image-9.png)

Selecionamos o MySQL 
![alt text](image-10.png)

Fazemos essa config 
![alt text](image-11.png)

OBS: A senha está lá no perfil PRD (root_pwd) 

 

Testamos a conexão e realizamos o download   
![alt text](image-12.png)

Caso de esse erro 
![alt text](image-13.png)

E mudamos essa config para true (Talvez tenha que clicar em detalhes)
![alt text](image-14.png)

Após fazer um novo teste temos o seguinte problema 

Damos ok e eh isso 
![alt text](image-15.png)

Abrindo a conexão ainda n temos o bd de RH 
![alt text](image-16.png)

Para resolver isso, rodamos a aplicação prd no eclipse 
 

Caso de o erro  
![alt text](image-17.png)
 

Vá no site https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.3.0 


E importe a dependência de mysql 
![alt text](image-18.png)

Após isso rodamos novamente o perfil 
![alt text](image-19.png)

E voltando o dbeaver e dando um f5 temos 

-------------------------------- 
## Sobre o check02 

### No prd  

spring.datasource.url=jdbc:mysql://localhost:3306/rh?createDatabaseIfNotExist=true 

Copiar e colar só mudar o "rh" pelo nome do projeto  

### Sobre o Created_at da tabela pra ser criada 

Em vez de usar LocalDate usar LocalDateTime  

--------------------------------- 