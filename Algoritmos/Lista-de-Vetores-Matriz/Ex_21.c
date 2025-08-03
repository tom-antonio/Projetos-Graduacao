#include <stdio.h>
#define MAX 10

int main (){
	
	int V[MAX], i, j, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	printf("\nO vetor informado eh: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	for(j=0; j<MAX-1; j++){
		for(i=0; i<MAX-1; i++){
			if(V[i]>V[i+1]){
				cont = V[i];
				V[i] = V[i+1];
				V[i+1] = cont;
			}
		}
		cont = 0;
	}
	printf("\nOs tres menores numeros eh:\n");
	for(i=0; i<3; i++){
		printf("%d  ", V[i]);
	}
return 0;
}
