# Sistema de Controle de Participação em Eventos

Este projeto é um programa em Python que utiliza conjuntos (`set`) para gerenciar e consultar a participação de funcionários em dois eventos de uma empresa: o Evento Técnico e o Evento Cultural.

## Funcionalidades

O sistema permite:

1. **Cadastrar participantes** em cada evento.
2. **Remover participantes** de um evento específico.
3. **Exibir funcionários que participaram dos dois eventos** (interseção).
4. **Exibir funcionários que participaram de apenas um dos eventos** (diferença simétrica).
5. **Consultar a participação individual** de um funcionário, informando se ele participou de nenhum, de um ou de ambos os eventos.
6. **Menu interativo** para navegação entre as opções.
7. **Encerrar o programa** de forma segura.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 9_Conjuntos.py
```

## Exemplo de uso

```
=== Menu de Consulta de Participação ===
1 - Inserir participantes do Evento Técnico;
2 - Inserir participantes do Evento Cultural;
3 - Remover participante de um evento;
4 - Mostrar funcionários que participaram dos DOIS eventos;
5 - Mostrar funcionários que participaram de APENAS UM evento;
6 - Consultar se um funcionário participou (e de quais eventos);
7 - Sair;
Informe a opção desejada: 1
Informe a quantidade de participantes que deseja inserir: 2
Informe o nome do 1 participante: Ana
Participante cadastrado com sucesso!
Informe o nome do 2 participante: Bruno
Participante cadastrado com sucesso!
```

## Estruturas utilizadas

- **Conjuntos (`set`)** para armazenar os nomes dos participantes de cada evento.
- **Operações de conjuntos**: interseção (`&`), diferença simétrica (`^`).
- **Laço `while True`** para manter o menu ativo até o usuário optar por sair.
- **Funções de entrada e saída** (`input`, `print`) para interação com o usuário.

## Observações

- Os nomes dos participantes são armazenados em letras minúsculas para evitar duplicidade por diferença de maiúsculas/minúsculas.
- O programa utiliza `discard` para remoção segura de participantes, sem gerar erro caso o nome não exista no conjunto.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.