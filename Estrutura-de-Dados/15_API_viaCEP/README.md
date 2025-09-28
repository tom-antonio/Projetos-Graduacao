# Sistema de Gerenciamento de Lista de Tarefas Pessoais

Este projeto é um programa em Python que permite ao usuário gerenciar uma lista de tarefas pessoais de forma simples e interativa, utilizando listas e dicionários para armazenar as informações.

## Funcionalidades

- **Adicionar nova tarefa:** O usuário informa a descrição e o sistema gera um ID único, cadastrando a tarefa com status "Pendente".
- **Listar todas as tarefas:** Exibe todas as tarefas cadastradas, mostrando o código (ID), descrição e status.
- **Marcar tarefa como concluída:** Permite ao usuário marcar uma tarefa como "Concluída" a partir do seu código.
- **Sair:** Encerra o programa.

## Como funciona

- Cada tarefa é um dicionário com as chaves: `codigo` (ID), `descricao` e `status`.
- As tarefas são armazenadas em uma lista.
- O menu é exibido em loop até o usuário escolher sair.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 14_Lista_Dicionarios_Arvores.py
```

## Exemplo de uso

```
Menu de Tarefas
1 - Adicionar nova tarefa;
2 - Listar todas as tarefas;
3 - Marcar tarefa como concluída
0 - Sair do programa
Escolha uma opção: 1
Informe a descrição da tarefa: Estudar para a prova
Tarefa adicionada: 1 - Estudar para a prova (Status: pendente)

Menu de Tarefas
1 - Adicionar nova tarefa;
2 - Listar todas as tarefas;
3 - Marcar tarefa como concluída
0 - Sair do programa
Escolha uma opção: 2
Código: 1, Descrição: Estudar para a prova, Status: pendente
```

## Observações

- IDs são gerados automaticamente e incrementados conforme o número de tarefas.
- O sistema trata casos em que não há tarefas cadastradas.
- Ao tentar marcar uma tarefa inexistente, uma mensagem de erro é exibida.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.