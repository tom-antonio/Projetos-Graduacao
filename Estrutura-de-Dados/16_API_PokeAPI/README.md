# Pokédex Interativa com PokéAPI

Este projeto é um programa em Python que simula uma Pokédex de linha de comando, permitindo ao usuário buscar informações detalhadas de qualquer Pokémon e comparar atributos entre dois Pokémon, utilizando dados da PokéAPI.

## Funcionalidades

- **Buscar Perfil de Pokémon:**  
  O usuário pode digitar o nome ou número de um Pokémon para consultar seu perfil, que inclui:
  - Nome oficial
  - Número na Pokédex
  - Tipos (ex: Electric, Fire)
  - Lista de habilidades
  - Peso (em kg)

- **Comparador de Batalha:**  
  O usuário informa dois Pokémon (nome ou número) e o programa exibe lado a lado:
  - Nome
  - Tipos
  - Peso (em kg)
  - Altura (em metros)
  - Indicação de qual é o mais pesado

- **Tratamento de Erros:**  
  Mensagens amigáveis caso o Pokémon não seja encontrado ou haja problemas de conexão.

- **Menu Interativo:**  
  Todas as operações são acessíveis por um menu simples no terminal.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 16_API_PokeAPI.py
```

## Exemplo de uso

```
Menu:
1. Buscar Pokémon
2. Comparar Pokémon
3. Sair
Escolha uma opção (1-3): 1
Digite o nome do Pokémon ou número dele: pikachu

--- Perfil do Pokémon ---
Nome: Pikachu
Nº na Pokédex: 25
Tipo(s):
- Electric
Habilidades:
- Static
- Lightning-rod
Peso: 6.0 kg
```

## Estruturas e Conceitos Utilizados

- **Requisições HTTP** com a biblioteca `requests` para consumir a PokéAPI.
- **Manipulação de JSON** para extrair informações de listas e dicionários aninhados.
- **Funções para modularização** das operações de busca e comparação.
- **Tratamento de exceções** para erros de conexão e buscas inválidas.

## Observações

- O peso é convertido de hectogramas para quilogramas (dividido por 10).
- A altura é convertida de decímetros para metros (dividido por 10).
- O programa diferencia maiúsculas/minúsculas automaticamente.

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.