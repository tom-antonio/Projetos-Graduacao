# Objetivo:
# Praticar o uso de dicionários, listas, entrada de dados, estrutura de decisão e laços de repetição em Python, simulando um sistema de administração de produtos para um e-commerce.

# Contexto:
# Você foi contratado para criar a área administrativa de um sistema de e-commerce. Nessa área, os administradores poderão listar, cadastrar, alterar e excluir produtos que aparecem no site.

# Cada produto deve conter as seguintes informações:

# Código (único)
# Nome
# Descrição
# Valor

# Exemplo de produto:

# {
# "codigo": 1,
# "nome": "Notebook Dell",
# "descricao": "Notebook Dell com processador Intel i7, 8GB RAM, 512GB SSD",
# "valor": 1999.00
# }

# Menu de opções:

# 1 - Listar Produtos
# 2 - Cadastrar Produto
# 3 - Alterar Produto
# 4 - Excluir Produto
# 5 - Sair do Programa


# Funcionalidades:

# 1 - Listar Produtos
# Exibir todos os produtos cadastrados, com todos os seus dados.
# Se não houver produtos, exibir uma mensagem informando.

# 2 - Cadastrar Produto
# Solicitar os dados do novo produto: código, nome, descrição e valor.
# Verificar se o código já está em uso. Se estiver, exibir mensagem de erro.
# Adicionar o produto ao sistema usando um dicionário.

# 3 - Alterar Produto
# Solicitar o código do produto.
# Se existir, permitir a alteração de nome, descrição e valor.
# Caso contrário, exibir mensagem de produto não encontrado.

# 4 - Excluir Produto
# Solicitar o código do produto.
# Se encontrado, remover o produto do sistema.
# Caso contrário, exibir mensagem de erro.

# 5 - Sair do Programa
# Encerrar o sistema.

produto = {}
while True:
    dado = input("""Sistema de cadastro de produtos para E-commerce!
Escolha a opção desejada:
1 - Listar Produtos
2 - Cadastrar Produto
3 - Alterar Produto
4 - Excluir Produto
5 - Sair do Programa
Informe a opção desejada:\t""")
    if dado == '1':
            if produto:
                for cod, detalhes in produto.items():
                    print('Código do produto = {}, Nome = {}, Descrição = {} e valor = {}'.format(cod, detalhes['nome'], detalhes['descrição'], detalhes['valor']))
                    continue
            else:
                print("Nenhum produto cadastrado!")
                continue
    elif dado == '2':
        cod = input('Informe o código do produto:\t')
        if cod in produto:
            print('Código já existente! Tente novamente!')
        else:
            nome = input('Informe o nome do produto:\t')
            descrição = input('Informe a descrição do produto:\t')
            valor = input('Informe o valor do produto:\t')
            produto[cod] = {'nome': nome, 'descrição': descrição, 'valor': valor}
            print(f'Produto {nome} cadastrado com sucesso!')
        continue
    elif dado == '3':
        cod = input('Informe o código do produto que deseja alterar:\t')
        if cod in produto:
            nome = input('Informe o novo nome do produto:\t')
            descrição = input('Informe a nova descrição do produto:\t')
            valor = input('Informe o novo valor do produto:\t')
            produto[cod] = {'nome': nome, 'descrição': descrição, 'valor': valor}
            print(f'Produto {nome} alterado com sucesso!')
            continue
        else:
            print('Código não encontrado! Tente novamente!')
            continue
    elif dado == '4':
        cod = input('Informe o código do produto que deseja excluir:\t')
        if cod in produto:
            del produto[cod]
            print('Produto excluído com sucesso!')
            continue
        else:
            print('Código não encontrado! Tente novamente!')
            continue 
    elif dado == '5':
        escolha = input('Confirma a saída do programa (Sim ou Não)?\t')
        if escolha.lower() == 'sim':
            print('Programa encerrado com sucesso!')
            break
        else:
            print('Retornando ao menu inicial!')
            continue
    else:
        print('Opção não identificada! Tente novamente!')