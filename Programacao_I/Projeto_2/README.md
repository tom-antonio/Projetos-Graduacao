# Projeto Cadastro de Veículos e Fabricantes

Este projeto em Java permite o cadastro e exibição de informações de veículos e seus respectivos fabricantes.

## Estrutura do Projeto

- `src/`: Contém os arquivos fonte Java.
  - [`App.java`](src/App.java): Classe principal que executa o programa.
  - [`Fabricante.java`](src/Fabricante.java): Classe que representa um fabricante de veículos.
  - [`Veiculo.java`](src/Veiculo.java): Classe que representa um veículo.
- `bin/`: Pasta de saída dos arquivos compilados.
- `lib/`: Pasta para dependências externas (não utilizada neste projeto).
- `.vscode/`: Configurações do Visual Studio Code.

## Como Executar

1. Compile os arquivos Java:
   ```sh
   javac -d bin src/*.java
   ```
2. Execute o programa:
   ```sh
   java -cp bin App
   ```

## Funcionalidades

- Cadastro de fabricantes com nome, CNPJ e cidade.
- Cadastro de veículos com placa, nome, ano, modelo e fabricante.
- Impressão dos dados dos veículos e seus fabricantes no console.

## Exemplo de Saída

```
###  Dados do Veículo  ###
Placa: NFH-2314
Nome: Corsa
Ano: 2006
Modelo: Duas portas
Nome: Chevrolet
CNPJ: 12.720.369/0001-72
Cidade: São Paulo

###  Dados do Veículo  ###
Placa: NGK-5948
Nome: S10
Ano: 2012
Modelo: Rodeio
Nome: Chevrolet
CNPJ: 12.720.369/0001-72
Cidade: São Paulo
```

## Autor

Projeto desenvolvido para a disciplina de Programação I.