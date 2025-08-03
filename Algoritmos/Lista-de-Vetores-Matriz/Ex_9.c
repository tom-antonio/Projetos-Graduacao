#include <stdio.h>
#define MAX 5

int main(){
	
	int V[MAX], Y[MAX], i;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]: ", i);
		scanf("%d", &V[i]);
	}
	
	printf("\nOs valores pares sao: \n");
	for(i=0; i<MAX; i++){
		if(V[i]%2==0){
			printf("%d  ", V[i]);
		}
	}
return 0;
}
