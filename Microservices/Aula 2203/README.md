# Na aula de hoje aprimoraremos o cod da aula anterior 

E também entenderemos melhor a definição de MVC 

 

## MVC: 

Model: define o modelo ou domínio a aplicação 

Regras de negócios 

Persistência de dados 

View: Interação com o usuário 

Controller: Componente intermediário entre view e model 

Recebe requisições 

Envia respostas 

Interage com a camada model 

 

Para aula como auxílio usaremos: https://www.tutorialspoint.com/design_pattern/index.htm 

 

![alt text](image.png)
Criamos uma classe enum para permitir somente sexo do tipo "M" ou "F" 

Realizamos as alterações necessárias nas classes 

![alt text](image-1.png)
![alt text](image-2.png)
 

Entendendo InversãoDeController: 

 

Vamos entender e aplicar a questão do  
![alt text](image-3.png)
Ser capaz de sempre instanciar  

Aplicamos o @service na classe 
![alt text](image-4.png)
![alt text](image-5.png)


---
Logo após isso pegamos as dependências de "Data JPA" e  "H2database" 

No caso do h2 podemos pegar através do Spring Initialzr ou do https://mvnrepository.com/artifact/com.h2database/h2/2.2.224 

 

No pom  
![alt text](image-6.png)

E caso queiramos uma dependência de Oracle 
![alt text](image-7.png)

Digitando "/h2-console" temos a tela 
![alt text](image-8.png)

Colocamos como user name "jdbc:h2:mem:testdb" 

E senha "password" 

Com isso temos a tela 
![alt text](image-9.png)

Nela podemos criar nossos dados de forma virtual 

 

Na classe Pessoa a menção entity e id (Selecionando a 1º opção qnd importar) 
![alt text](image-10.png)

Com isso somos o java cria a tabela para nós já com os devidos atributos 
![alt text](image-11.png)


Criamos uma interface Repository 
![alt text](image-12.png)
Aplicamos o @  

Para que ele seja capaz de trabalhar com BD

Agora temos que referenciar a entidade e classe que ele deve trabalhar 
![alt text](image-13.png)

Corrigimos a classe PessoaController 
![alt text](image-14.png)
![alt text](image-15.png)
Correção com classe Pessoa acima 