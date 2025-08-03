#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int main(){
	
	int V[MAX], i, num;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	
	printf("\nInforme o valor da constante:  ");
	scanf("%d", &num);
	
	printf("\nO vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	
	for(i=0; i<MAX; i++){
		V[i] = V[i]*num;
	}
	
	printf("\nO vetor resultante eh:\n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
return 0;
}
