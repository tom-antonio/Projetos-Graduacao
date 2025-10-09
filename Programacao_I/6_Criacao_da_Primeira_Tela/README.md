# App — Cadastro de Autor (Interface Swing)

Resumo
-------
Aplicação Java Swing simples que fornece uma tela para cadastrar/alterar/excluir/pesquisar autores. Os dados inseridos nos campos (ID, Nome, Cidade) podem ser salvos em um arquivo texto (`autores.txt`).

Arquivos principais
-------------------
- src/App.java — Implementação da interface gráfica (JFrame) e lógica de interação com o usuário.
- autores.txt — Arquivo gerado/atualizado na execução para persistência simples dos registros (formato CSV separado por `;`).

Funcionalidades
---------------
- Formulário com campos:
  - ID (txtId)
  - Nome (txtNome)
  - Cidade (txtCidade)
- Botões:
  - Salvar — valida campos e anexa uma linha `id;nome;cidade` ao `autores.txt`.
  - Alterar — placeholder que atualmente apenas valida e exibe confirmação.
  - Excluir — placeholder que atualmente apenas valida e exibe confirmação.
  - Pesquisar — placeholder que atualmente apenas valida e exibe confirmação.
- Validação básica dos campos: exige que todos os campos estejam preenchidos antes de executar ações.
- Feedback ao usuário por meio de `JOptionPane`.

Como compilar e executar
-----------------------
No terminal, posicionado na raiz do módulo (onde está `src`):

1. Compilar:
   javac -d out src/*.java

2. Executar:
   java -cp out App

(ou use sua IDE: criar projeto Java, marcar `src` como source folder e executar `App.main`)

Comportamento de persistência
-----------------------------
- O botão Salvar usa `BufferedWriter` + `FileWriter(nomeArquivo, true)` para anexar registros.
- O arquivo `autores.txt` será criado no diretório de trabalho da execução.
- Cada registro é gravado como `ID;Nome;Cidade` seguido de nova linha.

Pontos importantes / Observações
--------------------------------
- Operações atuais de Alterar/Excluir/Pesquisar são apenas demonstrações (mostram `JOptionPane`). Para operar de verdade, implemente leitura/atualização/remoção em `autores.txt` ou use uma camada de persistência (lista em memória, arquivo mais estruturado ou banco de dados).
- Validação: o código exige preenchimento de todos os campos antes de prosseguir.
- Threading: todas as ações são executadas no EDT (Event Dispatch Thread). Evite blocos de I/O longos no EDT — use `SwingWorker` para operações demoradas.
- Internacionalização: mensagens estão em português; extraia para arquivo de recursos se necessário.
- Sugestão de melhoria arquitetural: criar classe `Autor` (modelo) e uma camada `AutorRepository` para separar UI de lógica de negócio / persistência (seguir MVC).

Exemplo de linha no arquivo autores.txt
--------------------------------------
123;João Silva;São Paulo

Licença e Autor
----------------
Projeto didático — desenvolvido para fins de aprendizado em Programação I / Criação de Interfaces.    