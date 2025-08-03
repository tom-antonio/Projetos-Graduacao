#include <stdio.h>
#define MAX 10

int main (){
	struct aluno{
		int matricula;
		char nome[40], disciplina[30];
		float n1, n2;
	};
	typedef struct aluno Taluno;
	
	Taluno dado[MAX];
	float media, soma;
	int i;
		
	for(i=0; i<MAX; i++){
		printf("\nInforme o nome do %i aluno:\t", i+1);
		fflush(stdin);
		fgets(dado[i].nome, 40, stdin);
		printf("\nInforme a matricula do %i aluno:\t", i+1);
		scanf("%i", &dado[i].matricula);
		printf("\nInforme o nome da disciplina do %i aluno:\t", i+1);
		fflush(stdin);
		fgets(dado[i].disciplina, 30, stdin);
		printf("\nInforme a nota do %i da primeira prova:\t", i+1);
		scanf("%f", &dado[i].n1);	
		printf("\nInforme a nota do %i da segunda prova:\t", i+1);
		scanf("%f", &dado[i].n2);	
	}
	system("cls");
	
	for(i=0; i<MAX; i++){
		soma = dado[i].n1*1 + dado[i].n2*2;
		media = (float)soma/(float)3;

		if(media >=6){
			printf("\nO aluno %s da matricula %i foi APROVADO com media %.2f na disciplina %s", dado[i].nome, dado[i].matricula, media, dado[i].disciplina);
		}else{
			printf("\nO aluno %s da matricula %i foi REPROVADO com media %.2f na disciplina %s", dado[i].nome, dado[i].matricula, media, dado[i].disciplina);
		}
	}
	return 0;
}
