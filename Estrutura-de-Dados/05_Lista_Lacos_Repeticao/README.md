# Sistema de Administração de Produtos para E-commerce

Este projeto é um programa em Python que simula a área administrativa de um sistema de e-commerce, permitindo o gerenciamento de produtos disponíveis no site.

## Funcionalidades

O sistema permite que administradores:

1. **Listem todos os produtos** cadastrados, exibindo código, nome, descrição e valor.
2. **Cadastrem novos produtos**, informando código (único), nome, descrição e valor.
3. **Alterem produtos existentes** (nome, descrição e valor) a partir do código.
4. **Excluam produtos** do sistema pelo código.
5. **Encerrem o programa** de forma segura.

## Como funciona

- Os produtos são armazenados em um dicionário, onde a chave é o código do produto.
- O sistema impede o cadastro de produtos com códigos duplicados.
- Todas as operações são realizadas por meio de um menu interativo no terminal.
- O programa permanece em execução até que o usuário escolha sair.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 5_Lista_Lacos_Repeticao.py
```

## Exemplo de uso

```
Sistema de cadastro de produtos para E-commerce!
Escolha a opção desejada:
1 - Listar Produtos
2 - Cadastrar Produto
3 - Alterar Produto
4 - Excluir Produto
5 - Sair do Programa
Informe a opção desejada: 2
Informe o código do produto: 1
Informe o nome do produto: Notebook Dell
Informe a descrição do produto: Notebook Dell com processador Intel i7, 8GB RAM, 512GB SSD
Informe o valor do produto: 1999.00
Produto Notebook Dell cadastrado com sucesso!
```

## Estruturas utilizadas

- Dicionários para armazenamento dos produtos.
- Laços de repetição para o menu interativo.
- Estruturas condicionais para validação das operações.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.