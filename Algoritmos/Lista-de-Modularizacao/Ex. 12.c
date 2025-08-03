#include<stdio.h>

void troca (int *n1, int *n2){
	
	int aux;
	
	aux = *n1;
	*n1 = *n2;
	*n2 = aux;
}

int main (){
	
	int v1, v2, num;
	
	printf("\nInforme o primeiro valor:\t");
	scanf("%i", &v1);
	printf("\nInforme o segundo valor:\t");
	scanf("%i", &v2);
	
	troca (&v1, &v2);
	
	printf("\nOs novos valores sao Valor 1 = %i, Valor 2 = %i", v1, v2);
	
	return 0;
}
