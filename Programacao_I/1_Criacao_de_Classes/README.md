# Projeto de Gerenciamento de Vendas

Este projeto em Java simula um sistema simples de gerenciamento de vendas e produtos.

## Estrutura do Projeto

- `src/`: Contém os arquivos fonte Java.
  - [`App.java`](src/App.java): Classe principal que executa o programa.
  - [`Produto.java`](src/Produto.java): Classe que representa um produto.
  - [`Venda.java`](src/Venda.java): Classe que representa uma venda.

## Funcionalidades

- Cadastro de produtos com nome, marca, preço e quantidade.
- Cadastro de vendas com número, produto e data.
- Impressão dos dados da venda no console.

## Como Executar

1. Compile os arquivos Java:
   ```sh
   javac -d bin src/*.java
   ```
2. Execute o programa:
   ```sh
   java -cp bin App
   ```

## Exemplo de Saída

```
Número da Venda: 123456
Produto: Extrato Tomate
Marca: Elefante
Preço: 3.99
Quantidade: 10
Data da Venda: 01/07/2024
```

## Autor

Projeto desenvolvido para a disciplina de Programação I.