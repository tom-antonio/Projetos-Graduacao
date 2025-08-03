#include <stdio.h>
#include <stdlib.h>
#define MAX 30

int main (){
	
	int V[MAX], Y[MAX], i;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%i]: ", i);
		scanf("%d", &V[i]);
	}
	printf("\nO vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	printf("\nO vetor resultate eh: \n");
	for(i=0; i<MAX; i++){
		Y[i] = V[i];
		if(V[i] == 0){
			Y[i] = 1;
		}
		printf("%d  ", Y[i]);
	}
return 0;	
}
