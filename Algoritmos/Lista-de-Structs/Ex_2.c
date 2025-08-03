#include <stdio.h>

int main(){
	
	struct pessoa{
		char nome[50];
		int idade;
		char end[100];
	};
	typedef struct pessoa Tpessoa;

	int i, aux;
	
	printf("\nInforme quantas pessoas deseja cadastrar:\t");
	scanf("%i", &aux);
	Tpessoa Dado[aux];
	system("cls");
	
	for(i=0; i<aux; i++){
		printf("\nCadastro da %i pessoa:", i+1);
		printf("\nInforme o nome da %i pessoa:\t", i+1);
		fflush(stdin);
		fgets(Dado[i].nome, 50, stdin);
		printf("\nInforme a idade da %i pessoa:\t", i+1);
		scanf("%i", &Dado[i].idade);
		printf("\nInforme o endereco da %i pessoa:\t", i+1);
		fflush(stdin);
		fgets(Dado[i].end, 100, stdin);
		system("cls");
	}
	printf("\nMostrando as pessoas cadastradas:");
	for(i=0; i<aux; i++){
		printf("\nNome: %s", Dado[i].nome);
		printf("\nIdade: %i", Dado[i].idade);
		printf("\nEndereco: %s", Dado[i].end);
		printf("\n\n");
	}
	return 0;
}
