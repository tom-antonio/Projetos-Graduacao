# Laboratório de Performance de Algoritmos de Ordenação e Busca

Este projeto é um laboratório interativo em Python para experimentação, comparação e análise de desempenho de algoritmos clássicos de ordenação e busca em listas. O sistema gera um arquivo com 1 milhão de números aleatórios, permite operações de busca, inserção e exclusão, e mede o tempo de execução dos algoritmos.

## Funcionalidades

- **Geração de Dados:**  
  Cria um arquivo `dados_desordenados.txt` com 1.000.000 de números inteiros embaralhados.
- **Leitura de Dados:**  
  Carrega os números do arquivo para uma lista na memória.
- **Ordenação:**  
  Permite ordenar a lista usando diferentes algoritmos:
  - Bubble Sort
  - Selection Sort
  - Insertion Sort
  - Merge Sort
  - Quick Sort
  - Timsort (sort padrão do Python)
  - Mede e exibe o tempo de execução de cada algoritmo.
- **Operações na Lista Desordenada:**  
  - Busca linear
  - Inserção de elemento
  - Exclusão de elemento
- **Operações na Lista Ordenada:**  
  - Busca binária
  - Inserção (mantendo a ordem)
  - Exclusão de elemento
- **Menu Interativo:**  
  Interface de linha de comando para seleção das operações.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 17_Lista_Ordenacao.py
```

## Exemplo de uso

```
--- Laboratório de Performance de Algoritmos ---
Status: 1000000 itens carregados

[ Menu Principal ]
1. Ordenar a lista
2. Realizar operação na lista DESORDENADA
3. Realizar operação na lista ORDENADA
4. Sair
Escolha uma opção: 1

--- Escolha o algoritmo de ordenação ---
1. Bubble Sort
2. Selection Sort
3. Insertion Sort
4. Merge Sort
5. Quick Sort
6. Timsort (Padrão do Python - .sort())
7. Voltar
Escolha o algoritmo: 6
Números ordenados com Timsort:
Tempo gasto: 0.12345 segundos
```

## Estruturas e Conceitos Utilizados

- Listas para armazenamento dos dados.
- Funções para busca linear e binária.
- Implementações de algoritmos de ordenação clássicos.
- Medição de tempo com o módulo `time`.
- Manipulação de arquivos para persistência dos dados.

## Observações

- Algoritmos como Bubble, Selection e Insertion Sort são lentos para grandes volumes de dados e servem para fins didáticos.
- O programa permite comparar o desempenho prático dos algoritmos.
- A lista ordenada é gerada a partir da lista desordenada, sem alterar o arquivo original.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.