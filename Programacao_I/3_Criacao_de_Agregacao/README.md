# Sistema de Gerenciamento de Livros

Este projeto Java simula um sistema simples para cadastro e gerenciamento de livros, autores, editoras e tipos de capa.

## Estrutura do Projeto

- `Autor.java`: Classe que representa um autor, com métodos para salvar, alterar, excluir e pesquisar.
- `Editora.java`: Classe que representa uma editora, com métodos para salvar, alterar, excluir e pesquisar.
- `TipoCapa.java`: Classe que representa o tipo de capa de um livro.
- `Livro.java`: Classe que representa um livro, relacionando autor, editora e tipo de capa.
- `App.java`: Classe principal que instancia objetos e demonstra o funcionamento do sistema.

## Funcionalidades

- Cadastro de autores, editoras, tipos de capa e livros.
- Métodos para salvar, alterar, excluir e pesquisar cada entidade.
- Relacionamento entre livro, autor, editora e tipo de capa.

## Como Executar

1. Compile os arquivos Java:
   ```sh
   javac *.java
   ```
2. Execute o programa principal:
   ```sh
   java App
   ```

## Exemplo de Saída

```
Você salvou o autor Paulo Freire
Você alterou o autor Paulo Freire
Você excluiu o autor Paulo Freire
Você pesquisou o autor Paulo Freire
--------------------------------------------------
Você salvou o livro Pedagogia da Esperança
Você alterou o livro Pedagogia da Esperança
Você excluiu o livro Pedagogia da Esperança
Você pesquisou o livro Pedagogia da Esperança
--------------------------------------------------
Você salvou o livro Senhor dos Anéis
Você alterou o livro Senhor dos Anéis
Você excluiu o livro Senhor dos Anéis
Você pesquisou o livro Senhor dos Anéis
```

## Autor

Projeto desenvolvido para fins acadêmicos na disciplina de Programação I.