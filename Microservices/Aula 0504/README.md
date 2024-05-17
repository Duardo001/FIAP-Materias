# CRIAÇÃO Projeto MVC-RH 

![alt text](image.png)

Esse projeto permitirá listar cargos aos funcionários, vincular endereços ao funcionários e vincular cargos aos departamentos 

![alt text](image-1.png)

## CRIANDO AS TABELAS 

- ANTES: Rodamos uma vez a aplicação depois paramos ele e configuramos  
![alt text](image-2.png)
 

## CRIANDO TABELA DEPART 

Criamos uma package 

![alt text](image-3.png)

Criamos a classe 

![alt text](image-4.png)

Adicionamos os atributos 

Lembre se de marcar com @Entity a classe para poder ser identificada como tabela e o @Id para alguma coisa que eu não sei  

![alt text](image-5.png)

Para acessar essa tela no navegador rodamos a aplicação e escrevemos "localhost:8080/h2-console" 

![alt text](image-6.png)

Para o cadastro usamos a url e a password 

![alt text](image-7.png)

Logo temos a tela 

![alt text](image-8.png)

## MUDANDO O NOME DA TABELA 

![alt text](image-9.png)

 

E APLICANDO OBRIGATORIEDADE EM NOME COM UM VARCHAR(60) E NOT NULL 

 ![alt text](image-10.png)

Aplicando para que os id sejam  gerados de forma automática e sequencial 

 ![alt text](image-11.png)

Sendo criado uma "Sequence" no h2-console 

 

Aplicamos a extensão/import 

![alt text](image-12.png)

Isso para que oi Java possa criar um nº de serie para cada nova entidade criada e que ele possa armazenar seu valor 

 

## CRIANDO TABELA CARGOS 

Simplesmente damos um ctrl c + ctrl v no package model da classe depart 

E com isso aplicamos algumas alterações  

![alt text](image-13.png)

 

Aqui estamos aplicando a FK da tabela e dizemos como o java deve tratar a relação entre as colunas (uma para muitas) 

![alt text](image-14.png)
 

## CRIANDO A TABELA ENDERECO 

![alt text](image-15.png)
 

 

Criando uma classe que será a base das outras classes para tudo que há em comum entre elas  

![alt text](image-16.png)

Aplicamos o atributo que há em comum 

![alt text](image-17.png)

E após isso aplicamos a herança dessa classe nas outras  

 ![alt text](image-18.png)

GERADOR DE ID Não SEQUENCIAIS: https://www.uuidgenerator.net/ 

Mas um problema que isso geraria seria o fato as tabelas serem criadas com ID fora do padrão que queremos ent para resolver isso aplicamos generic sobre a classe Abstract 

![alt text](image-19.png)

E ent com isso podemos definir como o Id irá se comportar em cada classe herdada, basta fazer 

![alt text](image-20.png)

AINDA NECESSARIO CONFIGURAR PERFIL PRD<<<<<<<<<<<<<<<<< 