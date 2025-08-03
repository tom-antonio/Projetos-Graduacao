#include <stdio.h>

int main(){
	struct aluno{
		char nome[50];
		int matricula;
		float n1, n2, n3;
	};
	typedef struct aluno Taluno;
	
	int aux, i, maiorn1, a1, soma;
	
	printf("\nInforme a quantidade de alunos que deseja cadastrar:\t");
	scanf("%i", &aux);
	
	Taluno dados[aux];
	float media[aux], temp;
	system("cls");
	
	for(i=0; i<aux; i++){
		printf("\nCadastro do %i aluno:", i+1);
		printf("\nInforme o nome do %i aluno:\t", i+1);
		fflush(stdin);
		fgets(dados[i].nome, 50, stdin);
		printf("\nInforme a matricula do %i aluno:\t", i+1);
		scanf("%i", &dados[i].matricula);
		printf("\nInforme a primeira nota do %i aluno:\t", i+1);
		scanf("%f", &dados[i].n1);
		printf("\nInforme a segunda nota do %i aluno:\t", i+1);
		scanf("%f", &dados[i].n2);
		printf("\nInforme a terceira nota do %i aluno:\t", i+1);
		scanf("%f", &dados[i].n3);
	system("cls");		
	}
	temp = dados[0].n1;
	for(i=0; i<aux; i++){
		if(dados[i].n1>temp){
			maiorn1 = temp;
			a1 = i;
		}
	}
	printf("\nO aluno com maior nota na primeira prova eh: %s com nota %.2f", dados[a1].nome, dados[a1].n1);
	printf("\n");
	
	for(i=0; i<aux; i++){
		soma = dados[i].n1 + dados[i].n2 + dados[i].n3;
		media[i] = (float)soma/(float)3;
	}
	temp = media[0];
	for(i=0; i<aux; i++){
		if(media[i]>=temp){
			temp = media[i];
			a1 = i;
		}
	}
	printf("\nO aluno com maior media das provas eh: %s com media %.2f", dados[a1].nome, temp);
	printf("\n");
	
	temp = media[0];
	for(i=0; i<aux; i++){
		if(media[i]<=temp){
			temp = media[i];
			a1 = i;
		}
	}
	printf("\nO aluno com menor media das provas eh: %s com media %.2f", dados[a1].nome, temp);
	printf("\n");
	
	for(i=0; i<aux; i++){
		if(media[i] >= 6){
			printf("\nO aluno %s da matricula %i foi APROVADO com media %.2f", dados[i].nome, dados[i].matricula, media[i]);
		}else{
			printf("\nO aluno %s da matricula %i foi REPROVADO com media %.2f", dados[i].nome, dados[i].matricula, media[i]);
		}
	}
return 0;
}
