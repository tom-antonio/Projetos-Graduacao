#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int main(){
	
	int V[MAX], i, cont, num;
	
	for(i=0; i<MAX; i++){
		printf("Digite o valor do %d numero:\t", i+1);
		scanf("%d", &V[i]);
	}
	
	printf("\nA matriz vetor eh: \n");
	
	for(i=0; i<MAX; i++){
		printf("%d  ", V[i]);
	}
	
	cont = V[0];
	
	for(i=1; i<MAX; i++){
		if(V[i]<cont){
			cont =V[i];
			num=i;
		}
	}
	printf("\n \n O menor valor eh %d e esta na %d posicao!", cont, num+1);
	
return 0;
}
