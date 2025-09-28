import random
import time

nome_arquivo = 'dados_desordenados.txt'
quantidade = 1000000
numeros = list(range(1, quantidade + 1))  # Lista com 1 a 1.000.000
random.shuffle(numeros)  # Embaralha a lista

with open(nome_arquivo, 'w') as f:
    for numero in numeros:
        f.write(f"{numero}\n")

print(f"Arquivo '{nome_arquivo}' criado com sucesso.")

# Função para ler os dados do arquivo
numeros = []  # redefine para evitar duplicação
with open(nome_arquivo, 'r') as f:
    for linha in f:
        numeros.append(int(linha.strip()))
print(f"Lista carregada com {len(numeros)} itens.")

def busca_linear(lista, elemento):
    for item in lista:
        if item == elemento:
            return True
    return False

#Busca linear na lista desordenada, retorna índice ou -1
def busca_linear(lista, elemento):
    for i, item in enumerate(lista):
        if item == elemento:
            return i
    return -1

# Busca binária na lista ordenada, retorna índice ou -1
def busca_binaria(lista, elemento):
    esquerda, direita = 0, len(lista) - 1
    while esquerda <= direita:
        meio = (esquerda + direita) // 2
        if lista[meio] == elemento:
            return meio
        elif lista[meio] < elemento:
            esquerda = meio + 1
        else:
            direita = meio - 1
    return -1

def selection_sort(lista):
    n = len(lista)
    for i in range(n):
        min_idx = i
        for j in range(i+1, n):
            if lista[j] < lista[min_idx]:
                min_idx = j
        lista[i], lista[min_idx] = lista[min_idx], lista[i]
    return lista

def insertion_sort(lista):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and chave < lista[j]:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = chave
    return lista

def merge_sort(lista):
    if len(lista) > 1:
        mid = len(lista) // 2
        L = lista[:mid]
        R = lista[mid:]

        merge_sort(L)
        merge_sort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                lista[k] = L[i]
                i += 1
            else:
                lista[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            lista[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            lista[k] = R[j]
            j += 1
            k += 1

    return lista

def quick_sort(lista):
    if len(lista) <= 1:
        return lista
    else:
        pivo = lista[len(lista) // 2]
        menores = [x for x in lista if x < pivo]
        iguais = [x for x in lista if x == pivo]
        maiores = [x for x in lista if x > pivo]
        return quick_sort(menores) + iguais + quick_sort(maiores)

def timsort(lista):
    lista.sort()
    return lista

while True:
    print("--- Laboratório de Performance de Algoritmos ---")
    print(f"Status: {quantidade} itens carregados")
    print("\n[ Menu Principal ]")
    print("1. Ordenar a lista")
    print("2. Realizar operação na lista DESORDENADA")
    print("3. Realizar operação na lista ORDENADA")
    print("4. Sair")
    opcao = input("Escolha uma opção:\t")

    if opcao == '1':
        print("\n--- Escolha o algoritmo de ordenação ---")
        print("1. Bubble Sort")
        print("2. Selection Sort")
        print("3. Insertion Sort")
        print("4. Merge Sort")
        print("5. Quick Sort")
        print("6. Timsort (Padrão do Python - .sort())")
        print("7. Voltar")
        algoritmo = input("Escolha o algoritmo:\t")

        if algoritmo == '1':
            numeros_copia = numeros.copy()
            inicio = time.time()
            numeros_ordenados = bubble_sort(numeros_copia)
            fim = time.time()
            print("Números ordenados com Bubble Sort:")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif algoritmo == '2':
            numeros_copia = numeros.copy()
            inicio = time.time()
            numeros_ordenados = selection_sort(numeros_copia)
            fim = time.time()
            print("Números ordenados com Selection Sort:")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif algoritmo == '3':
            numeros_copia = numeros.copy()
            inicio = time.time()
            numeros_ordenados = insertion_sort(numeros_copia)
            fim = time.time()
            print("Números ordenados com Insertion Sort:")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif algoritmo == '4':
            numeros_copia = numeros.copy()
            inicio = time.time()
            numeros_ordenados = merge_sort(numeros_copia)
            fim = time.time()
            print("Números ordenados com Merge Sort:")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif algoritmo == '5':
            numeros_copia = numeros.copy()
            inicio = time.time()
            numeros_ordenados = quick_sort(numeros_copia)
            fim = time.time()
            print("Números ordenados com Quick Sort:")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif algoritmo == '6':
            numeros_copia = numeros.copy()
            inicio = time.time()
            numeros_ordenados = timsort(numeros_copia)
            fim = time.time()
            print("Números ordenados com Timsort:")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif algoritmo == '7':
            continue

    elif opcao == '2':
        print("\n--- Operação na Lista DESORDENADA ---")
        print("a. Buscar um elemento")
        print("b. Inserir um elemento")
        print("c. Excluir um elemento")
        print("d. Voltar ao menu principal")
        operacao = input("Escolha a operação:\t")
        if operacao == 'a':  # Buscar na lista desordenada
            elemento = int(input("Digite o elemento a ser buscado:\t"))
            inicio = time.time()
            posicao = busca_linear(numeros, elemento)
            fim = time.time()
            if posicao != -1:
                print(f"Elemento {elemento} encontrado na posição {posicao}.")
            else:
                print(f"Elemento {elemento} não encontrado.")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")
        elif operacao == 'b':
            elemento = int(input("Digite o elemento a ser inserido:\t"))
            if elemento in numeros:
                print(f"Elemento {elemento} já existe na lista.")
            else:
                numeros.append(elemento)
                print(f"Elemento {elemento} inserido com sucesso.")
        elif operacao == 'c':
            elemento = int(input("Digite o elemento a ser excluído:\t"))
            if elemento in numeros:
                numeros.remove(elemento)
                print(f"Elemento {elemento} excluído com sucesso.")
            else:
                print(f"Elemento {elemento} não encontrado para exclusão.")
        elif operacao == 'd':
            continue
        else:
            print("Opção inválida. Tente novamente.")

    elif opcao == '3':
        print("\n--- Operação na Lista ORDENADA ---")
        print("a. Buscar um elemento")
        print("b. Inserir um elemento")
        print("c. Excluir um elemento")
        print("d. Voltar ao menu principal")
        operacao = input("Escolha a operação:\t")
        if not numeros_ordenados:
            print("A lista ordenada está vazia. Por favor, ordene a lista primeiro.")
            continue
        if operacao == 'a':
            elemento = int(input("Digite o elemento a ser buscado:\t"))
            inicio = time.time()
            posicao = busca_binaria(numeros_ordenados, elemento)
            fim = time.time()
            if posicao != -1:
                print(f"Elemento {elemento} encontrado na posição {posicao}.")
            else:
                print(f"Elemento {elemento} não encontrado.")
            print(f"Tempo gasto: {fim - inicio:.5f} segundos")

        elif operacao == 'b':
            elemento = int(input("Digite o elemento a ser inserido:\t"))
            if elemento in numeros_ordenados:
                print(f"Elemento {elemento} já existe na lista.")
            else:
                numeros_ordenados.append(elemento)
                numeros_ordenados.sort()
                print(f"Elemento {elemento} inserido com sucesso.")

        elif operacao == 'c':
            elemento = int(input("Digite o elemento a ser excluído:\t"))
            if elemento in numeros_ordenados:
                numeros_ordenados.remove(elemento)
                print(f"Elemento {elemento} excluído com sucesso.")
            else:
                print(f"Elemento {elemento} não encontrado para exclusão.")

        elif operacao == 'd':
            continue
        else:
            print("Opção inválida. Tente novamente.")

    elif opcao == '4':
        print("Saindo do programa...")
        break

    else:
        print("Opção inválida. Tente novamente.")
    print("\n" + "-" * 50)