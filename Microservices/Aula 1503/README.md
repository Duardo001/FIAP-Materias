# Criaremos uma aplicação visual para nossa aplicação Java web 

Frameworks css: 
```
Materialize 
Material design 
W3.css 
```
 

Na nossa pasta Projects crie uma pasta com nome site (em minúsculo msm) 
![alt text](image.png)

Abra a pasta com o vsCode e crie um arquivo html (atalho pra criar o texto base "html:5") 
![alt text](image-1.png)

Crie um novo arquivo html agr com o nome lista 
![alt text](image-2.png)

Agora iremos criar uma tabela 
![alt text](image-3.png)

E no site da w3 na parte de bootstrap e pegamos um simples tabela 
![alt text](image-4.png)

Agora usamos o spring iniatialzr  
![alt text](image-5.png)

Jogamos dentro da nossa pasta Project 
![alt text](image-6.png)

Importamos para dentro do Eclipse 
![alt text](image-7.png)

Copiamos e jogamos os nossos 2 html nesse caminho ou tbm podemos jogar direto no eclipse arrastando os arquivos 
![alt text](image-8.png)

Agora iremos configurar o nosso projeto para que quando digitarmos
localhost:8080 ele retorne o nosso index.html 

1º Criamos um novo package de controller 
![alt text](image-9.png)

2º uma nova classe 
![alt text](image-10.png)
 

Na classe aplicamos um @ para que ela seja inteligente para responder ao navegador 
![alt text](image-11.png)
 

Aplicamos um método para retorno do arquivo 

Agora criamos uma nova pasta em "templates" como nome pessoa e arrastamos no lista.html para dentro dessa nova pasta 
![alt text](image-12.png)

Criamos uma nova classe no package controller e colocamos nome de PessoaController e configuramos ela para poder responder ao browser quando for chamado 

--------------------------------------- 
```
package com.github.duardo001.thymeleaf.controller; 

import org.springframework.stereotype.Controller; 

import org.springframework.web.bind.annotation.RequestMapping; 

import org.springframework.web.bind.annotation.RequestMethod; 


@Controller 

@RequestMapping("/pessoas") 

public class PessoaController { 

@RequestMapping(value = "/listar", method = RequestMethod.GET) 

public String lista() { 

return "pessoa/lista.html"; 

} 
} 

```
![alt text](image-13.png)
------------------------------------------------------------- 

 

Agora iremos realizar uma configuração para que os dados da lista venham de um BD, usemos um site chamado "mockaroo" 

Realizaremos um DTO 

Criamos um novo package 
![alt text](image-14.png)

E adicionamos uma nova classe 
![alt text](image-15.png)

Geramos getters e setters uma vez que estão privados 
![alt text](image-16.png)

Criamos um novo package 
![alt text](image-17.png)

Criamos uma classe dentro dele 
![alt text](image-18.png)

Nessa classe queremos por uma lista de pessoas e que ela seja retornada 
![alt text](image-19.png)

Existem 3 formas de fazer isso, a primeira eh essencial e a segunda e terceira são formas diferentes de adicionar um objeto depois de instanciar um construtor 


Agora iremos atualizar nosso PessoaController para que ele consiga ter acesso à nossa classe com lista onde o List atuara como controller e o return como view 
![alt text](image-20.png)

E usaremos agora do thymeleaf para melhor configuração, pois com ele conseguimos receber a lista e aplicar um "for"  

Na pratica iremos alterar nos list e colocar um for each que receberá pessoa em que para cada obejeto de pessoa colocará um tr, adicionando na tabela 

Na classe lista.html realizamos a seguinte modificação 
![alt text](image-21.png)

Aqui ele rodará em loop o que está na controller e realizará os dados que foram definidos para inclusão de pessoa, ficando assim 
![alt text](image-22.png)

 

Por agora iremos realizar uma configuração para não precisar ficar toda hora reiniciando a aplicação para atualizar ela  

Usando o spring initialzr pegamos a dependência Spring devtools 
```
<dependency> 

     <groupId>org.springframework.boot</groupId> 

     <artifactId>spring-boot-devtools</artifactId> 

     <scope>runtime</scope> 

     <optional>true</optional> 

</dependency> 
```
E colar ela dentro do pom.xml 

![alt text](image-23.png)

Agora colocaremos um novo método dentro de PessoaController, o model 

E importaremos a segunda pessoa 
![alt text](image-24.png)