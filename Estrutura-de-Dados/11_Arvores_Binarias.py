# Objetivo
# Criar uma estrutura de dados em Python que simule um sistema de arquivos, como o do seu computador, onde pastas podem conter outras pastas ou arquivos.

# Esse exercício ajuda a entender a aplicação de árvores, uso de dicionários aninhados, e recursão para navegação e operações.

# Estrutura esperada
# Cada elemento (nó) da árvore será um dicionário com a seguinte estrutura:

# Para pastas:
# {
# "nome": "pasta1",
# "tipo": "pasta",
# "filhos": [ ... ]
# }

# Para arquivos:
# {
# "nome": "arquivo.txt",
# "tipo": "arquivo",
# "tamanho": 120 # em KB
# }

# Funcionalidades obrigatórias
# Implemente funções em Python para:

# Criar um nó de pasta ou arquivo:
# criar_pasta(nome)
# criar_arquivo(nome, tamanho)

# Adicionar um item (arquivo ou pasta) a uma pasta existente:
# adicionar_item(pasta_destino, item)

# Exibir a estrutura de pastas/arquivos (estilo tree)
# imprimir_estrutura(pasta_raiz)

# Calcular o tamanho total de uma pasta (somando arquivos diretos e recursivos)
# calcular_tamanho(pasta)

# Exemplo de uso:

# raiz = criar_pasta("root")

# docs = criar_pasta("documentos")
# img = criar_arquivo("foto.png", 150)
# txt = criar_arquivo("texto.txt", 50)

# adicionar_item(docs, txt)
# adicionar_item(raiz, docs)
# adicionar_item(raiz, img)

# imprimir_estrutura(raiz)

# # Saída esperada:
# # └── root/
# # ├── documentos/
# # │ └── texto.txt (50 KB)
# # └── foto.png (150 KB)

# print(calcular_tamanho(raiz)) # 200


def criar_pasta(nome):
    return {'nome': nome, 'tipo': 'pasta', 'filhos': []}

def criar_arquivo(nome, tamanho):
    return {'nome': nome, 'tipo': 'arquivo', 'tamanho': tamanho}

def adicionar_item(pasta_destino, item):
    if pasta_destino['tipo'] != 'pasta':
        print("O destino deve ser uma pasta. Tente novamente.")
    pasta_destino['filhos'].append(item)

def imprimir_estrutura(pasta_raiz, prefixo='', eh_ultimo=True):
    conector = '└── ' if eh_ultimo else '├── '
    if pasta_raiz['tipo'] == 'arquivo':
        print(prefixo + conector + f"{pasta_raiz['nome']} ({pasta_raiz['tamanho']} KB)")
    else:
        print(prefixo + conector + pasta_raiz['nome'])
        novo_prefixo = prefixo + ('    ' if eh_ultimo else '│   ')
        for i, filho in enumerate(pasta_raiz.get('filhos', [])):
            imprimir_estrutura(filho, novo_prefixo, i == len(pasta_raiz['filhos']) - 1)
    
def calcular_tamanho(pasta):
    if pasta['tipo'] == 'arquivo':
        return pasta['tamanho']
    tamanho_total = 0
    for filho in pasta.get('filhos', []):
        tamanho_total += calcular_tamanho(filho)
    return tamanho_total

def buscar_pasta(pasta_atual, nome):
    if pasta_atual['nome'] == nome:
        return pasta_atual
    for filho in pasta_atual.get('filhos', []):
        if filho['tipo'] == 'pasta':
            resultado = buscar_pasta(filho, nome)
            if resultado:
                return resultado
    return None

def exibir_menu():
    print("\nMenu:")
    print("1 - Criar pasta")
    print("2 - Criar arquivo")
    print("3 - Adicionar item a uma pasta")
    print("4 - Imprimir estrutura de pastas")
    print("5 - Calcular tamanho total de uma pasta")
    print("0 - Sair")
    return input("Informe a opção desejada:\t")

raiz = criar_pasta('raiz')

while True:
    opcao = exibir_menu()
    
    if opcao == '1':
        nome_pasta = input("Informe o nome da nova pasta:\t")
        nova_pasta = criar_pasta(nome_pasta)
        adicionar_item(raiz, nova_pasta)
        print(f"Pasta '{nome_pasta}' criada com sucesso.")
        
    elif opcao == '2':
        nome_arquivo = input("Informe o nome do novo arquivo:\t")
        tamanho_arquivo = int(input("Informe o tamanho do arquivo (em KB):\t"))
        arquivo = criar_arquivo(nome_arquivo, tamanho_arquivo)
        adicionar_item(raiz, arquivo)
        print(f"Arquivo '{nome_arquivo}' criado com sucesso.")
        
    elif opcao == '3':
        nome_pasta_destino = input("Informe o nome da pasta de destino:\t")
        pasta_destino = buscar_pasta(raiz, nome_pasta_destino)
        if not pasta_destino:
            print(f"Pasta '{nome_pasta_destino}' não encontrada.")
        else:
            tipo_item = input("Informe o tipo que deseja adicionar (Pasta ou Arquivo):\t")
            if tipo_item.lower() == 'pasta':
                nome_nova_pasta = input("Informe o nome da nova pasta:\t")
                item = criar_pasta(nome_nova_pasta)
            else:
                nome_novo_arquivo = input("Informe o nome do novo arquivo:\t")
                tamanho_item = int(input("Informe o tamanho do arquivo (em KB):\t"))
                item = criar_arquivo(nome_novo_arquivo, tamanho_item)
            adicionar_item(pasta_destino, item)
            print(f"Item '{item['nome']}' adicionado à pasta '{nome_pasta_destino}'.")
        
    elif opcao == '4':
        imprimir_estrutura(raiz)
        
    elif opcao == '5':
        nome_pasta_calcular = input("Informe o nome da pasta para calcular o tamanho:\t")
        pasta_calcular = buscar_pasta(raiz, nome_pasta_calcular)
        if not pasta_calcular:
            print(f"Pasta '{nome_pasta_calcular}' não encontrada.")
        else:
            tamanho_total = calcular_tamanho(pasta_calcular)
            print(f"Tamanho total da pasta '{nome_pasta_calcular}': {tamanho_total} KB")
        
    elif opcao == '0':
        print("Saindo do programa.")
        break
        
    else:
        print("Opção inválida. Tente novamente.")