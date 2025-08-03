#include<stdio.h>
#define MAX 10

int main (){
	
	int V[MAX], i, j, aux=0;
	float P[MAX];
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de V[%i]: ", i);
		scanf("%i", &V[i]);
			
		if(i==0){
			aux = V[i];
		}
		if(V[i]>aux){
			aux = V[i];
		}
	}
	printf("\nMostrando o vetor informado:\n");
	for(i=0; i<MAX; i++){
		printf("%i  ", V[i]);
	}

	for(i=0; i<MAX; i++){
		P[i] = (float)V[i]/(float)aux;
	}
	printf("\nMostrando o vetor alterado:\n");
	for(i=0; i<MAX; i++){
		printf("%.4f  ", P[i]);
	}
return 0;
}
