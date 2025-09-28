# Neste exercício, você construirá um sistema de gerenciamento de estoque para um armazém. O sistema permitirá adicionar/atualizar produtos, buscar produtos por código e exibir o estoque completo, tudo isso utilizando uma Árvore Binária de Busca (BST) implementada de forma "funcional" (sem classes) e um menu interativo para o usuário.

# ### Cenário

# Seu armazém precisa de um controle de estoque rápido e eficaz. Cada produto é identificado por um **código numérico único**. Você precisa de um sistema que:

# 1. **Adicione novos produtos** ou **atualize a quantidade** de produtos já existentes.
# 2. **Busque produtos** para verificar sua quantidade atual.
# 3. **Exiba todos os produtos** em estoque, ordenados pelo código.

# ### Estrutura do Nó da BST (Dicionário)

# Cada "nó" na sua BST será um dicionário Python com as seguintes chaves:

# * `'codigo'`: O código identificador do produto (um número inteiro). Este será o valor chave para ordenar a BST.
# * `'quantidade'`: A quantidade em estoque desse produto (um número inteiro).
# * `'esquerda'`: Referência para o dicionário que representa o nó filho à esquerda. Se não houver filho esquerdo, será `None`.
# * `'direita'`: Referência para o dicionário que representa o nó filho à direita. Se não houver filho direito, será `None`.

# A **raiz da BST** será simplesmente a referência para o dicionário do nó mais superior. Se a BST estiver vazia, sua raiz será `None`.

# ---

# ### Funções da BST (Implementação Necessária)

# Você precisará criar as seguintes funções para manipular sua BST:

# 1. **`criar_no_bst(codigo, quantidade)`**
# * **Propósito:** Cria um novo dicionário que representa um nó na BST.
# * **Retorno:** Um dicionário no formato de nó da BST.

# 2. **`inserir_produto_bst(raiz_bst, codigo, quantidade)`**
# * **Propósito:** Adiciona um novo produto à BST ou atualiza a quantidade de um produto existente.
# * **Lógica da BST:**
# * Se a `raiz_bst` for `None`, crie um novo nó e retorne-o como a nova raiz da subárvore.
# * Se o `codigo` a ser inserido for **menor** que o `codigo` do nó atual, chame recursivamente `inserir_produto_bst` para a subárvore `'esquerda'`.
# * Se o `codigo` a ser inserido for **maior** que o `codigo` do nó atual, chame recursivamente `inserir_produto_bst` para a subárvore `'direita'`.
# * **Tratamento de Duplicatas:** Se o `codigo` já existir na BST (`codigo == raiz_bst['codigo']`), **adicione a nova `quantidade` à quantidade existente** no nó.
# * **Retorno:** O nó raiz (atualizado ou o mesmo) da subárvore, crucial para conectar os nós corretamente na recursão.

# 3. **`buscar_produto_bst(raiz_bst, codigo)`**
# * **Propósito:** Procura por um produto na BST e retorna sua quantidade em estoque.
# * **Lógica da BST:**
# * Se a `raiz_bst` for `None`, o produto não foi encontrado, retorne `None`.
# * Se o `codigo` do nó atual for igual ao `codigo` que você busca, retorne a `quantidade` desse nó.
# * Se o `codigo` a ser buscado for **menor** que o `codigo` do nó atual, chame recursivamente `buscar_produto_bst` na subárvore `'esquerda'`.
# * Se o `codigo` a ser buscado for **maior** que o `codigo` do nó atual, chame recursivamente `buscar_produto_bst` na subárvore `'direita'`.
# * **Retorno:** A `quantidade` do produto se ele for encontrado; caso contrário, `None`.

# 4. **`exibir_estoque_em_ordem_bst(raiz_bst)`**
# * **Propósito:** Percorre a BST e imprime todos os produtos (código e quantidade) em ordem crescente de código.
# * **Lógica:** Implemente o percurso em ordem (in-order traversal): visite a subárvore esquerda, depois o nó atual, e por fim a subárvore direita.
# * **Retorno:** Nenhuma (apenas imprime na tela).

# ---

# ### Menu Interativo (Loop Principal)

# Após implementar as funções da BST, você irá criar o laço principal do programa, que exibe um menu para o usuário e executa as operações com base em sua escolha.

# 1. **Função `exibir_menu()`:**
# * Imprime as opções disponíveis para o usuário.

# 2. **Loop Principal (`while True`):**
# * Chamará `exibir_menu()`.
# * Lerá a opção do usuário.
# * Usará uma estrutura `if/elif/else` para chamar a função BST apropriada ou lidar com a saída.
# * **Tratamento de Entradas:** Certifique-se de validar as entradas do usuário (por exemplo, que o código e a quantidade são números).

def exibir_menu():
    dado = input("""Gerenciamento de Estoque com BST!
Escolha a opção desejada:
1 - Adicionar/Atualizar produtos;
2 - Buscar produtos;
3 - Exibir produtos cadastrados;
0 - Sair do programa;
Informe a opção desejada:\t""")
    return dado

def criar_no_bst(codigo, quantidade):
    return {'codigo': codigo, 'quantidade': quantidade, 'esquerda': None, 'direita': None}

def inserir_bst(raiz, codigo, quantidade):
    if raiz is None:
        return criar_no_bst(codigo, quantidade)
    if codigo < raiz['codigo']:
        raiz['esquerda'] = inserir_bst(raiz['esquerda'], codigo, quantidade)
    elif codigo > raiz['codigo']:
        raiz['direita'] = inserir_bst(raiz['direita'], codigo, quantidade)
    else:
        raiz['quantidade'] = quantidade
    return raiz

def buscar_bst(raiz, codigo):
    if raiz is None or raiz['codigo'] == codigo:
        return raiz
    if codigo < raiz['codigo']:
        return buscar_bst(raiz['esquerda'], codigo)
    return buscar_bst(raiz['direita'], codigo)

def exibir_bst(raiz):
    if raiz is not None:
        exibir_bst(raiz['esquerda'])
        print(f"Código: {raiz['codigo']}, Quantidade: {raiz['quantidade']}")
        exibir_bst(raiz['direita'])

def imprimir_arvore_bst(raiz, prefixo='', eh_ultimo = True):
    if raiz is not None:
        imprimir_arvore_bst(raiz['direita'], prefixo + ('   ' if eh_ultimo else '|    '), False)
        conector = '└── ' if eh_ultimo else '├── '
        print(prefixo + conector + str(raiz['codigo']))
        imprimir_arvore_bst(raiz['esquerda'], prefixo + ('   ' if eh_ultimo else '|    '), True)

raiz = None

while True:
    opcao = exibir_menu()
    if opcao == '1':
        print("Opção 1 selecionada: Adicionar/Atualizar produtos.")
        codigo = input("Informe o código do produto: ")
        quantidade = int(input("Informe a quantidade do produto: "))
        if 'raiz' not in globals():
            raiz = criar_no_bst(codigo, quantidade)
        else:
            raiz = inserir_bst(raiz, codigo, quantidade)
    elif opcao == '2':
        print("Opção 2 selecionada: Buscar produtos.")
        codigo = input("Informe o código do produto a ser buscado: ")
        resultado = buscar_bst(raiz, codigo)
        if resultado:
            print(f"Produto encontrado: Código: {resultado['codigo']}, Quantidade: {resultado['quantidade']}")
        else:
            print("Produto não encontrado.")
    elif opcao == '3':
        print("Opção 3 selecionada: Exibir produtos cadastrados.")
        if 'raiz' in globals():
            print("Produtos cadastrados:")
            exibir_bst(raiz)
            print('\n')
            imprimir_arvore_bst(raiz)
            print('\n')
        else:
            print("Nenhum produto cadastrado.")
    elif opcao == '0':
        print("Saindo do programa.")
        break
    else:
        print("Opção inválida. Por favor, tente novamente.")