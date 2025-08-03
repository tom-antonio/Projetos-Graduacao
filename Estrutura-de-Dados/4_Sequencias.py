# Gerenciador de Lista de Compras do Mês
# Objetivo:
# Simular um sistema de gerenciamento de compras em um supermercado.

# Enunciado:
# Crie um programa que:

# Comece com uma lista de compras vazia:
# compras = [ ]

# Pergunte ao usuário se ele quer:

# 1 ➜ Adicionar um novo item à lista
# 2 ➜ Remover um item da lista
# 3 ➜ Verificar se um item está ou não na lista
# 4 ➜ mostrar o primeiro item da lista
# 5 ➜ mostrar o último item da lista
# 6 ➜ Mostrar os três primeiros e os três últimos itens da lista
# 7 ➜ colocar todos os itens em letras maiúsculas
# 8 ➜ colocar todos os itens em letras minúsculas
# 9 ➜ Mostrar a quantidade de itens na lista
# 10 ➜ Sair

# O programa deve continuar até o usuário digitar 10.

# Requisitos:
# Usar in / not in para verificar se o item está na lista.
# Usar slices.
# Usar append(), remove(), len().

compras = []
while True:
    dado = input("""Selecione uma opção, conforme as opções abaixo:
    1 ➜ Adicionar um novo item à lista
    2 ➜ Remover um item da lista
    3 ➜ Verificar se um item está ou não na lista
    4 ➜ mostrar o primeiro item da lista
    5 ➜ mostrar o último item da lista
    6 ➜ Mostrar os três primeiros e os três últimos itens da lista
    7 ➜ colocar todos os itens em letras maiúsculas
    8 ➜ colocar todos os itens em letras minúsculas
    9 ➜ Mostrar a quantidade de itens na lista
    10 ➜ Sair
    Digite a opção desejada:\t""")
    
    if dado == '1':
        item = input('Informe o item que deseja adicionar na lista:\t')
        compras.append(item)
        continue
    elif dado == '2':
        item = input('Informe o item que deseja remover na lista:\t')
        compras.remove(item)
        continue
    elif dado == '3':
        item = input('Informe o item que deseja verificar na lista:\t')
        if item in compras:
            print('O item {} está na inserido na lista de compras!'.format(item.upper()))
            continue
        else:
            print('O item {} não está na inserido na lista de compras!'.format(item.upper()))
            continue
    elif dado == '4':
        print('O primeiro item da lista é: {}'.format(compras[0].upper()))
        continue
    elif dado == '5':
        print('O ultimo item da lista é: {}'.format(compras[-1].upper()))
        continue
    elif dado == '6':
        print('Os três primeiros itens da lista são: {}, {} e {}'. format(compras[0].upper(), compras[1].upper(), compras[2].upper()))
        print('Os três ultimos itens da lista são: {}, {} e {}'.format(compras[-3].upper(), compras[-2].upper(), compras[-1].upper()))
        continue
    elif dado == '7':
        aux = []
        for temp in compras:
            aux.append(temp.upper())
        print('Os itens da lista de compras em letras maiusculas são: {}'.format(aux))
        continue
    elif dado == '8':
        aux = []
        for temp in compras:
            aux.append(temp.lower())
        print('Os itens da lista de compras em letras minusculas são:{}'.format(aux))
        continue
    elif dado == '9':
        print('Os itens cadastrados na lista são: {}'.format(compras))
        print('A lista possui {} itens!'.format(len(compras)))
        continue
    elif dado == '10':
        break    
    else:
        print('Não foi possivel identificar sua opção! Tente novamente!')