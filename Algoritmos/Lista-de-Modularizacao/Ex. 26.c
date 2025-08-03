#include<stdio.h>
#define MAX 10

void vetor (int *V){
	int i, j, aux;
	
    for (i = 0; i <= MAX ; i++) {
        for (j = 0; j <= MAX-1; j++) {
            if (V[i] > V[j]) {
                aux = V[i];
                V[i] = V[j];
                V[j] = aux;
            }
        }
    }
}
	

int main (){
	int P[MAX], a;
	
	for(a=0; a<=MAX; a++){
		printf("\nInforme o P[%i]:  ", a);
		scanf("%i", &P[a]);
	}	
	vetor(&P);
	
	printf("\nO valor ordenado eh:\n");
	for(a=0; a<=MAX; a++){
		printf("\t%i", P[a]);
	}
	return 0;
}
