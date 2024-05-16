# Entendendo DOCKER

Trabalharemos com docker e linkaremos com nosso projeto do github 

Repositório público de imagens:https://hub.docker.com/ 

 

Explicando comandos dockers: 

Abra um prompt de comando 
```
Docker  = trará a documentação disponível para usar ali 

Docker pull =  permite o download de uma imagem/arquivo 

Acesse o repositorio de imagem 

Escreva "ubuntu" 

Vá em tags 

No prompt escreva "docker pull ubunto 

Docker images = lista o local images do disositivo  

docker run –name <container_name> <image_name>  

EX: docker run -- name ubuntu1 ubuntu:latest 

Docker ps = exibe os container em execução  

Docker ps –a = exibe os container já executados 

Docker rm <container name> = exclui um container que já foi executado (não tão usual) 

O mais usual é usar o ID do container (digitar os 4 primeiros caracteres que automaticamente o docker identifica o container e exclui ele) 

Docker run --it <nome do diretório>: acessamos um container em execução 

Docker exec --it <id do container> sh = acessa um container que está em execução 
```
Atenção o sh é em relação ao prompt que vc está usando 