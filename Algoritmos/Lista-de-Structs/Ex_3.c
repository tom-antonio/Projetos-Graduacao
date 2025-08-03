#include<stdio.h>
#define MAX 2

int main(){
	struct aluno{
		char nome[50];
		int matricula;
		char curso[30];
	};
	typedef struct aluno Taluno;
	
	Taluno cadastro[MAX];
	int i;
	
	for(i=0; i<MAX; i++){
		printf("\nCadastro do %i aluno:", i+1);
		printf("\nInforme o nome do %i aluno:\t", i+1);
		fflush(stdin);
		fgets(cadastro[i].nome, 50, stdin);
		printf("\nInforme o curso do %i aluno:\t", i+1);
		fflush(stdin);
		fgets(cadastro[i].curso, 30, stdin);
		printf("\nInforme a matricula do %i aluno:\t", i+1);
		scanf("%i", &cadastro[i].matricula);
		system("cls");
	}
	printf("\nOs dados dos alunos cadastrados sao:");
	for(i=0; i<MAX; i++){
		printf("\nNome: %s", cadastro[i].nome);
		printf("\nCurso: %s", cadastro[i].curso);
		printf("\nMatricula: %i", cadastro[i].matricula);
		printf("\n\n");
	}
	return 0;
}
