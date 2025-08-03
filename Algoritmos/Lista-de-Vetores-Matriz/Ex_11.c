#include <stdio.h>
#include <stdlib.h>
#include<string.h>
#include<math.h>
#define MAX 11
#define CONT 5

int main(){
	
	char V[MAX], P[MAX];
	int i, j, cont=0;
	float aux;

	for(i=0; i<MAX; i++){
		printf("\n Informe o %d resultado correto do gabarito:  ", i+1);
		fflush(stdin);
		scanf("%c", &V[i]);
	}
	printf("\n");
	
	for(j=0; j<CONT; j++){
		for(i=0; i<MAX; i++){
			printf("\n Informe a %d resposta do %d aluno:  ", i+1, j+1);
			fflush(stdin);
			scanf("%c", &P[i]);
			
			if(V[i] == P[i]){
				cont++;
			}
		}
			printf("\n");
			aux = (float)cont/(float)MAX;
			
			if(cont >= 6){
				printf("\nO aluno acertou %d e esta APROVADO na disciplina com nota %.2f !", cont, aux*10);
			}else{
				printf("\nO aluno acertou %d e esta REPROVADO na disciplina com nota %.2f !", cont, aux*10);
			}
			printf("\n");
			cont=0;
	}
return 0;
}
