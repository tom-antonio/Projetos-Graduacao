# Crie um programa em python que receba o nome do aluno e 4 notas.
# Deve ser feita média desse aluno e verificada as seguintes condições:
# se média menor que 5,0, o aluno está reprovado
# se média maior ou igual a 6,0, aluno aprovado
# caso contrário o aluno está de recuperação

print('Cálculo de média de alunos')

nome = input('Informe o nome do aluno:\t')
n1 = float(input('Informe a primeira nota do {}:\t'.format(nome)))
n2 = float(input('Informe a segunda nota do {}:\t'.format(nome)))
n3 = float(input('Informe a terceira nota do {}:\t'.format(nome)))
n4 = float(input('Informe a quarta nota do {}:\t'.format(nome)))

media = (n1+n2+n3+n4)/4

if media >= 6:
    print('O aluno {} está aprovado com nota {}!'.format(nome, media))
elif media <= 5:
    print('O aluno {} está reprovado com nota {}!'.format(nome, media))
else:
    print('O aluno {} está de recuperação com nota {}!'.format(nome, media))