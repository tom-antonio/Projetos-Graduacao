#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int main(){
	
	int V[MAX], i, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	
	for(i=0; i<MAX; i++){
		if(V[i]%2 == 0){
			cont++;
		}
	}
	
	printf("\nO vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	printf("\nO vetor informado possui %d numeros pares!", cont);

return 0;
}
