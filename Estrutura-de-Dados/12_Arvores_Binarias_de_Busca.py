# No exercício do Simulador de Sistemas de arquivo adicione o seguinte menu e implemente as funcionalidades correspondentes

# 1 - criar uma pasta -> criar_pasta(nome)
# 2 - criar um arquivo -> criar_arquivo(nome, tamanho)
# 3 - adiciona item -> adicionar_item(pasta_destino, item)
# 4 - imprimir em pré-ordem
# 5 - imprimir em pós-ordem
# 6 - buscar arquivo
# 7 - buscar pasta
# 8 - imprimir árvore
# 9 - calcular o tamanho de uma pasta -> calcular_tamanho(pasta)

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

def buscar_arquivo(pasta_atual, nome_arquivo):
    if pasta_atual['tipo'] == 'arquivo' and pasta_atual['nome'] == nome_arquivo:
        return pasta_atual
    for filho in pasta_atual.get('filhos', []):
        resultado = buscar_arquivo(filho, nome_arquivo)
        if resultado:
            return resultado
    return None

def buscar_pasta(pasta_atual, nome_pasta):
    if pasta_atual['tipo'] == 'pasta' and pasta_atual['nome'] == nome_pasta:
        return pasta_atual
    for filho in pasta_atual.get('filhos', []):
        if filho['tipo'] == 'pasta':
            resultado = buscar_pasta(filho, nome_pasta)
            if resultado:
                return resultado
    return None

def pre_ordem(raiz):
    if raiz['tipo'] == 'arquivo':
        print(f"{raiz['nome']} ({raiz['tamanho']} KB)")
    else:
        print(raiz['nome'])
    for filho in raiz.get('filhos', []):
        pre_ordem(filho)

def pos_ordem(raiz):
    for filho in raiz.get('filhos', []):
        pos_ordem(filho)
    if raiz['tipo'] == 'arquivo':
        print(f"{raiz['nome']} ({raiz['tamanho']} KB)")
    else:
        print(raiz['nome'])

def exibir_menu():
    print("\nMenu:")
    print("1 - Criar pasta")
    print("2 - Criar arquivo")
    print("3 - Adicionar item a uma pasta")
    print("4 - Imprimir em pré-ordem")
    print("5 - Imprimir em pós-ordem")
    print("6 - Buscar arquivo")
    print("7 - Buscar pasta")
    print("8 - Imprimir estrutura de pastas")
    print("9 - Calcular tamanho total de uma pasta")
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
        print("\nImpressão em pré-ordem:")
        pre_ordem(raiz)
    
    elif opcao == '5':
        print("\nImpressão em pós-ordem:")
        pos_ordem(raiz)
    
    elif opcao == '6':
        nome_arquivo = input("Informe o nome do arquivo a buscar: ")
        arquivo_encontrado = buscar_arquivo(raiz, nome_arquivo)
        if arquivo_encontrado:
            print(f"Arquivo encontrado: {arquivo_encontrado['nome']} ({arquivo_encontrado['tamanho']} KB)")
        else:
            print("Arquivo não encontrado.")
    
    elif opcao == '7':
        nome_pasta = input("Informe o nome da pasta a buscar: ")
        pasta_encontrada = buscar_pasta(raiz, nome_pasta)
        if pasta_encontrada:
            print(f"Pasta encontrada: {pasta_encontrada['nome']}")
        else:
            print("Pasta não encontrada.")
    
    elif opcao == '8':
        imprimir_estrutura(raiz)
    
    elif opcao == '9':
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