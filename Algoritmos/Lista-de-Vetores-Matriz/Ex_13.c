#include<stdio.h>
#define MAX 10
#define NUM 20

int main(){
	
	int V[MAX], P[MAX], S[NUM], i, j, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de V[%d]:  ", i);
		scanf("%d", &V[i]);
	}
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de P[%d]:  ", i);
		scanf("%d", &P[i]);
	}
	for(i=0; i<MAX; i++){
			S[i] = V[i];			
			S[i+10] = P[i];				
	}
	
	printf("\nO vetor resultando informado eh: \n");
	for(i=0; i<NUM; i++){
		printf(" %d  ", S[i]);
	}
	
	for(j=0; j<NUM-1; j++){
		for(i=0; i<NUM-1; i++){
			if(S[i]>S[i+1]){
			cont = S[i];
			S[i] = S[i+1];
			S[i+1] = cont;			
			}
		}
	}
	printf("\nO vetor resultante ordenado eh: \n");
	for(i=0; i<NUM; i++){
		printf("%d  ", S[i]);
	}
}
