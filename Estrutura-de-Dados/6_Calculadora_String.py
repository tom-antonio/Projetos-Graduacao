# Atividade – Calculadora de Expressões com Strings
# Objetivo:
# Praticar manipulação de strings, fatiamento, conversão de tipos e lógica condicional.

# Enunciado:
# Crie um programa em Python que leia do usuário uma ou mais expressões matemáticas simples em formato de string e exiba o resultado de cada operação.

# Exemplos de entrada válidos:

# "5+5"
# "2*31"
# "52-12"
# "42/2"

# O programa deve funcionar também para múltiplas expressões separadas por vírgula, como:
# "5+5, 20-3, 10*4, 30/5"

# Regras:
# - Cada expressão conterá:
# - Dois números inteiros
# - Um único operador entre os seguintes: +, -, *, /

# O programa deve:
# - Identificar o operador
# - Separar os números
# - Executar a operação
# - Exibir a expressão com o resultado (ex: 5 + 5 = 10)
# - O programa deve ignorar espaços em branco
# - Não utilize a função eval()

# Dicas úteis:
# - Use str.replace() para remover espaços
# - Use fatiamento ou for com if para localizar o operador
# - Use int() ou float() para converter as partes da string
# - Use .split(',') para lidar com várias expressões

# Exemplo de saída esperada:

# Entrada: "10+5, 20 - 3, 8*3, 16 /2"
# Saída:
# 10 + 5 = 15
# 20 - 3 = 17
# 8 * 3 = 24
# 16 / 2 = 8.0

while True:  
    dado = input('Informe a expressão que deseja calcular ou zero para sair:\t')
    dado = dado.replace(' ', '')
    if dado == '0':
        print('Programa encerrado com sucesso!')
        break   
    else:    
        if '+' in dado:
            array = dado.split('+')
            soma = int(array[0]) + int(array[1])
            print('{} + {} = {}'.format(array[0], array[1], soma))
            continue
        elif '-' in dado:
            array = dado.split('-')
            sub = int(array[0]) - int(array[1])
            print('{} - {} = {}'.format(array[0], array[1], sub))
            continue
        elif '*' in dado:
            array = dado.split('*')
            mult = int(array[0]) * int(array[1])
            print('{} * {} = {}'.format(array[0], array[1], mult))
            continue
        else:
            array = dado.split('/')
            if array[1] == '0':
                print('Não é possível fazer divisões por zero! Tente novamente!')
                continue
            else:
                div = float(array[0]) / float(array[1])
                print('{} / {} = {}'.format(array[0], array[1], div))
                continue