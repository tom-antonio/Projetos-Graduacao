#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int main(){
	
	int V[MAX], i, temp, cont;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]:  ", i);
		scanf("%d", &V[i]);
	}
	
	printf("\nO vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	
	printf("\n");
	for(temp=0; temp<MAX-1; temp++){
		for(i=0; i<MAX-1; i++){
			if(V[i]>V[i+1]){
				cont = V[i];
				V[i] = V[i+1];
				V[i+1] = cont;
			}	
		}
	}
	
	printf("\nO vetor ordenado em forma crescente eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
}
