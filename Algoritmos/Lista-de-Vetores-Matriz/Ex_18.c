#include <stdio.h>
#include <stdlib.h>
#define MAX 20

int main(){
	
	int V[MAX], i, cont, cd;
	
	printf("Iremos fazer a leitura do vetor!\n");
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	printf("\nInforme o codigo (0, 1 ou 2): ");
	scanf("%d", &cd);
	switch(cd){
		case '0':
			break;
		case '1':
			printf("\nO vetor informado eh:\n");
			for(i=0; i<MAX; i++){
				printf("%d  ", V[i]);
			}
			break;
		case '2':
			printf("\nO vetor alterado eh:\n");
			for(i=0; i<MAX/2; i++){
				cont=V[i];
				V[i] = V[MAX-i-1];
				V[MAX-i-1] = cont;
			}
			for(i=0; i<MAX; i++){
				printf("%d  ", V[i]);
			}
			break;
		default:
			printf("\nEntrada invalida! Tente novamente!\n");
	}
return 0;
}
