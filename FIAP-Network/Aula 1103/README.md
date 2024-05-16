# AULA 11/03 - Prática com Switches e VLAN

[Aula 05 2024 PraticacomSwitcheseVlan Checkpoint.pkt](https://prod-files-secure.s3.us-west-2.amazonaws.com/7fcb26bc-7e98-4600-9532-f1d6c7affda3/69ab43d8-66ed-45b1-838d-0979c6db6e02/Aula_05_2024_PraticacomSwitcheseVlan_Checkpoint.pkt)

![alt text](image.png)
![alt text](image-1.png)

Trabalharemos com a topologia acima e precisaremos resolver o problema descrito logo em seguida

![alt text](image-2.png)

![alt text](image-3.png)

![alt text](image-4.png)

![alt text](image-5.png)

![alt text](image-6.png)

![alt text](image-7.png)

### Configurando vlans

![alt text](image-8.png)

REALIZE ESSA CONFIGURAÇÃO PARA TODOS OS SWITCHES DA TOPOLOGIA

### DEFININDO AS INTERFACES PARA CADA VLAN

Ralizando processo no SWITCH LAB210

![alt text](image-10.png)

- DEFININDO PORTAS DE ACESSO PARA VLAN 2

![alt text](image-11.png)

- DEFININDO A PORTA DE ACESSO PARA A MAQUINA DO PROFESSOR DO LAB210

Realizando o mesmo processo para o SWITCH LAB211 

![alt text](image-12.png)

E mais uma vez o processo para o SWITCH LAB212

![alt text](image-13.png)

### Por fim configurando o SWITCH3

- Configurando o servidor

![alt text](image-14.png)

- Confugrando a área administrativa

![alt text](image-15.png)

- Configurando a área de wifi

![alt text](image-16.png)

Com isso resolvemos o problema de miutos broadcasts que tinha na rede física

## DEFININDO INTERFACE TRUNK

![alt text](image-17.png)

### Configurando no SWITCH3

![alt text](image-18.png)

### Configurando no SWITCHLAB212

![alt text](image-19.png)

![alt text](image-20.png)

Aqui definimos duas interfaces TRUNK para que o switch conseguisse fazer “ponte” o próximo switch e anterior até atingir o switch que está concetado diretamente ao roteador

### Configurando no SWITCH LAB211

![alt text](image-21.png)

### Configurando no SWITCH LAB210

![alt text](image-22.png)

---

## DEFININDO ENDEREÇOS DE REDE PARA CADA VLAN

![alt text](image-23.png)

![alt text](image-24.png)

## CONFIGURANDO GATEWAYS NO ROTEADOR

![alt text](image-25.png)

Agora ligamos a interface

![alt text](image-26.png)

## CONFIGURANDO DHCP
![alt text](image-27.png)