# Objetivo: Desenvolver um sistema interativo em Python para gerenciar uma lista de tarefas pessoais. Você aplicará seus conhecimentos sobre estruturas de dados como listas e dicionários para armazenar e manipular as informações das tarefas, além de praticar a criação de uma interface de usuário baseada em menus no console.

# Requisitos da Tarefa: Cada tarefa em seu sistema deverá conter as seguintes informações:

# Identificador (ID): Um número único para cada tarefa, facilitando sua seleção e manipulação. Você pode pensar em como gerar esse ID automaticamente.
# Descrição: Um texto que detalha o que precisa ser feito.

# Status: Indicação se a tarefa está "Pendente" ou "Concluída". Novas tarefas devem ser criadas com o status "Pendente" por padrão.
# Funcionalidades do Sistema:


# Seu programa deverá apresentar um menu principal ao usuário, permitindo que ele escolha entre as seguintes ações:

# Adicionar Nova Tarefa:
# O sistema deve solicitar ao usuário a descrição da nova tarefa.
# Um ID único deve ser atribuído, e a tarefa deve ser armazenada com o status inicial "Pendente".

# Listar Todas as Tarefas:
# Exibir todas as tarefas cadastradas, mostrando claramente o ID, a descrição e o status de cada uma.
# Se não houver tarefas, uma mensagem apropriada deve ser mostrada.

# Marcar Tarefa como Concluída:
# O sistema deve permitir que o usuário identifique qual tarefa deseja marcar como concluída (provavelmente utilizando o ID da tarefa).
# Ao selecionar uma tarefa, seu status deve ser alterado de "Pendente" para "Concluída".
# Considere o que acontece se o usuário tentar marcar uma tarefa que não existe ou que já está concluída.}

# Sair:
# Uma opção para encerrar a execução do programa.

def exibir_menu():
    print("\nMenu de Tarefas")
    print("1 - Adicionar nova tarefa;")
    print("2 - Listar todas as tarefas;")
    print("3 - Marcar tarefa como concluída")
    print("0 - Sair do programa")
    return input("Escolha uma opção:\t")

def criar_tarefa(descricao):
    codigo = len(tarefas) + 1
    tarefa = {'codigo': codigo, 'descricao': descricao, 'status': 'pendente'}
    tarefas.append(tarefa)
    return tarefa

tarefa = None

while True:
    opcao = exibir_menu()
    if opcao == "1":
        print("Opção 1 selecionada: Adicionar nova tarefa")
        descricao = input("Informe a descrição da tarefa:\t")
        if 'tarefas' not in globals():
            tarefas = []
        tarefa = criar_tarefa(descricao)
        print(f"Tarefa adicionada: {tarefa['codigo']} - {tarefa['descricao']} (Status: {tarefa['status']})")

    elif opcao == "2":
        print("Opção 2 selecionada: Listar todas as tarefas")
        if 'tarefas' in globals() and tarefas:
            for tarefa in tarefas:
                print(f"Código: {tarefa['codigo']}, Descrição: {tarefa['descricao']}, Status: {tarefa['status']}")
        else:
            print("Nenhuma tarefa cadastrada.")
    elif opcao == "3":
        print("Opção 3 selecionada: Marcar tarefa como concluída")
        codigo = int(input("Informe o código da tarefa a ser marcada como concluída:\t"))
        if 'tarefas' in globals() and tarefas:
            tarefa_encontrada = next((t for t in tarefas if t['codigo'] == codigo), None)
            if tarefa_encontrada:
                tarefa_encontrada['status'] = 'concluída'
                print(f"Tarefa {codigo} marcada como concluída.")
            else:
                print(f"Tarefa com código {codigo} não encontrada.")
        else:
            print("Nenhuma tarefa cadastrada.")
    elif opcao == "0":
        print("Saindo do programa.Volte sempre!")
        break
    else:
        print("Opção inválida, tente novamente.")