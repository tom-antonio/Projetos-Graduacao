# Objetivo: Criar uma "Pokédex" interativa que consome dados da PokéAPI, demonstrando a habilidade de navegar e extrair informações de uma estrutura JSON mais complexa, que inclui listas e dicionários aninhados.

# Enunciado:

# Todo Treinador Pokémon precisa de uma Pokédex! Sua missão é criar uma versão de linha de comando que permita ao usuário buscar informações sobre qualquer Pokémon.

# Seu programa será dividido em duas partes principais:

# Parte 1: Perfil do Pokémon

# O programa deve pedir ao usuário para digitar o nome (ou número) de um Pokémon em letras minúsculas (ex: pikachu, charizard ou 25).
# Utilizando o nome/número fornecido, o programa deve fazer uma requisição à PokéAPI.
# Se o Pokémon for encontrado, o programa deve exibir um "perfil" claro e organizado contendo as seguintes informações, extraídas do JSON retornado:
# Nome: O nome oficial do Pokémon.
# Número da Pokédex: O ID do Pokémon.
# Tipos: Listar todos os tipos do Pokémon (ex: electric, fire / flying).
# Lista de Habilidades: Listar o nome de todas as habilidades (abilities) que o Pokémon pode ter.
# Peso: O peso do Pokémon (a API retorna em hectogramas, você pode exibir o valor direto ou converter para quilogramas).
# Parte 2: Desafio - O Comparador de Batalha

# Implemente uma nova funcionalidade no seu programa:

# O programa deve pedir ao usuário o nome de dois Pokémon.
# Para cada um, ele deve buscar as informações na API.
# Ao final, deve exibir uma tela de "Comparação de Atributos", mostrando lado a lado as seguintes informações de cada um dos dois Pokémon:
# Nome
# Tipo(s)
# Peso
# Altura
# Com base nos dados, o programa deve declarar qual dos dois Pokémon é mais pesado.
# Critérios de Avaliação:

# O programa busca e exibe corretamente o perfil de um Pokémon.
# O código consegue navegar na estrutura JSON para extrair informações que estão dentro de listas e outros dicionários (como tipos e habilidades).
# A função de comparação busca os dados dos dois Pokémon e exibe o resultado corretamente.
# O programa informa o usuário de forma amigável caso um Pokémon não seja encontrado.

import requests

def buscar_pokemon(nome_pokemon):
    """
    Função que busca um Pokémon na PokéAPI e exibe suas informações básicas.
    """
    url = f"https://pokeapi.co/api/v2/pokemon/{nome_pokemon.lower()}"

    print(f"\nBuscando dados para '{nome_pokemon}'...")

    try:
        response = requests.get(url)
        response.raise_for_status()
        dados = response.json()

        print("\n--- Perfil do Pokémon ---")
        print(f"Nome: {dados['name'].capitalize()}")
        print(f"Nº na Pokédex: {dados['id']}")

        print("Tipo(s):")
        for item in dados['types']:
            nome_do_tipo = item['type']['name']
            print(f"- {nome_do_tipo.capitalize()}")
        
        print("Habilidades:")
        for habilidade in dados['abilities']:
            nome_habilidade = habilidade['ability']['name']
            print(f"- {nome_habilidade.capitalize()}")

        peso = dados['weight'] / 10
        print(f"Peso: {peso} kg")
        return dados

    except requests.exceptions.HTTPError as err:
        if err.response.status_code == 404:
            print(f"Erro: Pokémon '{nome_pokemon}' não encontrado! Verifique o nome e tente novamente.")
        else:
            print(f"Erro HTTP: {err}")
    except requests.exceptions.RequestException as err:
        print(f"Ocorreu um erro de conexão: {err}")


def comparar_pokemon(pokemon1, pokemon2, nome1, nome2):
    peso1 = pokemon1['weight'] / 10
    peso2 = pokemon2['weight'] / 10
    tipo1 = ', '.join([tipo['type']['name'].capitalize() for tipo in pokemon1['types']])
    tipo2 = ', '.join([tipo['type']['name'].capitalize() for tipo in pokemon2['types']])
    altura1 = pokemon1['height'] / 10
    altura2 = pokemon2['height'] / 10

    print("\n--- Comparação de Atributos ---")
    print(f"\n{nome1} vs {nome2}")
    print(f"Peso: {peso1} kg vs {peso2} kg")
    print(f"Tipo(s): {tipo1} vs {tipo2}")
    print(f"Altura: {altura1} m vs {altura2} m")
    

# --- Início do Programa ---
if __name__ == "__main__":
    while True:
        print("\n")
        print("Menu:")
        print("1. Buscar Pokémon")
        print("2. Comparar Pokémon")
        print("3. Sair")
        opcao = input("Escolha uma opção (1-3): ")
        if opcao == '1':
            pokemon_desejado = input("Digite o nome do Pokémon ou número dele:\t").upper()
            buscar_pokemon(pokemon_desejado)
        elif opcao == '2':
            pokemon_desejado = input("\nDigite o nome ou número do primeiro Pokémon:\t").upper()
            pokemon1 = buscar_pokemon(pokemon_desejado)
            pokemon_desejado2 = input("\nDigite o nome ou número do segundo Pokémon:\t").upper()
            pokemon2 = buscar_pokemon(pokemon_desejado2)
            if pokemon1 and pokemon2:
                comparar_pokemon(pokemon1, pokemon2, pokemon_desejado, pokemon_desejado2)
        elif opcao == '3':
            print("Saindo do programa!")
            break
        else:
            print("Opção inválida! Tente novamente.")