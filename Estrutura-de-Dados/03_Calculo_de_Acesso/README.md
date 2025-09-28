# Sistema de Verificação de Acesso ao Prédio

Este projeto é um programa em Python que simula a verificação de acesso a um prédio, controlando a entrada de moradores, visitantes e prestadores de serviço conforme regras de horário.

## Funcionalidades

- Solicita o nome do usuário.
- Pergunta o tipo de entrada: Morador (M), Visitante (V) ou Prestador de Serviço (P).
- Solicita o horário de entrada (0 a 23).
- Verifica as regras de acesso:
  - **Moradores**: acesso liberado a qualquer hora.
  - **Visitantes**: acesso permitido das 8h às 22h.
  - **Prestadores de serviço**: acesso permitido das 8h às 18h.
- Permite múltiplas verificações até o usuário digitar "sair" como nome.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 3_Controle_de_Acesso.py
```

## Exemplo de uso

```
Informe o seu nome ou digite (sair) para encerrar o programa: João
Informe o tipo de sua entrada (M - Morador, V - Visitante, P - Prestador de Serviço) Digite: M, V ou P: V
Informe o horário de entrada: 21
Entrada liberada! Seja bem vindo(a) João!

Informe o seu nome ou digite (sair) para encerrar o programa: Maria
Informe o tipo de sua entrada (M - Morador, V - Visitante, P - Prestador de Serviço) Digite: P
Informe o horário de entrada: 19
Entrada negada! Fora do horário permitido Maria!

Informe o seu nome ou digite (sair) para encerrar o programa: sair
```

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.