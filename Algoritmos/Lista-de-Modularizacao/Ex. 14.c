#include<stdio.h>
#include<stdlib.h>

int baskara(int a, int b, int c, int *x, int *x1, int *x2){
	
	int delta;
	
	delta = (b*b) - 4*a*c;
	
	if(delta < 0){
		return 0;
	}else
		if(delta == 0){
			*x = -b/(2*a);
			return 1;
		}else{
			*x1 = (-b + sqrt(delta))/(2*a);
			*x2 = (-b - sqrt(delta))/(2*a);
			return 2;
		}
}

int main (){
	
	int n1, n2, n3, v0, v1, v2, aux;
	
	printf("\nInforme o valor de A:\t");
	scanf("%i", &n1);
	printf("\nInforme o valor de B:\t");
	scanf("%i", &n2);
	printf("\nInforme o valor de B:\t");
	scanf("%i", &n3);
	
	aux = baskara(n1, n2, n3, &v0, &v1, &v2);
	
	if(aux == 0){
		printf("\nNao existe raizes reais!");
	}else{
		if(aux == 1){
			printf("\nA raiz real eh: %i", v0);
		}else{
			printf("\nAs duas raizes sao: %i e %i", v1, v2);
		}
	}
	return 0;
}
