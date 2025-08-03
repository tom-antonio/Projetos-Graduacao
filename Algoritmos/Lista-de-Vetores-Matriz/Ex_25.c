#include<stdio.h>
#define MAX 5

int main (){
	
	int V[MAX][MAX], l, c, somal=0, somac=0, somad=0, somads=0, somat=0;

	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			printf("\nInforme o valor de V[%d][%d]: ", l,c);
			scanf("%d", &V[l][c]);
		}
	}
	printf("\nA matriz informada eh:\n");
	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			printf("%d\    ", V[l][c]);
		}
		printf("\n");
	}
	for(c=0; c<MAX; c++){
		somal = somal + V[3][c];
	}
	printf("\nA soma da linha 4 de V eh: %d", somal);
	for(l=0; l<MAX; l++){
		somac = somac + V[l][1];
	}
	printf("\nA soma da coluna 2 de V eh: %d", somac);
	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			if(l==c){
				somad = somad + V[l][c];
			}
		}
	}
	printf("\nA soma da diagonal principal eh: %d", somad);
	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			if(MAX-1-l == MAX-1-c){
				somads = somads + V[l][c];
			}
		}
	}
	printf("\nA soma da diagonal secundaria eh: %d", somads);
	for(l=0; l<MAX; l++){
		for(c=0; c<MAX; c++){
			somat = somat + V[l][c];
		}
	}
	printf("\nA soma de toda a matriz eh: %d", somat);
return 0;
}
