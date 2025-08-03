# Exercício – Simulação de Inscrição em Evento Online (Front-End / Back-End)

# Objetivo:
# Simular a inscrição de um usuário em um evento online, com validações feitas no back-end e envio de resposta apropriada.

# Dados do formulário (a serem enviados do front-end):
# Cada usuário deve preencher:
# nome (mínimo 3 letras)
# email (deve conter @ e terminar com .com)
# idade (deve ser ≥ 16)
# interesse (ex: "Programação", "Design", "Marketing")

# Tarefas do Aluno
# Parte 1 – FRONT-END
# Criar um dicionário com os dados do usuário.
# Serializar com json.dumps() e enviar ao back-end.

# Parte 2 – BACK-END
# Desserializar o JSON recebido.
# Aplicar as seguintes regras de negócio:
# O nome deve ter pelo menos 3 caracteres.
# O email deve conter "@" e terminar com ".com".
# A idade deve ser 16 anos ou mais.
# O interesse deve estar entre as opções aceitas: "Programação", "Design", "Marketing".
# Armazenar todos os cadastros válidos em uma lista chamada banco_de_dados.

# Se tudo estiver correto, retornar:
# {
# "status": "sucesso",
# "mensagem": "Inscrição realizada com sucesso!"
# }


# Se houver erro, retornar:
# {
# "status": "erro",
# "mensagem": "Erro: idade mínima não atingida."
# }

# Parte 3 – FRONT-END
# Exibir a resposta do servidor ao usuário.

# Exemplo de fluxo:
# Entrada válida:
# {
# "nome": "Carla",
# "email": "carla@email.com",
# "idade": 22,
# "interesse": "Design"
# }
# Resposta:
# {
# "status": "sucesso",
# "mensagem": "Inscrição realizada com sucesso!"
# }

############################## BIBLIOTECAS ####################################
import json

############################## FRONT-END ####################################
dado = int(input("Informe quantos alunos deseja cadastrar:\t"))
alunos = []
for i in range(dado):
    nome = input("Informe o nome do usuário:\t")
    email = input("Informe o email do usuário:\t")
    idade = input("Informe a idade do usuário:\t")
    interesse = input("Informe o interesse do usuário (Programação, Design, Marketing):\t")
    alunos.append({"nome" : nome, "email" : email, "idade" : idade, "interesse" : interesse})

alunos_str = json.dumps(alunos)

############################## BACK-END ####################################
alunos_dict = json.loads(alunos_str)
banco_de_dados = []

def verifica_email(email):
    return email.lower().endswith(".com")

def verifica_interesse(interesse):
    return interesse.lower() in ['programação', 'design', 'marketing']
    
for aluno in alunos_dict:
    nome_cond = len(aluno["nome"]) >= 3
    arroba_cond = '@' in aluno["email"]
    idade_cond = int(aluno["idade"]) >= 16
    email_cond = verifica_email(aluno["email"])
    interesse_cond = verifica_interesse(aluno["interesse"])

    if nome_cond and arroba_cond and email_cond and idade_cond and interesse_cond:
        aluno["status"] = "Sucesso"
        aluno["mensagem"] = "Inscrição realizada com sucesso!"
    else:
        aluno["status"] = "Erro"
        aluno["mensagem"] = "Erro: idade mínima não atingida, nome, email ou interesse em discordância."

    banco_de_dados.append(aluno)
    
alunos_verf = json.dumps(banco_de_dados)

############################## FRONT-END ####################################
alunos_insc = json.loads(alunos_verf)

for aluno in alunos_insc:
    print(f"""
Nome: {aluno["nome"]}
Email: {aluno["email"]}
Idade: {aluno["idade"]}
Interesse: {aluno["interesse"]}
Situação:
Status: {aluno["status"]}
Mensagem: {aluno["mensagem"]}
""")
    print("\n")