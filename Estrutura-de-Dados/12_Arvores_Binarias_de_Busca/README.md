# Simulador de Sistema de Arquivos com Árvores (Pré-Ordem, Pós-Ordem e Busca)

Este projeto é um programa em Python que simula um sistema de arquivos, permitindo criar pastas e arquivos, organizar hierarquicamente e realizar operações típicas de árvores, como percursos em pré-ordem e pós-ordem, busca e cálculo de tamanho.

## Funcionalidades

- **Criar pastas:** Crie novas pastas em qualquer local da estrutura.
- **Criar arquivos:** Crie arquivos com nome e tamanho (em KB).
- **Adicionar itens:** Insira arquivos ou subpastas em qualquer pasta existente.
- **Imprimir em pré-ordem:** Exibe a estrutura percorrendo primeiro o nó atual, depois os filhos.
- **Imprimir em pós-ordem:** Exibe a estrutura percorrendo primeiro os filhos, depois o nó atual.
- **Buscar arquivo:** Procura um arquivo pelo nome em toda a árvore.
- **Buscar pasta:** Procura uma pasta pelo nome em toda a árvore.
- **Imprimir estrutura (estilo tree):** Visualiza a hierarquia de pastas e arquivos de forma gráfica.
- **Calcular tamanho total de uma pasta:** Soma o tamanho de todos os arquivos (diretos e recursivos) de uma pasta.
- **Menu interativo:** Todas as operações são acessíveis por um menu no terminal.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 12_Arvores_Binarias_de_Busca.py
```

## Exemplo de uso

```
Menu:
1 - Criar pasta
2 - Criar arquivo
3 - Adicionar item a uma pasta
4 - Imprimir em pré-ordem
5 - Imprimir em pós-ordem
6 - Buscar arquivo
7 - Buscar pasta
8 - Imprimir estrutura de pastas
9 - Calcular tamanho total de uma pasta
0 - Sair
Informe a opção desejada: 1
Informe o nome da nova pasta: documentos
Pasta 'documentos' criada com sucesso.
...
```

A estrutura será exibida assim:

```
└── raiz
    ├── documentos
    │   └── texto.txt (50 KB)
    └── foto.png (150 KB)
```

## Estruturas e Conceitos Utilizados

- Árvores com dicionários aninhados
- Recursão para navegação, busca e impressão
- Funções para criação, busca e manipulação de nós

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.