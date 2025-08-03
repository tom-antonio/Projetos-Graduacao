#include <stdio.h>
#include <stdlib.h>
#define MAX 15

int main(){
	
	int V[MAX], i, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d] numero:  ", i);
		scanf("%d", &V[i]);
	}
	
	for(i=0; i<MAX; i++){
		if(i%2 != 0){
			cont = V[i];
			V[i] = V[i+1];
			V[i+1] = cont;
		}
	}
	printf("\n O vetor resultante eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
return 0;
}
