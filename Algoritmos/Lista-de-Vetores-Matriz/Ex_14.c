#include <stdio.h>
#define MAX 10

int main(){
	
	int X[MAX], Y[MAX], Z[MAX], i;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de X[%d]:  ", i);
		scanf("%d", &X[i]);
	}
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de Y[%d]:  ", i);
		scanf("%d", &Y[i]);
	}
	printf("\n");
	printf("\nValores informados para o vetor X: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", X[i]);
	}
	printf("\n");
	printf("\nValores informados para o vetor Y: \n");
	for(i=0; i<MAX; i++){
		printf("%d  ", Y[i]);
	}
	printf("\n");
	printf("\nA diferenca entre ambos os vetores eh: \n");
	for(i=0; i<MAX; i++){
		Z[i] = X[i] - Y[i];
		printf("%d  ", Z[i]);
	}
	printf("\n");
	printf("\nA soma enre ambos os vetores eh: \n");
	for(i=0; i<MAX; i++){
		Z[i] = X[i] + Y[i];
		printf("%d  ", Z[i]);
	}
	printf("\n");
	printf("\nO produto entre ambos os vetores eh: \n");
	for(i=0; i<MAX; i++){
		Z[i] = X[i] * Y[i];
		printf("%d  ", Z[i]);
	}
return 0;
}
