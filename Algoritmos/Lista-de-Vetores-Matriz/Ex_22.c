#include <stdio.h>
#define MAX 10

int main (){
	
	int V[MAX], P[MAX], i, cont=0, aux=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%i]: ", i);
		scanf("%i", &V[i]);
	}
	printf("\nLeitura do segundo vetor!\n");
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do P[%i]: ", i);
		scanf("%i", &P[i]);
	}
	for(i=0; i<MAX; i++){
		cont = V[i] - P[MAX-i-1];
		aux = aux + cont;
	}
	printf("\nMostrando os vetores informados!\n");
	for(i=0; i<MAX; i++){
		printf("%i  ", V[i]);
	}
	printf("\n");
	for(i=0; i<MAX; i++){
		printf("%i  ", P[i]);
	}
	printf("\nO valor resultante da subtracao entre eles eh: %i \n", aux);
return 0;
}
