#include <stdio.h>

int main(){
	
	char Nome[40], Disciplina[20], Professor[40];
		
	void introducao(void){
		printf("\n=======================================================");
		printf("\n %s", Nome);
		printf("\n %s", Disciplina);
		printf("\n %s", Professor);
		printf("\n=======================================================");
	}
	
	
	printf("\nInforme o nome da instituicao:\t");
	fflush(stdin);
	fgets(Nome, 40, stdin);
	printf("\nInforme o nome da disciplina:\t");
	fflush(stdin);
	fgets(Disciplina, 20, stdin);
	printf("\nInforme o nome do professor(a):\t");
	fflush(stdin);
	fgets(Professor, 40, stdin);
	
	system("cls");
	
	introducao ();
}
