#include<stdio.h>
#include<stdlib.h>
#define MAX 13

int main(){
	
	int V[MAX], Y[MAX], i, j, num, cont=0;
	
	for(i=0; i<MAX; i++){
		printf("\n Informe o valor do %d gabarito:  ", i+1);
		scanf("%d", &V[i]);
	}
	
	printf("\n Informe o numero de apostadores: ");
	scanf("%d", &num);
	
	for(j=0; j<num; j++){
		for(i=0; i<MAX; i++){
			printf("\n Informe o valor do %d numero do %d apostador:", i+1, j+1);
			scanf("%d", &Y[i]);
			
			if(V[i] == Y[i]){
				cont++;
			}
		}
		if(cont == MAX){
			printf("\nVoce eh o grande GANHADOR!\n");
		}else{
			printf("\nPuxa, nao foi desta vez, mas nao desanime, continue tentando!\n");
		}
		cont=0;
	}
return 0;
}
