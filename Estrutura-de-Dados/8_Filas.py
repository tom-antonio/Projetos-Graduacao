# Criem um programa em Phyton que apresente o seguinte menu ao usuário em um loop. Implemente as funções correspondentes. Não utilize a collections.deque.

# 1 - Enfileirar elemento
# 2 - Desenfileirar
# 3 - Verificar quem é o Primeiro da Fila
# 4 - Verificar quem é o último da Fila
# 5 - Verificar se a fila está cheia
# 6 - Verificar se a fila está vazia
# 7 - Sair do programa

primeiro = -1
ultimo = -1
capacidade = int(input('Informe a capacidade de sua fila:\t'))
numero_elementos = 0
fila = [None] * capacidade

def is_empty():
    return numero_elementos == 0

def is_full():
    return numero_elementos == capacidade or numero_elementos == ultimo

def first():
    if is_empty():
        print("Fila vazia.")
        return None
    return fila[primeiro]

def last():
    if is_empty():
        print("Fila vazia.")
        return None
    return fila[ultimo]

def enqueue(elemento):
    global ultimo, primeiro, numero_elementos, fila
    if is_full():
        print("Fila cheia!")
    else:
        print("Enfileirando elemento {}".format(elemento))
        print('Elemento enfileirado com sucesso!')
        if is_empty():
            primeiro = 0
            ultimo = 0
        else:
            ultimo = ultimo + 1

        fila[ultimo] = elemento
        numero_elementos += 1
        
def dequeue():
    global primeiro, ultimo, numero_elementos, fila, capacidade

    if is_empty():
        print("Fila vazia")
    else:
        print("Desenfileirando elemento {}".format(fila[primeiro]))
        print("Elemento desenfileirado com sucesso!")
        fila[primeiro] = None
        numero_elementos -= 1

        if is_empty():
            primeiro = -1
            ultimo = -1
        else:
            primeiro = primeiro + 1

def mostrar_fila():
    print("Fila:", fila)
    print("Índice do primeiro:", primeiro)
    print("Índice do último:", ultimo)
    print("Número de elementos:", numero_elementos)

while True:
    dado = input("""Programa de Enfileirar elementos!
    1 - Enfileirar elemento;
    2 - Desenfileirar;
    3 - Verificar quem é o Primeiro da Fila;
    4 - Verificar quem é o último da Fila;
    5 - Verificar se a fila está cheia;
    6 - Verificar se a fila está vazia;
    7 - Mostrar os elementos da fila;
    8 - Sair do programa.
    Informe a opção que deseja:\t""")

    if dado == '1':
        elemento = input('Informe o elemento que deseja enfileirar:\t')
        enqueue(elemento)
    elif dado == '2':
        dequeue()
    elif dado == '3':
        print('O primeiro elemento da fila é:', first())
    elif dado == '4':
        print('O último elemento da fila é:', last())
    elif dado == '5':
        print('A fila está cheia?', is_full())
    elif dado == '6':
        print('A fila está vazia?', is_empty())
    elif dado == '7':
        mostrar_fila()
    elif dado == '8':
        escolha = input('Confirma a saída do programa (Sim ou Não)?\t')
        if escolha.lower() == 'sim':
            print('Programa encerrado com sucesso!')
            break
        else:
            print('Retornando ao menu inicial!')
            continue
    else:
        print('Opção não identificada! Tente novamente!')