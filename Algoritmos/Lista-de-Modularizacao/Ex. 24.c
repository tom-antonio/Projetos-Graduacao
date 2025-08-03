#include<stdio.h>
#include<stdlib.h>
#define MAX 3

int msec (int P[MAX][MAX]){
	
	int i, j, soma=0;
	
	for(i=0; i<MAX; i++){
		for(j=0; j<MAX; j++){
			if(i+j == MAX-1){
				soma = P[i][j] + soma;
			}
		}
	}
	return soma;
}


int main(){
	
	int l, c, M[MAX][MAX], aux;
	
	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			printf("\nInforme o valor do M[%i][%i]:\t", l, c);
			scanf("%i", &M[l][c]);
		}
	}
	printf("\nA matriz informada eh:\n");
	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			printf("%i\t", M[l][c]);
		}
		printf("\n");
	}
	
	aux = msec(M);
	
	printf("\nA soma da diagonal secundaria eh: %d", aux);
}
