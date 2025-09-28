# Calculadora de Bhaskara

Este projeto é um programa simples em Python que calcula as raízes de uma equação do segundo grau na forma $ax^2 + bx + c = 0$, utilizando a fórmula de Bhaskara.

## Como funciona

1. O programa solicita ao usuário os coeficientes $a$, $b$ e $c$.
2. Calcula o discriminante ($\Delta = b^2 - 4ac$).
3. Dependendo do valor de $\Delta$:
   - Se $\Delta < 0$: informa que não existem raízes reais.
   - Se $\Delta = 0$: calcula e exibe a única raiz real.
   - Se $\Delta > 0$: calcula e exibe as duas raízes reais.

## Como executar

No terminal, navegue até a pasta do projeto e execute:

```sh
python3 2_Bhaskara.py
```

## Exemplo de uso

```
Programa para calcular Bhaskara
Informe o valor de A:1
Informe o valor de B:-3
Informe o valor de C:2
O valor das raizes é 2.0 e 1.0
```

## Autor

Projeto desenvolvido para fins didáticos na disciplina de Estrutura de Dados.