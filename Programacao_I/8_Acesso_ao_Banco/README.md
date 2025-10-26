## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## How to compile and run

From the `src` folder, compile and run the `Postgres` test using the PostgreSQL JDBC driver in `lib/`:

```bash
# Compile
cd src
javac -cp "../lib/postgresql-42.6.0.jar:." Postgres.java

# Run
java -cp "../lib/postgresql-42.6.0.jar:." Postgres
```

Notes:
- Ensure PostgreSQL is running and the database credentials in `src/Postgres.java` match your local setup.
- If you prefer keeping class files out of `src`, compile to `bin` and run from the project root:

```bash
javac -cp "lib/postgresql-42.6.0.jar:src" -d bin src/Postgres.java
java -cp "lib/postgresql-42.6.0.jar:bin" Postgres
```

## Executar a aplicação App (com telas) e banco funcionando

Você pode usar as tarefas do VS Code (recomendado) ou configurar o CLASSPATH.

1) Usando Tarefas do VS Code
- Abra esta pasta (`8_Acesso_ao_Banco`) no VS Code.
- Pressione Ctrl/Cmd+Shift+P e execute "Tasks: Run Task".
- Escolha "Run App (with JDBC)". Isso irá compilar e executar com o driver no classpath.

2) Usando CLASSPATH no terminal (mantendo `javac App.java && java App`)
- No macOS/zsh, rode estes comandos uma vez por sessão na pasta `src`:

```bash
# Dentro de 8_Acesso_ao_Banco/src
export CLASSPATH="../lib/postgresql-42.6.0.jar:."

# Agora os comandos abaixo funcionam sem declarar -cp
javac App.java
java App
```

Se quiser tornar permanente, adicione a linha do `export CLASSPATH=...` ao seu `~/.zshrc` ajustando o caminho conforme sua máquina.

Observações:
- O botão Salvar em `FormPrioridade` agora usa `INSERT ... RETURNING id` e exibe o ID gerado pelo banco.
- Garanta que a tabela `tprioridade` exista com uma coluna `id` gerada (ex.: `id serial primary key`) e uma `descricao` (ex.: `varchar`).

