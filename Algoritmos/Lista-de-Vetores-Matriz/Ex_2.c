#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int main (){
	
	int V[MAX], Y[MAX], Z[MAX], i;
	
	for(i=0; i<MAX; i++){
		printf("Digite o valor do %d numero do primeiro vetor: ", i+1);
		scanf("%d", &V[i]);
	}
	
	for(i=0; i<MAX; i++){
		printf("Digite o valor do %d numero do segundo vetor: ", i+1);
		scanf("%d", &Y[i]);
	}
	
	printf("\nO primeito vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	
	printf("\n O segundo vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", Y[i]);
	}
	
	for(i=0; i<MAX; i++){
		Z[i] = V[i] * Y[i];
	}

	printf("\nO valor do vetor resultante eh:  \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", Z[i]);
	}
return 0;	
}
