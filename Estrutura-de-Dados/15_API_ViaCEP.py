# Objetivo: Desenvolver uma ferramenta de linha de comando para consultar, armazenar e gerenciar endereços a partir de CEPs, aplicando os conceitos de listas, dicionários, ordenação e manipulação de arquivos.

# Enunciado:

# Você foi contratado para criar um pequeno sistema para uma equipe de logística. Eles precisam de uma ferramenta que permita registrar múltiplos endereços a partir de seus CEPs e depois realizar operações sobre os dados coletados.

# O programa deve realizar as seguintes tarefas:

# Coleta de Dados:

# O programa deve solicitar ao usuário que digite um CEP de cada vez.
# A cada CEP digitado, seu programa deve consultar a API do ViaCEP.
# O endereço completo (retornado como um dicionário pela API) deve ser armazenado em uma estrutura de dados principal (uma lista de dicionários).
# O programa deve continuar pedindo CEPs até que o usuário digite a palavra "sair".
# Exibição e Filtragem:

# Após a coleta, o programa deve apresentar um menu de opções ao usuário.
# Opção 1 - Listar Todos: Exibir na tela todos os endereços que foram coletados, de forma organizada.
# Opção 2 - Filtrar por Cidade: Pedir ao usuário o nome de uma cidade e exibir apenas os endereços que pertencem àquela cidade. Se nenhuma cidade for encontrada, informe o usuário.
# Ordenação:

# Opção 3 - Listar por Ordem Alfabética de Rua: Exibir todos os endereços coletados, mas ordenados em ordem alfabética crescente pelo nome da rua (logradouro).
# Exportação de Dados:

# Opção 4 - Salvar Relatório: O programa deve pegar a lista de endereços atualmente exibida (seja a lista completa, a filtrada ou a ordenada) e salvá-la em um arquivo chamado relatorio_enderecos.json.

import requests
import json

enderecos = []

print("\n--- COLETA DE CEPs ---")
while True:
    cep = input("Digite o CEP (ou 'sair' para encerrar): ").strip().lower()

    if cep == 'sair':
        break

    cep = cep.replace("-", "")
    if not cep.isdigit() or len(cep) != 8:
        print("CEP inválido. Digite exatamente 8 números.")
        continue

    url = f"https://viacep.com.br/ws/{cep}/json/"
    try:
        response = requests.get(url)
        response.raise_for_status()
        dados = response.json()

        if dados.get("erro"):
            print("CEP não encontrado.")
            continue

        enderecos.append(dados)
        print(f"Endereço adicionado: {dados['logradouro']}, {dados['bairro']}, {dados['localidade']} - {dados['uf']}")

    except Exception as e:
        print(f"Erro ao consultar o CEP: {e}")

# Variável para guardar a última visualização (para salvar corretamente)
lista_visualizacao = enderecos.copy()

# Menu de opções
while True:
    print("\n--- MENU DE OPÇÕES ---")
    print("1 - Listar Todos os Endereços")
    print("2 - Filtrar por Cidade")
    print("3 - Listar por Ordem Alfabética de Rua")
    print("4 - Salvar Relatório Atual")
    print("5 - Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == '1':
        if not enderecos:
            print("Nenhum endereço coletado.")
            continue

        print("\n--- LISTA COMPLETA DE ENDEREÇOS ---")
        for d in enderecos:
            print(f"{d['logradouro']}, {d['bairro']}, {d['localidade']} - {d['uf']}")
        lista_visualizacao = enderecos.copy()

    elif opcao == '2':
        cidade = input("Digite o nome da cidade: ").strip().lower()
        filtrados = [d for d in enderecos if d['localidade'].lower() == cidade]

        if not filtrados:
            print("Nenhum endereço encontrado para esta cidade.")
        else:
            print(f"\n--- ENDEREÇOS EM {cidade.upper()} ---")
            for d in filtrados:
                print(f"{d['logradouro']}, {d['bairro']}, {d['localidade']} - {d['uf']}")
        lista_visualizacao = filtrados

    elif opcao == '3':
        ordenados = sorted(enderecos, key=lambda x: x['logradouro'])
        print("\n--- ENDEREÇOS EM ORDEM ALFABÉTICA DE RUA ---")
        for d in ordenados:
            print(f"{d['logradouro']}, {d['bairro']}, {d['localidade']} - {d['uf']}")
        lista_visualizacao = ordenados

    elif opcao == '4':
        if not lista_visualizacao:
            print("Nada para salvar. Execute uma listagem ou filtragem antes.")
        else:
            with open("relatorio_enderecos.json", "w", encoding="utf-8") as f:
                json.dump(lista_visualizacao, f, ensure_ascii=False, indent=4)
            print("Relatório salvo como 'relatorio_enderecos.json'.")

    elif opcao == '5':
        print("Encerrando o programa.")
        break

    else:
        print("Opção inválida. Tente novamente.")