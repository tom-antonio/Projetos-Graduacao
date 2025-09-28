# Sistema de Gerenciamento de Fila de Elementos

Este projeto é um programa em Python que simula as operações básicas de uma fila (estrutura de dados do tipo FIFO - First In, First Out) de elementos, por meio de um menu interativo no terminal.

## Funcionalidades

O usuário pode:

1. **Enfileirar elemento:** Adicionar um novo elemento ao final da fila.
2. **Desenfileirar:** Remover o elemento do início da fila.
3. **Verificar o primeiro da fila:** Visualizar o elemento que está na frente da fila.
4. **Verificar o último da fila:** Visualizar o elemento que está no final da fila.
5. **Verificar se a fila está cheia:** Saber se a fila atingiu sua capacidade máxima.
6. **Verificar se a fila está vazia:** Saber se não há elementos na fila.
7. **Mostrar os elementos da fila:** Exibir todos os elementos atuais da fila e seus índices.
8. **Sair do programa:** Encerrar o programa de forma segura.

O tamanho máximo da fila é definido pelo usuário no início da execução.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 8_Filas.py
```

## Exemplo de uso

```
Informe a capacidade de sua fila: 3
Programa de Enfileirar elementos!
1 - Enfileirar elemento;
2 - Desenfileirar;
3 - Verificar quem é o Primeiro da Fila;
4 - Verificar quem é o último da Fila;
5 - Verificar se a fila está cheia;
6 - Verificar se a fila está vazia;
7 - Mostrar os elementos da fila;
8 - Sair do programa.
Informe a opção que deseja: 1
Informe o elemento que deseja enfileirar: A
Enfileirando elemento A
Elemento enfileirado com sucesso!
```

## Estruturas utilizadas

- Lista para simular a fila.
- Variáveis de controle para o primeiro e o último elemento.
- Funções para cada operação clássica de fila.

## Observações

- Não utiliza `collections.deque`.
- O programa impede enfileiramento quando a fila está cheia e desenfileiramento quando está vazia.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.