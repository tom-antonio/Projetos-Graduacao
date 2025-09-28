# Simulador de Sistema de Arquivos com Árvores Binárias

Este projeto é um programa em Python que simula um sistema de arquivos semelhante ao do seu computador, utilizando uma estrutura de árvore para representar pastas e arquivos. O objetivo é demonstrar conceitos de árvores, dicionários aninhados e recursão.

## Funcionalidades

- **Criar pastas:** Crie novas pastas na estrutura.
- **Criar arquivos:** Crie arquivos com nome e tamanho (em KB).
- **Adicionar itens a pastas:** Insira arquivos ou subpastas em qualquer pasta existente.
- **Exibir estrutura (estilo tree):** Visualize a hierarquia de pastas e arquivos de forma gráfica.
- **Calcular tamanho total de uma pasta:** Some o tamanho de todos os arquivos (diretos e recursivos) de uma pasta.
- **Menu interativo:** Todas as operações são acessíveis por um menu no terminal.

## Estrutura dos Dados

Cada elemento é um dicionário:
- **Pasta:**  
  ```python
  {
    "nome": "pasta1",
    "tipo": "pasta",
    "filhos": [ ... ]
  }
  ```
- **Arquivo:**  
  ```python
  {
    "nome": "arquivo.txt",
    "tipo": "arquivo",
    "tamanho": 120
  }
  ```

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 11_Arvores_Binarias.py
```

## Exemplo de uso

```
Menu:
1 - Criar pasta
2 - Criar arquivo
3 - Adicionar item a uma pasta
4 - Imprimir estrutura de pastas
5 - Calcular tamanho total de uma pasta
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
- Recursão para navegação e impressão
- Funções para criação, busca e manipulação de nós

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.