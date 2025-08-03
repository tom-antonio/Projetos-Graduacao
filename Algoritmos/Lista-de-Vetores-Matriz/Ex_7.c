#include <stdio.h>
#include <stdlib.h>
#define MAX 30
#define CONT 5

int main(){
	
	int V[MAX], Vp[CONT], Vi[CONT], i, ip=0, ii=0;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do V[%d]:  ", i);
		scanf("%d", &V[i]);		
	}
	
	for(i=0; i<MAX; i++){
		if(V[i]%2 == 0){
			Vp[ip] = V[i];
			ip++;
			if(ip == CONT){
				printf("\nO vetor par resultante eh: \n");
				for(ip=0; ip<CONT; ip++){
				printf("%d  ", Vp[ip]);	
				}
				ip = 0;
			}
		}else{
			Vi[ii] = V[i];
			ii++;
			if(ii == CONT){
				printf("\nO vetor impar resultante eh: \n");
				for(ii=0; ii<CONT; ii++){
					printf("%d  ", Vi[ii]);			
				}
				ii = 0;	
			}
		}
	}
	
	printf("\nMostrando o restante dos vetores!\n");
	printf("\nO restante do vetor par eh:\n");
	for(i=0; i<ip; i++){
		printf("%d  ", Vp[i]);
		
	}
	printf("\nO restante do vetor impar eh:\n");
	for(i=0; i<ii; i++){
		printf("%d  ", Vi[i]);
	}
return 0;
}
