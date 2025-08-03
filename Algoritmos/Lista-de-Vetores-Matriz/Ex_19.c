#include<stdio.h>
#define MAX 10

int main (){
	
	int V[MAX], P[MAX], i, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	for(i=0; i<MAX; i++){
		if(V[i]>0){
			P[cont]=V[i];
			cont++;
		}
	}
	printf("\nMostrando o vetor informado: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	printf("\nMostrando o vetor alterado: \n");
	for(i=0; i<cont; i++){
		printf("%d  ", P[i]);
	}
return 0;
}
