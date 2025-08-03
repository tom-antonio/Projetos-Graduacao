#include <stdio.h>
#include <stdlib.h>
#define MAX 20

int main (){
	
	int V[MAX], i, j, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	printf("\nO vetor informado eh:\n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	for(j=0; j<MAX; j++){
		for(i=0; i<MAX; i++){
			if(V[j] == V[i] ){
				cont++;
			}
		}
		printf("\nO V[%d] aparece %d vezes!", j, cont);
		cont=0;
	}
return 0;
}
