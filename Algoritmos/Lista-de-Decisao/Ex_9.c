#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 4
#define FALT 72
#define MED 60

int main (){
	
	int i, nota[MAX], falta, cont=0, freq;
	float media;
	char nome[20];
	
	printf("Digite o nome do aluno: \t");
	scanf("%s", &nome);
	
	for(i=0; i<MAX; i++){
		printf("Digite a %d nota do aluno: \t", i+1);
		scanf("%d", &nota[i]);
		
		cont = cont + nota[i];
	}
	
	printf("Digite o numero de faltas do aluno: \t");
	scanf("%d", &falta);
	
	media = cont / MAX;
	
	freq = 100 - (falta * 100) / FALT;
	
	system("cls");
	
	printf("A situacao do aluno %s e: \n", nome);
	
	if (freq >= 75){	
		if (media >= MED){
			printf("O aluno se encontra APROVADO por media!");
			printf("\nA media do aluno e: %.2f e a sua frequencia e: %d %%", media, freq);			
		}else{
			printf("O aluno se encontra REPROVADO por media!");
			printf("\nA media do aluno e: %.2f e a sua frequencia e: %d %%", media, freq);	
		}	
	}else{
		printf("O aluno se encontra REPROVADO por quantidade de faltas!");
		printf("\nA media do aluno e: %.2f e a sua frequencia e: %d %%", media, freq);
	}
return 0;
}
