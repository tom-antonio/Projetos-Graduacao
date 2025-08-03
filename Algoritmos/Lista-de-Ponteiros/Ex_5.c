#include<stdio.h>
#define MAX 5

int main (){
	
	int V[MAX], i;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o %i valor:\t", i+1);
		scanf("%i", &V[i]);
	}
	printf("\nOs valores informados sao:\n");
	for(i=0; i<MAX; i++){
		printf("\t%i", V[i]);
	}
	printf("\nMostrando o endereco\n");
	for(i=0; i<MAX; i++){
		if(V[i]%2==0){
			printf("\nO valor informado eh: %i e o endereco eh: %x", V[i], &V[i]);			
		}
	}
	return 0;
}
