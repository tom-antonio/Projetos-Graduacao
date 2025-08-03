# Sistema de Verificação de Acesso ao Prédio

# Objetivo:
# Criar um programa que simule a verificação de acesso a um prédio. O sistema deve solicitar informações do usuário e, com base nessas informações, decidir se o acesso será liberado ou negado.

# Requisitos:
# Utilizar laços de repetição para continuar verificando até o usuário digitar "sair".
# Utilizar if, elif, else para tratar diferentes situações.
# Utilizar variáveis para armazenar os dados.
# Utilizar entrada e saída de dados com input() e print().
# Utilizar operadores lógicos and e or.

# Descrição do Programa:
# O programa pergunta o nome da pessoa, se ela é morador, visitante ou prestador de serviço, e o horário atual (em formato de 0 a 23, por exemplo, 15 para 15h).
# Com base nas respostas, o programa decide se o acesso é permitido, de acordo com as seguintes regras:

# Moradores podem entrar a qualquer hora.
# Visitantes só podem entrar entre 8h e 22h.
# Prestadores de serviço só podem entrar entre 8h e 18h.

# Se o nome for "sair", o programa encerra.

# ✅ Habilidades trabalhadas:
# Compreensão e uso de estruturas de decisão (if, elif, else)
# Entrada e saída de dados
# Uso de laço while
# Operadores lógicos (and, or)

while True:
    nome = input('Informe o seu nome ou digite (sair) para encerrar o programa:\t')
    if nome == 'sair':
        break
    else:
        entrada = input('Informe o tipo de sua entrada (M - Morador, V - Visitante, P - Prestador de Serviço) Digite: M, V ou P:\t')
        horario = int(input('Informe o horário de entrada:\t'))
        if entrada == 'M':
            print('Seja Bem vindo {}!'.format(nome))
            continue
        elif entrada == 'V':
            if horario >= 8 and horario <= 22:
                print('Entrada liberada! Seja bem vindo(a) {}!'.format(nome))
                continue
            else:
                print('Entrada negada! Fora do horário permitido {}!'.format(nome))
                continue
        else:
            if horario >= 8 and horario <= 18:
                print('Entrada liberada! Seja bem vindo(a) {}!'.format(nome))
                continue
            else:
                print('Entrada negada! Fora do horário permitido {}!'.format(nome))