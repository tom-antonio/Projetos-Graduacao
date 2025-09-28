# Exercício Prático: Sistema de Controle de Participação em Eventos
# Objetivo
# Desenvolver um sistema de terminal interativo, utilizando conjuntos (set) e busca simples, para controlar e consultar a participação de funcionários em dois eventos de uma empresa.

# Descrição do problema
# A empresa organizou dois eventos durante a semana:
# Evento Técnico
# Evento Cultural

# Você deve criar um sistema que permita:
# Cadastrar os nomes dos funcionários que participaram de cada evento
# Consultar diferentes informações sobre a participação
# Remover participantes
# Executar todas as ações por meio de um menu interativo em loop

# Menu de opções
# Ao executar o programa, deve ser exibido o seguinte menu:

# === Menu de Consulta de Participação ===
# === Menu de Consulta de Participação ===
# 1 - Inserir participantes do Evento Técnico
# 2 - Inserir participantes do Evento Cultural
# 3 - Remover participante de um evento
# 4 - Mostrar funcionários que participaram dos DOIS eventos
# 5 - Mostrar funcionários que participaram de APENAS UM evento
# 6 - Consultar se um funcionário participou (e de quais eventos)
# 7 - Sair

# Comportamento de cada opção

# Opção 1 e 2 – Inserção de Participantes
# Perguntar quantos nomes serão inseridos
# Receber os nomes via input() um a um
# Adicionar ao conjunto correspondente (evento_tecnico, evento_cultural)

# Opção 3 – Remoção de Participante
# Perguntar de qual evento deseja remover: Técnico ou Cultural
# Perguntar o nome da pessoa
# Tentar remover do conjunto (usar discard ou remove com verificação)

# Opção 4 – Mostrar quem participou dos DOIS eventos
# Exibir interseção dos dois conjuntos

# Opção 5 – Mostrar quem participou de apenas UM evento
# Exibir diferença simétrica entre os conjuntos

# Opção 6 – Consulta individual
# Pedir o nome da pessoa
# Informar se participou:
# Dos dois eventos
# Apenas de um (e qual)
# De nenhum

# Opção 7 – Sair
# Finaliza o loop e encerra o programa

# Critérios de avaliação
# Uso correto de conjuntos (set) e operações (&, ^, |, -)
# Estrutura do menu com while True e controle de saída
# Uso adequado de input, print, if, elif, else
# Organização e clareza no código
# Boas práticas de programação (identação, nomes de variáveis, etc.)

evento_tecnico = set()
evento_cultural = set()
while True:
    menu = input("""=== Menu de Consulta de Participação ===
1 - Inserir participantes do Evento Técnico;
2 - Inserir participantes do Evento Cultural;
3 - Remover participante de um evento;
4 - Mostrar funcionários que participaram dos DOIS eventos;
5 - Mostrar funcionários que participaram de APENAS UM evento;
6 - Consultar se um funcionário participou (e de quais eventos);
7 - Sair;
Informe a opção desejada:\t""")
    
    if menu == '1':
        quant = input("Informe a quantidade de participantes que deseja inserir:\t")
        for i in range(int(quant)):
            nome = input(f'Informe o nome do {i+1} participante:\t')
            nome = nome.lower()
            evento_tecnico.add(nome)
            print('Participante cadastrado com sucesso!')
    elif menu == '2':
        quant = input("Informe a quantidade de participantes que deseja inserir:\t")
        for i in range(int(quant)):
            nome = input(f'Informe o nome do {i+1} participante:\t')
            nome = nome.lower()
            evento_cultural.add(nome)
            print('Participante cadastrado com sucesso!')
    elif menu == '3':
        dado = input('Informe qual evento deseja remover (Técnico ou Cultural):\t')
        dado = dado.lower()
        if dado == 'cultural':
            nome = input("Informe o nome do participante que deseja remover:\t")
            nome = nome.lower()
            evento_cultural.discard(nome)
        else:
            nome = input("Informe o nome do participante que deseja remover:\t")
            evento_tecnico.discard(nome)
    elif menu == '4':
        intersecao = evento_tecnico & evento_cultural
        print(intersecao)
    elif menu == '5':
        simetrica = evento_tecnico ^ evento_cultural
        print(simetrica)
    elif menu == '6':
        nome = input('Informe o nome do participante que deseja pesquisar:\t')
        nome = nome.lower()
        if nome in evento_tecnico and nome in evento_cultural:
            print(f'O participante {nome} se encontra nos dois eventos!')
        elif nome in evento_tecnico:
            print(f'O participante {nome} se encontra apenas no evento Técnico!')
        elif nome in evento_cultural:
            print(f'O participante {nome} se encontra apenas no evento Cultural!')
        else:
            print("O nome informado não está inscrito em nenhum dos eventos!")
    elif menu == '7':
        print("Programa encerrado com sucesso!")
        break
    else:
        print('Opção não encontrada! Tente Novamente!')