#include <stdio.h>

int main(){
	
	struct funcionario{
		char nome[40];
		int idade;
		char sexo;
		float cpf;
		int dia;
		int mes;
		int ano;
		int codigo;
		char cargo[30];
		float salario;
	};
	typedef struct funcionario Tfun;
	
	int i, aux;
	
	printf("\nInforme a quantidade de funcionarios que deseja cadastrar:\t");
	scanf("%i", &aux);
	system("cls");
	
	Tfun dados[aux];
	
	for(i=0; i<aux; i++){
		printf("\nCadastro do Funcionario:");
		printf("\nInforme o nome do %i funcionario:\t", i+1);
		fflush(stdin);
		fgets(dados[i].nome, 40, stdin);
		printf("\nInforme a idade do %i funcionario:\t", i+1);
		scanf("%i", &dados[i].idade);
		printf("\nInforme o sexo do %i funcionario (F ou M):\t", i+1);
		fflush(stdin);
		scanf("%c", &dados[i].sexo);
		printf("\nInforme o CPF do %i funcionario:\t", i+1);
		scanf("%f", &dados[i].cpf);
		printf("\nInforme o dia de nascimento do %i funcionario:\t", i+1);
		scanf("%i", &dados[i].dia);
		printf("\nInforme o mes de nascimento do %i funcionario:\t", i+1);
		scanf("%i", &dados[i].mes);
		printf("\nInforme o ano de nascimento do %i funcionario:\t", i+1);
		scanf("%i", &dados[i].ano);
		printf("\nInforme o codigo do %i funcionario:\t", i+1);
		scanf("%i", &dados[i].codigo);
		printf("\nInforme o cargo do %i funcionario:\t", i+1);
		fflush(stdin);
		fgets(dados[i].cargo, 30, stdin);
		printf("\nInforme o salario do %i funcionario:\t", i+1);
		scanf("%f", &dados[i].salario);
		system("cls");
	}
	
	printf("\nMostrando os dados dos funcionarios cadastrados:");
	for(i=0; i<aux; i++){
		printf("\nNOME: %s", dados[i].nome);
		printf("\nIDADE: %I ----- SEXO: %c", dados[i].idade, dados[i].sexo);
		printf("\nCPF: %f ----- CODIGO: %i", dados[i].nome, dados[i].codigo);
		printf("\nNASCIMENTO: %i / %i / %i", dados[i].dia, dados[i].mes, dados[i].ano);
		printf("\nCARGO: %s ----- SALARIO: %.2f", dados[i].cargo, dados[i].salario);
		printf("\n\n");
	}
return 0;
}
