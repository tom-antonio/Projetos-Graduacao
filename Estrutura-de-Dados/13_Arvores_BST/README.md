# Sistema de Gerenciamento de Estoque com Árvore Binária de Busca (BST)

Este projeto é um programa em Python que simula o gerenciamento de estoque de um armazém, utilizando uma Árvore Binária de Busca (BST) para armazenar e organizar os produtos. O sistema permite adicionar e atualizar produtos, buscar produtos por código e exibir o estoque completo de forma ordenada.

## Funcionalidades

- **Adicionar/Atualizar produtos:** Insere um novo produto pelo código ou atualiza a quantidade de um produto já existente.
- **Buscar produtos:** Consulta a quantidade em estoque de um produto pelo seu código.
- **Exibir produtos cadastrados:** Mostra todos os produtos cadastrados, ordenados pelo código, e imprime a estrutura da árvore.
- **Menu interativo:** Interface simples para navegação entre as opções.
- **Sair do programa:** Encerra a aplicação de forma segura.

## Estrutura dos Dados

Cada produto é representado por um nó da BST, que é um dicionário com as seguintes chaves:
- `'codigo'`: Código identificador do produto (inteiro).
- `'quantidade'`: Quantidade em estoque (inteiro).
- `'esquerda'`: Referência para o nó filho à esquerda (ou `None`).
- `'direita'`: Referência para o nó filho à direita (ou `None`).

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 13_Arvores_BST.py
```

## Exemplo de uso

```
Gerenciamento de Estoque com BST!
Escolha a opção desejada:
1 - Adicionar/Atualizar produtos;
2 - Buscar produtos;
3 - Exibir produtos cadastrados;
0 - Sair do programa;
Informe a opção desejada: 1
Opção 1 selecionada: Adicionar/Atualizar produtos.
Informe o código do produto: 101
Informe a quantidade do produto: 50

Gerenciamento de Estoque com BST!
Escolha a opção desejada:
1 - Adicionar/Atualizar produtos;
2 - Buscar produtos;
3 - Exibir produtos cadastrados;
0 - Sair do programa;
Informe a opção desejada: 3
Opção 3 selecionada: Exibir produtos cadastrados.
Produtos cadastrados:
Código: 101, Quantidade: 50
└── 101
```

## Estruturas e Conceitos Utilizados

- Árvore Binária de Busca (BST) implementada com dicionários e funções recursivas.
- Percurso em ordem para exibição ordenada dos produtos.
- Impressão gráfica da estrutura da árvore.
- Validação básica de entradas do usuário.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.