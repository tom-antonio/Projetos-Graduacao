#include <stdio.h>
#include <stdlib.h>
#define MAX 15

int main(){
	
	int K[MAX], i, P[MAX], j, cont=0, ip=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor de K[%d] maior do que 2: ", i);
		scanf("%d", &K[i]);
		if(K[i]<3){
			while(K[i]<3){
				printf("\nInforme um valor positivo!");
				printf("\nInforme o valor de K[%d] maior do que 2: ", i);				
				scanf("%d", &K[i]);	
			}
		}
	}
	for(j=0; j<MAX; j++){
		for(i=2; i<K[j]; i++){
			if(K[j]%i==0){
				cont++;
				}
			}
			if(cont==0){
				P[ip] = K[j];
				ip++;
		}
		cont=0;
	}
	printf("\nO vetor P com os numeros primos eh: \n");
	for(i=0; i<ip; i++){
		printf("%d  ", P[i]);
	}
return 0;
}
