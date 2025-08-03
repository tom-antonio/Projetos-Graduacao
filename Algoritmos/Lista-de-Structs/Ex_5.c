#include <stdio.h>
#define MAX 2

int main (){
	
	struct vetor{
		float x;
		float y;
		float z;
	};
	typedef struct vetor Tvetor;
	
	Tvetor vet[MAX];
	int i;
	float somax=0, somay=0, somaz=0;
	
	for(i=0; i<MAX; i++){
		printf("\nLeitura do %i vetor:", i+1);
		printf("\nInforme o valor de x:\t");
		scanf("%f", &vet[i].x);
		printf("\nInforme o valor de y:\t");
		scanf("%f", &vet[i].y);
		printf("\nInforme o valor de z:\t");
		scanf("%f", &vet[i].z);
	}
	system("cls");
	
	for(i=0; i<MAX; i++){
		somax += vet[i].x;
		somay += vet[i].y;
		somaz += vet[i].z;
	}
	printf("\nA soma entre os dois vetores eh:");
	printf("\nX: %.2f  Y: %.2f  Z: %.2f", somax, somay, somaz);
return 0;
}
