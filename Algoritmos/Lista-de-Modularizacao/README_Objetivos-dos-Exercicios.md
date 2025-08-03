1) Crie um programa em C que faça a leitura de um valor entre 1 e 12. Após a leitura, passe esse valor por parâmetro para um procedimento que ao receber o número escreva na tela o mês correspondente, por exemplo, caso receba 1 o procedimento escreverá Janeiro, caso receba 12 escreverá Dezembro.
2) Escreva um procedimento que gere um cabeçalho para um relatório. Esse procedimento deve receber três parâmetros do tipo palavra ou string. O primeiro parâmetro é o nome da instituição, o segundo é o nome da disciplina e o terceiro é o nome do aluno. Assim, considerando:
inst = “Instituto Federal de Goiás”, disc = “Algoritmos e Técnicas de Programação e
nome = “Aladir Jr”, o cabeçalho ficará exposto na tela da seguinte forma:
============================================
IFG – Instituto Federal de Goiás
Disciplina de Algoritmos e Técnicas de Programação
Nome: Aladir Jr
============================================ 
3) Faça uma rotina (subprograma) para verificar se um ano é bissexto ou não. Utilize a regra: Um ano bissexto é divisível por 4, mas não por 100, ou então se é divisível por 400.
Exemplo: 1988 é bissexto, pois é divisível por 4 e não é por 100; 2000 é bissexto porque é divisível por 400.
5) Crie uma função que receba um número inteiro e retorne se o número é primo ou não. No caso positivo, a função deve retornar 1, caso contrário zero. Essa função deve ser chamada de um programa principal em C (main).
6) Crie um programa em C que faça a leitura de dois números inteiros e os passe por parâmetro para uma função. Essa função irá receber os dois números (x e y) e deve verificar se x é divisível por y. No caso positivo, a função deve retornar 1, caso contrário zero.
7) Crie um programa que leia um caractere e passe para uma função que, por sua vez, verifica sé o caractere é uma letra do letra do alfabeto. A função deve retornar 1 caso positivo e 0 em caso contrário.
8) Um número é dito ser capicua quando lido da esquerda para a direita é o mesmo que quando lido da direita para a esquerda. O ano 2002, por exemplo, é capicua. Então, elabore uma função para verificar se um número possui essa característica. Caso o número seja capicua, a função deve retornar 1 e 0 em caso contrário. Crie um programa que faça a chamada dessa função.
9) Crie um programa em C que faça a leitura de um número e chame uma função que após receber esse número por parâmetro, retorne o fatorial desse número. Caso não seja
possível calcular o fatorial, a função deverá retornar -1.
10) Criar uma função que calcule e retorne o MAIOR entre dois valores recebidos como parâmetro. Faça também o programa em C responsável pela leitura e chamada da
função!
11) Criar uma função que verifique quantas vezes um número inteiro x é divisível por um número inteiro y. A função deve retornar -1 caso não seja possível calcular. Escreva também um programa em C para usar tal função.
12) Construa uma função que efetue a troca dos valores de a por b, recebidos como parâmetro. Ou seja, essa função deve trocar o valor de a e b. Essa função deverá ser
chamada pelo programa principal que fará também a impressão dos valores após a troca.
13) Construa uma função que receba dois valores inteiros a e b, retorne (passagem por referência) o quociente e o resto divisão de a por b. A função deve retornar -1 caso não seja possível realizar as operações e 0 caso seja possível. Um programa principal em C para utilizar tal função deve ser criado, tratando o retorno da função.
14) Construa uma função, que receba três coeficientes (a, b e c) relativos à uma equação de segundo grau e calcule suas raízes através da fórmula de Báskara. A função deve levar em conta a possibilidade da existência de nenhuma, uma ou duas raízes. A função deve retornar o número de raízes ou -1 em caso de inconsistência.
15) Crie uma função que realize a conversão para Radianos (rad) a partir de Graus (grad), onde grad é passado como parâmetro e rad é retornado. Sabe-se que 180º (graus) está para π radianos. Crie também o programa principal em C que chamará a função.
16) Crie um programa em C que leia uma variável que contém a quantidade de graus em Farenheit e passe a uma função que realize a conversão de Fahrenheit (F) para graus Celsius (C). Sabe-se que os pontos de fusão e ebulição nas escalas Celsius e Fahrenheit são: 0ºC e 100ºC, e 32ºF e 212ºF, respectivamente.
17) Crie uma função que realize a conversão de Polegadas (pol) para Centímetros (cm), onde pol é passado como parâmetro e cm é retornado. Sabe-se que 1 polegada está para 2,54 centímetros. Crie também um algoritmo para testar tal função.
18) Seja a série de Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ..., que pode ser definida recursivamente por:
Então escreva:
- Uma função recursiva que gere o termo de ordem n da série de Fibonacci.
- Um algoritmo que, utilizando a função definida acima gere a série de Fibonacci até o
termo de ordem 20.
19) O fatorial de um número n, inteiro e positivo, pode ser definido recursivamente, ou seja: Então, crie uma função recursiva que calcule o fatorial de um número n. A função deve retornar -1 caso não seja possível calcular o fatorial Além disso, crie um programa em C que leia um valor, utilize a função criada para calcular o fatorial e imprima o valor computado.
24) Crie uma função que receba como parâmetro uma matriz quadrada vinda do programa principal em C e retorne a soma dos elementos da diagonal secundária.
26) Crie um procedimento que receba como parâmetro um vetor de 10 números inteiros vindo do programa principal em C e ordene o vetor. Mostre o vetor ordenado no
programa principal.
29) Crie um programa em C que faça a leitura de um número e chame um procedimento que ao receber como parâmetro o número inteiro, exibe na tela a tabuada de multiplicação até 10 do número lido.
Exemplo: número lido 5
===============================
Tabuada do 5
===============================
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
===============================