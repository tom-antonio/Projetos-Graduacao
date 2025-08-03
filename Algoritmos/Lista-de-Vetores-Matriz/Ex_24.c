#include <stdio.h>
#define MAX 10

int main (){
	
	int V[MAX], P[MAX], aux=1, cont, i, j;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de V[%d]: ", i);
		scanf("%d", &V[i]);
		
		if(V[i]<1){
			P[i] = V[i];
		}else{
			for(j=1; j<=V[i]; j++){
				aux = aux * j;
			}
			P[i] = aux;
			aux = 1;
		}
	}
	printf("\nMostrando o vetor informado:\n");
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	printf("\nMostrando o vetor alterado:\n");
	for(i=0; i<MAX; i++){
		printf("%d  ", P[i]);
	}
return 0;
}
