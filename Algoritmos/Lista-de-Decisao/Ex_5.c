#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
	int a, b, c, delta, x1, x2;

	printf("Sabendo que uma equacao do segundo grau e representada pela forma Ax^2 + Bx + C = 0");
	printf("\nDigite o valor de A: \t");
	scanf("%d", &a);
	
	printf("\nDigite o valor de B: \t");
	scanf("%d", &b);

	printf("\nDigite o valor de C: \t");
	scanf("%d", &c);
	
	delta = b*b - 4*a*c;

	if (delta > 0){
		x1 = (-b + sqrt(delta))/2*a;
		x2 = (-b - sqrt(delta))/2*a;
		
		printf("O valor das raizes sao: %d e %d!", x1, x2);
	} else{
		if (delta == 0){
			x1 = -b/2*a;
			printf("O valor da raiz e: %d", x1);
		}
		else{
			printf("A equacao nao possui raizes reais!");
		}
	
	}
	return 0;
}
