# Calculadora de Expressões com Strings

Este projeto é um programa em Python que lê do usuário uma ou mais expressões matemáticas simples em formato de string, calcula e exibe o resultado de cada operação.

## Funcionalidades

- Aceita expressões com dois números inteiros e um operador (+, -, *, /).
- Permite múltiplas expressões separadas por vírgula.
- Ignora espaços em branco nas expressões.
- Exibe o resultado no formato: `a + b = resultado`.
- Impede divisões por zero.
- Não utiliza a função `eval()` por segurança.

## Como funciona

1. O usuário informa uma expressão matemática (ex: `5+5`).
2. O programa identifica o operador, separa os números e executa a operação.
3. O resultado é exibido no terminal.
4. O programa repete até o usuário digitar `0` para sair.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 6_Calculadora_String.py
```

## Exemplo de uso

```
Informe a expressão que deseja calcular ou zero para sair: 10+5
10 + 5 = 15

Informe a expressão que deseja calcular ou zero para sair: 16 / 2
16 / 2 = 8.0

Informe a expressão que deseja calcular ou zero para sair: 5/0
Não é possível fazer divisões por zero! Tente novamente!

Informe a expressão que deseja calcular ou zero para sair: 0
Programa encerrado com sucesso!
```

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.