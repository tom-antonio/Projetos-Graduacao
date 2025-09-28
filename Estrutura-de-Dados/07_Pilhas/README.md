# Sistema de Gerenciamento de Pilha de Inteiros

Este projeto é um programa em Python que simula as operações básicas de uma pilha (estrutura de dados do tipo LIFO - Last In, First Out) de inteiros, por meio de um menu interativo no terminal.

## Funcionalidades

O usuário pode:

1. **Empilhar (Push):** Adicionar um novo elemento ao topo da pilha.
2. **Desempilhar (Pop):** Remover o elemento do topo da pilha.
3. **Verificar o topo (Top):** Visualizar o elemento que está no topo da pilha.
4. **Verificar se a pilha está cheia (isFull):** Saber se a pilha atingiu sua capacidade máxima.
5. **Verificar se a pilha está vazia (isEmpty):** Saber se não há elementos na pilha.
6. **Remover todos os elementos (RemoveAll):** Esvaziar completamente a pilha.
7. **Mostrar pilha:** Exibir todos os elementos atuais da pilha.
8. **Sair:** Encerrar o programa.

O tamanho máximo da pilha é definido pelo usuário no início da execução.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 7_Pilhas.py
```

## Exemplo de uso

```
Informe a quantidade de itens que deseja na pilha: 3
Menu de Empilhamento em Python!
1 - Empilhar novo elemento;
2 - Desempilhar elemento;
...
Informe a opção que deseja realizar: 1
Informe o elemento que deseja adicionar: 10
Empilhando elemento 10
...
```

## Estruturas utilizadas

- Lista para simular a pilha.
- Variável de controle para o topo da pilha.
- Funções para cada operação clássica de pilha.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.