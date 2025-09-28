# Simulação de Inscrição em Evento Online (JSON)

Este projeto é um programa em Python que simula o processo de inscrição de usuários em um evento online, realizando validações típicas de front-end e back-end, e utilizando a troca de dados em formato JSON.

## Funcionalidades

- **Front-End:** Coleta os dados do usuário (nome, email, idade, interesse), serializa para JSON e envia ao "back-end".
- **Back-End:** Desserializa os dados, valida as informações conforme regras de negócio e armazena inscrições válidas.
- **Resposta:** Retorna ao usuário uma mensagem de sucesso ou erro, conforme o resultado da validação.

## Regras de Negócio

- O nome deve ter pelo menos 3 caracteres.
- O email deve conter "@" e terminar com ".com".
- A idade deve ser igual ou superior a 16 anos.
- O interesse deve ser uma das opções: "Programação", "Design" ou "Marketing".

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 10_JSON.py
```

## Exemplo de uso

```
Informe quantos alunos deseja cadastrar: 2
Informe o nome do usuário: Ana
Informe o email do usuário: ana@email.com
Informe a idade do usuário: 18
Informe o interesse do usuário (Programação, Design, Marketing): Programação

Informe o nome do usuário: Bob
Informe o email do usuário: bob@email.com
Informe a idade do usuário: 15
Informe o interesse do usuário (Programação, Design, Marketing): Design

Nome: Ana
Email: ana@email.com
Idade: 18
Interesse: Programação
Situação:
Status: Sucesso
Mensagem: Inscrição realizada com sucesso!

Nome: Bob
Email: bob@email.com
Idade: 15
Interesse: Design
Situação:
Status: Erro
Mensagem: Erro: idade mínima não atingida, nome, email ou interesse em discordância.
```

## Estruturas utilizadas

- Dicionários e listas para armazenar os dados dos usuários.
- Serialização e desserialização de dados com `json.dumps()` e `json.loads()`.
- Funções para validação de email e interesse.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.