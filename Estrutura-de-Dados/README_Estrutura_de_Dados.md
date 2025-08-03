###    ESTRUTURA DE DADOS    ####
Objetivos:
Compreender as principais estruturas de dados, algoritmos de pesquisa, algoritmos de ordenação e acesso à memória secundária. Habilitar o aluno a empregar estes conceitos na resolução de problemas computacionais práticos.

Ementa da Disciplina:
Estruturas de dados tradicionais: pilha, fila e árvores. Estruturas de dados com alocação estática e dinâmica de memória. Algoritmos de ordenação. Algoritmos de busca. Análise de complexidade de algoritmos. Acesso à memória secundária: abertura, leitura e escrita de arquivos; representação e armazenamento de informações em formato binário e formato texto.

Exercicios desenvolvidos:
1) Crie um programa em python que receba o nome do aluno e 4 notas. Se média menor que 5,0, o aluno está reprovado, se média maior ou igual a 6,0, aluno aprovado, caso contrário o aluno está de recuperação.
2) Criar um programa que calcula a equação de Bhaskara, retornando o valor da raiz, se existe ou se não existe valor real.
3) Criar um programa que simule a verificação de acesso a um prédio. O sistema deve solicitar informações do usuário e, com base nessas informações, decidir se o acesso será liberado ou negado. O programa pergunta o nome da pessoa, se ela é morador, visitante ou prestador de serviço, e o horário atual (em formato de 0 a 23, por exemplo, 15 para 15h).
4) Simular um sistema de gerenciamento de compras em um supermercado, utilizando listas.
5) Praticar o uso de dicionários, listas, entrada de dados, estrutura de decisão e laços de repetição em Python, simulando um sistema de administração de produtos para um e-commerce. Você foi contratado para criar a área administrativa de um sistema de e-commerce. Nessa área, os administradores poderão listar, cadastrar, alterar e excluir produtos que aparecem no site.
6) Praticar manipulação de strings, fatiamento, conversão de tipos e lógica condicional. Crie um programa em Python que leia do usuário uma ou mais expressões matemáticas simples em formato de string e exiba o resultado de cada operação.
7) Criem um programa em Phyton que apresente o seguinte menu ao usuário em um loop. Implemente as funções correspondentes.
    1 - Empilhar (Push)
    2 - Desempilhar (Pop)
    3 - Verificar quem está no topo da pilha (Top)
    4 - Verificar se a pilha está cheia (isFull)
    5 - Verificar se a pilha está vazia (isEmpty)
    6 - remover todos os elementos da pilha (RemoveAll)
    7 - Mostrar pilha
    8 - sair
8) Criem um programa em Phyton que apresente o seguinte menu ao usuário em um loop. Implemente as funções correspondentes. Não utilize a collections.deque.
    1 - Enfileirar elemento
    2 - Desenfileirar
    3 - Verificar quem é o Primeiro da Fila
    4 - Verificar quem é o último da Fila
    5 - Verificar se a fila está cheia
    6 - Verificar se a fila está vazia
    7 - Sair do programa
9) Desenvolver um sistema de terminal interativo, utilizando conjuntos (set) e busca simples, para controlar e consultar a participação de funcionários em dois eventos de uma empresa. Você deve criar um sistema que permita: Cadastrar os nomes dos funcionários que participaram de cada evento, Consultar diferentes informações sobre a participação, Remover participantes e Executar todas as ações por meio de um menu interativo em loop.
10) Simular a inscrição de um usuário em um evento online, com validações feitas no back-end e envio de resposta apropriada.
    Parte 1 – FRONT-END
    Criar um dicionário com os dados do usuário.
    Serializar com json.dumps() e enviar ao back-end.

    Parte 2 – BACK-END
    Desserializar o JSON recebido.
    Aplicar as seguintes regras de negócio:
    O nome deve ter pelo menos 3 caracteres.
    O email deve conter "@" e terminar com ".com".
    A idade deve ser 16 anos ou mais.
    O interesse deve estar entre as opções aceitas: "Programação", "Design", "Marketing".
    Armazenar todos os cadastros válidos em uma lista chamada banco_de_dados.
11) Criar uma estrutura de dados em Python que simule um sistema de arquivos, como o do seu computador, onde pastas podem conter outras pastas ou arquivos. Esse exercício ajuda a entender a aplicação de árvores, uso de dicionários aninhados, e recursão para navegação e operações.
12) No exercício do Simulador de Sistemas de arquivo adicione o seguinte menu e implemente as funcionalidades correspondentes
    1 - criar uma pasta -> criar_pasta(nome)
    2 - criar um arquivo -> criar_arquivo(nome, tamanho)
    3 - adiciona item -> adicionar_item(pasta_destino, item)
    4 - imprimir em pré-ordem
    5 - imprimir em pós-ordem
    6 - buscar arquivo
    7 - buscar pasta
    8 - imprimir árvore
    9 - calcular o tamanho de uma pasta -> calcular_tamanho(pasta)
13) Neste exercício, você construirá um sistema de gerenciamento de estoque para um armazém. O sistema permitirá adicionar/atualizar produtos, buscar produtos por código e exibir o estoque completo, tudo isso utilizando uma Árvore Binária de Busca (BST) implementada de forma "funcional" (sem classes) e um menu interativo para o usuário.
14) Desenvolver um sistema interativo em Python para gerenciar uma lista de tarefas pessoais. Você aplicará seus conhecimentos sobre estruturas de dados como listas e dicionários para armazenar e manipular as informações das tarefas, além de praticar a criação de uma interface de usuário baseada em menus no console.
15) Criar uma "Pokédex" interativa que consome dados da PokéAPI, demonstrando a habilidade de navegar e extrair informações de uma estrutura JSON mais complexa, que inclui listas e dicionários aninhados. Todo Treinador Pokémon precisa de uma Pokédex! Sua missão é criar uma versão de linha de comando que permita ao usuário buscar informações sobre qualquer Pokémon.
16) Desenvolver uma ferramenta de linha de comando para consultar, armazenar e gerenciar endereços a partir de CEPs, aplicando os conceitos de listas, dicionários, ordenação e manipulação de arquivos. Você foi contratado para criar um pequeno sistema para uma equipe de logística. Eles precisam de uma ferramenta que permita registrar múltiplos endereços a partir de seus CEPs e depois realizar operações sobre os dados coletados.
17) O objetivo é servir como um laboratório interativo para testar e comparar o desempenho de diferentes algoritmos de ordenação e busca em listas grandes de números inteiros. Ele permite ao usuário:
    Gerar e embaralhar uma lista de 1 milhão de números.
    Ordenar a lista usando vários algoritmos (Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, Timsort).
    Realizar operações de busca, inserção e exclusão tanto na lista desordenada quanto na ordenada.
    Medir o tempo gasto em cada operação para fins de análise de performance.
