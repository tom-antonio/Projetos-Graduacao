#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int main(){
	
	int V[MAX], i, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%i]:  ", i);
		scanf("%i", &V[i]);
	}
	
	printf("\nO vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%i ", V[i]);
	}
	
	for(i=0;i<MAX/2;i++){
		cont = V[i];
		V[i] = V[MAX-i-1];
		V[MAX-i-1] = cont;
	}
	printf("\n O vetor resultante eh: \n");
	for(i=0; i<MAX; i++){
		printf("%i ", V[i]);
	}
//O resultado final está com um zero na resposta. Por quê?
return 0;
}
