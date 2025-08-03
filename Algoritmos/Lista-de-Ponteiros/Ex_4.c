#include <stdio.h>
#define ML 3
#define MC 3

int main (){
	
	float M[ML][MC];
	int l, c;
	
	for(l=0; l<ML; l++){
		for(c=0; c<MC; c++){
			printf("\nInforme o valor de M[%i][%i]:\t", l,c);
			scanf("%f", &M[l][c]);
		}
	}
	printf("\nMatriz informada eh:\n");
	for(l=0; l<ML; l++){
		for(c=0; c<MC; c++){
			printf("%.2f\t", M[l][c]);
		}
		printf("\n");
	}
	printf("\nMostrando os enderecos da matriz\n");
		for(l=0; l<ML; l++){
		for(c=0; c<MC; c++){
			printf("%.2x\t", &M[l][c]);
		}
		printf("\n");
	}
}
