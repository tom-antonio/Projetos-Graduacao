#include <stdio.h>

int main (){
	
	struct horario{
		int hora, min, seg;
	};
	typedef struct horario Thorario;
	
	struct data{
		int dia, mes, ano;
	};
	typedef struct data Tdata;
	
	struct compromisso{
		Thorario H;
		Tdata D;
		char comp[100];
	};
	typedef struct compromisso Tcomp;
	
	int i, aux;
	
	printf("\nInforme quantos compromissos deseja marcar:\t");
	scanf("%i", &aux);
	
	Tcomp agenda[aux];
	
	for(i=0; i<aux; i++){
	printf("\nVamos agendar o %i compromisso!", i+1);
	printf("\nInforme o dia do %i compromisso:\t", i+1);
	scanf("%i", &agenda[i].D.dia);
	printf("\nInforme o mes do %i compromisso:\t", i+1);
	scanf("%i", &agenda[i].D.mes);
	printf("\nInforme o ano do %i compromisso:\t", i+1);
	scanf("%i", &agenda[i].D.ano);
	printf("\nInforme a hora do %i compromisso:\t", i+1);
	scanf("%i", &agenda[i].H.hora);
	printf("\nInforme o minuto do %i compromisso:\t", i+1);
	scanf("%i", &agenda[i].H.min);
	printf("\nInforme o segundo do %i compromisso:\t", i+1);
	scanf("%i", &agenda[i].H.seg);
	printf("\nInforme a descricao do %i compromisso:\t", i+1);
	fflush(stdin);
	fgets(agenda[i].comp, 100, stdin);
	system("cls");
	}
	
	printf("\nMostrando os compromissos cadastrados:\n");
	for(i=0; i<aux; i++){
		printf("\n%i/%i/%i as %i:%i:%i ---> %s\n\n", agenda[i].D.dia, agenda[i].D.mes, agenda[i].D.ano, agenda[i].H.hora, agenda[i].H.min, agenda[i].H.seg, agenda[i].comp);
	}
	return 0;
}
