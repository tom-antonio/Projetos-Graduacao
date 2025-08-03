#include <stdio.h>
#define MAX 10

int main (){
	
	int P[MAX], V[MAX], i, cont;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de P[%d]: ", i);
		fflush(stdin);
		scanf("%c", &P[i]);
	}
	printf("\nAgora sera a leitura do segundo vetor!\n");
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de V[%d]: ", i);
		fflush(stdin);
		scanf("%c", &V[i]);
	}
	printf("\nO primeiro vetor informado eh:\n");
	for(i=0; i<MAX; i++){
		printf("%c  ", P[i]);
	}
	printf("\n");
	printf("\nO segundo vetor informado eh:\n");
	for(i=0; i<MAX; i++){
		printf("%c  ", V[i]);
	}
	printf("\n");
	for(i=0; i<MAX; i++){
		cont = P[i];
		P[i] = V[MAX-i-1];
		V[MAX-i-1] = cont;
	}
	printf("\nAgora vamos mostrar o vetor alterado\n");
	printf("\nO primeiro vetor eh:\n");
	for(i=0; i<MAX; i++){
		printf("%c  ", P[i]);
	}
	printf("\nO segundo vetor eh:\n");
	for(i=0; i<MAX; i++){
		printf("%c  ", V[i]);
	}
return 0;
}
