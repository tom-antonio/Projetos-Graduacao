# Programa para calcular Bhaskara
# Este programa calcula as raízes de uma equação do segundo grau
# na forma ax² + bx + c = 0, utilizando a fórmula de Bhask
import math
print('Programa para calcular Bhaskara')

a = int(input('Informe o valor de A:'))
b = int(input('Informe o valor de B:'))
c = int(input('Informe o valor de C:'))

delta = (b*b) - 4*a*c

if delta < 0:
    print('Não existe raiz com valor real')
elif delta == 0:
    x = -b/(2*a)
    print('O valor da raiz é {}'.format(x))
else:
    x1 = -b + math.sqrt(delta)/(2*a)
    x2 = -b - math.sqrt(delta)/(2*a)
    print('O valor das raizes é {} e {}'.format(x1,x2))