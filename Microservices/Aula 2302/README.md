## Como clonar um projeto do GitHub e a partir dele criar seu repositório 

Definir um local para armazenar ele, seja no disc C ou D 

![alt text](image.png)

Clicar com o direito e abrir o Git Bash Here 

![alt text](image-1.png)
 

Comandos para entendimento 
```
Git init = inicializa o git 

ls = identificar quais arquivos tem na pasta 

pwd = mostrar aonde você está acessando  

ls-lah = mostrar o armazenamento/conteúdo daquela pasta 

Git = mostrar tds os comandos que podem ser usados 

Git clone = mostrar as formas de clonar um projeto 

Clear = limpa o terminal ou ctrl + L 

Cd "nome da pasta" = ele te coloca no diretório da pasta 

Git add . =  preparar arquivos para commit
```

 Acessando o arquivo que queremos clonar, copiamos a URL do projeto  
![alt text](image-2.png)

Após isso abrimos o terminal e digitamos "git clone" colando a URL 
![alt text](image-3.png)
 

Temos outras formas de fazer isso 

Consideramos que já tivéssemos uma pasta com o mesmo nome do projeto que iriamos clonar 

Para evitar problemas basta colocar "git clone + URL do arquivo + ping-new" 

 ![alt text](image-4.png)
 ![alt text](image-5.png)


Agora iremos linkar alguma dessas pastas com nosso novo repositorio 

Para isso apagaremos o .git de uma das pastas(está oculto) e seguiremos esses comandos 
 ![alt text](image-6.png)
 ![alt text](image-7.png)
Aqui dá um aviso dizendo que precisamos nos identificar para linkar os arquivos 

 ![alt text](image-8.png)
 

Agora digitamos os comandos para dar um "upload" 
 ![alt text](image-10.png)
 

E agora abre uma tela para nós nos logarmos 
![alt text](image-12.png)
Nessa tela iremos usar de um TOKEN para facilitar o login 

O TOKEN será gerado direto pelo GitHub

 

## GERANDO TOKEN 
![alt text](image-13.png)
![alt text](image-14.png)
![alt text](image-15.png)
![alt text](image-16.png)
![alt text](image-17.png)
Por padrões da AULA sempre usaremos o nome "fiap-aula" com 1 dia de duração, mas se é um ambiente caseiro pode deixar um prazo maior 

Além disso, marcaremos por agora SOMENTE repo e workflow 
![alt text](image-18.png)
![alt text](image-19.png)
![alt text](image-20.png)
Agora voltamos para a tela que pedia login e colocamos o TOKEN gerado 

Agora iremos trabalhar com portas de servidos, usando o branch e workflow 

Na pasta ping abrimo-la com o VS Code 
![alt text](image-21.png)
 
E agora com o VS code aberto, abrimos um terminal por lá msm 
![alt text](image-22.png)

Agora abrindo a aplicação .java do projeto  
![alt text](image-23.png)

E agora iremos relembrar os comandos Maven para ajudar a compilar e tals 
![alt text](image-24.png)

São eles  
```
Package = cria os arquivos class do java e os compila 

Clean = limpa a pasta target a qual é criado durante o package e armazena os arquivos java 
```
 

E agora com o terminal aberto  
![alt text](image-25.png)

Para melhor uso de tempo escrevemos "mv" e apertamos TAB e então escrevemos clean 

Analisando um problema que pode ocorrer com frequência  

Após darmos um mvnw package acontece o seguinte erro  
![alt text](image-26.png)

Esse erro ocorre porque um arquivo .javac que temos está com uma versão que não é compatível com a que estamos compilando 

Para resolver isso precisamos analisar quais java temos  

Seguindo esse caminho do disc C 
![alt text](image-27.png)

Temos  

Nisso vemos que nós estamos trabalhado com a versão do java 17 mas na máquina só temos a versão 18, por isso temos que realizar um alteração sobre qual versão de java vamos trabalhar 

Vamos realizar uma alteração de uma variável ambiente (JAVA_HOME) 

Seguindo esses passos 
![alt text](image-28.png)

Clicamos em enviroment variables  
![alt text](image-29.png)

Procuramos a variável que precisamos  
![alt text](image-30.png)

E nisso iremos aplicar a versão do java correta procurando no diretório  
![alt text](image-31.png)

Agora é só dar ok 

Fechamos o vsCode que estávamos trabalhando e abrimos um novo 

Digitamos ".\mvnw package " em um novo terminal  

 ![alt text](image-32.png)

 

Agora iremos trabalhar com o ECLIPSE 

Abrindo o eclipse iremos com a pasta "Projects" que criamos no disc D 

 

OBS: Checkpoint dia 8 

 

Agora com o eclipse aberto iremos importar um projeto maven que já existe  
![alt text](image-33.png)
 

E então iremos procurar nosso projeto dentro do folder/diretório  
![alt text](image-34.png)

Fazendo o java -jar pelo eclipse 
![alt text](image-35.png)

Se por ventura esquecemos de parar a aplicação e rodarmos de novo dará um erro dizendo que a porta do host já está em uso 
![alt text](image-36.png)

Para resolver isso localizamos quais aplicações estão rodando 
![alt text](image-37.png)

Nisso entramos na aplicação que está em execução e então encerramos  
![alt text](image-38.png)
 

Dando uma funcionalidade para essa nossa aplicação ping onde mandamos um sinal ping e nos retorna um texto "pong" 

Na package .github  
![alt text](image-39.png)
![alt text](image-40.png)

Agora vamos criar uma classe  
![alt text](image-41.png)
![alt text](image-42.png)

Aqui configuraremos para que a classe possa responder ao nosso comando de ping, usando da anotação @RestController, permitindo que todos os métodos que estiverem dentro daquela classe seja "ouvida" pelo browser 

Com isso criamos 
![alt text](image-43.png)

E agora precisamos fazer com que a classe fique disponível para acesso de  
![alt text](image-44.png)

Tendo a tela  
![alt text](image-45.png)

Inicialmente vamos a essa tela 
![alt text](image-46.png)

Teste com nome 
![alt text](image-48.png)

Agora iremos trabalhar com portas diferentes 

Temos que aprender a alterá-la 

Abrimos  
![alt text](image-49.png)

Pronto trocamos nossa porta 

Agora iremos atribuir várias aplicações para várias portas 

Nisso criamos outras apliccations as nomeando 
![alt text](image-50.png)

Agora precisamos disponibilizar essas portas para um "Run As" 

Nisso vamos  
![alt text](image-51.png)
 

Agora configuremos um Run configuration – enviroment – add  
![alt text](image-52.png)

Agora iremos criar um javaapllication pra isso criaremos uma copia e realizamos o mesmo processo mudando o "value" para stg 

Commitando 
![alt text](image-53.png)
![alt text](image-54.png)

 