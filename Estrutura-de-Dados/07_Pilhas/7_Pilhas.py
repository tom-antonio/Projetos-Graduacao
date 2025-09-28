# Criem um programa em Phyton que apresente o seguinte menu ao usuário em um loop. Implemente as funções correspondentes.

# O programa deve permitir as seguintes funções em uma pilha de inteiros:

# 1 - Empilhar (Push)
# 2 - Desempilhar (Pop)
# 3 - Verificar quem está no topo da pilha (Top)
# 4 - Verificar se a pilha está cheia (isFull)
# 5 - Verificar se a pilha está vazia (isEmpty)
# 6 - remover todos os elementos da pilha (RemoveAll)
# 7 - Mostrar pilha
# 8 - sair

# A ideia é a seguinte: ao executar o programa deve ser exibido o menu acima para o usuário em forma de loop.
# Caso ele digite a opção 1 por exemplo, deve ser solicitado o inteiro que será empilhado e na sequencia o menu é exibido novamente
# Caso digite a opção 7 por exemplo, deve ser informada a pilha com todos os seus elementos e na sequencia o menu é exibido novamante
# Ao digitar a opção 8 o programa deve encerrar.

t = int(input('Informe a quantidade de itens que deseja na pilha:\t'))
i = -1
pilha = [None]*t

def push(elemento):
    print(f'Empilhando elemento {elemento}')
    global i
    i = i + 1
    pilha[i] = elemento
    
def is_empty():
  if i == -1:
    return True
  else:
    return False
    
def pop():
  global i
  if is_empty():
    print('Pilha vazia')
  else:
    print(f'Desempilhando elemento {pilha[i]}')
    pilha[i] = None
    i = i - 1
    
def top():
  print('Verificando topo da pilha')
  if is_empty():
    print('Pilha vazia')
  else:
    print(f'O elemento do topo é {pilha[i]}')
    
def is_full():
  if i == (t-1):
    return True
  else:
    return False

def removeAll():
    global pilha
    pilha = [None]*t
    global i
    i = -1

while True:
    dado = input("""Menu de Empilhamento em Python!
1 - Empilhar novo elemento;
2 - Desempilhar elemento;
3 - Verificar quem está no topo da pilha;
4 - Verificar se a pilha está cheia;
5 - Verificar se a pilha está vazia;
6 - Remover todos os elementos da pilha;
7 - Mostrar pilha;
8 - Sair;
Informe a opção que deseja realizar:\t""")
    
    if dado == '1':
        push(input('Informe o elemento que deseja adicionar:\t'))
    elif dado == '2':
        pop()
    elif dado == '3':
        top()
    elif dado == '4':
        print('A pilha está cheia?\t', is_full())
    elif dado == '5':
        print('A pilha está vazia?\t', is_empty())
    elif dado == '6':
        aux = input('Deseja realmente remover todos os elementos da pilha(Sim ou Não)?\t')
        if aux.lower() == 'sim':
            removeAll()
        else:
            print('Retornando ao menu inicial!')
            continue
    elif dado == '7':
        print('Pilha: {}'.format(pilha))
    elif dado == '8':
        print('Programa encerrado com sucesso!')
        break
    else:
        print('Não foi possível executar esse comando! Tente novamente!')