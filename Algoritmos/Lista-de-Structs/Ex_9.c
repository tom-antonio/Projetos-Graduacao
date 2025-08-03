#include <stdio.h>

int main (){
	
	struct produto{
		int codig;
		char nome[15];
		float preco, quant;
	};
	typedef struct produto Tprod;
	
	int i, qd, aux, temp, alt, j;
	Tprod *Ped;
	
	printf("\nInforme a quantidade de produtos que deseja armazenar:\t");
	scanf("%i", &qd);
	
	Ped = malloc(qd * sizeof(Tprod));
	
	for(i=0; i<qd; i++){
		printf("\nInforme o codigo do %i produto:\t", i+1);
		scanf("%i", &Ped[i].codig);
		printf("\nInforme o nome do %i produto:\t", i+1);
		fflush(stdin);
		fgets(Ped[i].nome, sizeof(Ped[i].nome), stdin);
		printf("\nInforme o preco do %i produto:\t", i+1);
		scanf("%f", &Ped[i].preco);
		printf("\nInforme a quantidade do %i produto:\t", i+1);
		scanf("%f", &Ped[i].quant);
		getch();
	}
	system("cls");
	do{
		printf("\nInforme uma opcao desejada:");
		printf("\n\tBALANCO ---- DIGITE 1:\t");
		printf("\n\tADICIONAR PRODUTO ----- DIGITE 2:\t");
		printf("\n\tALTERAR PRODUTO ----- DIGITE 3:\t");
		printf("\n\tSAIR DO PROGRAMA ----- DIGITE 0:\t");
		printf("\n\tRESPOSTA: ");
		scanf("%i", &aux);
		
		if(aux == 1){
			for(i=0; i<qd; i++){
				printf("\nCODIGO: %i --- NOME: %s", Ped[i].codig, Ped[i].nome);
				printf("QUANTIDADE: %.2f --- PRECO: %.2f", Ped[i].quant, Ped[i].preco);
				printf("\n");
				getch();
			}
			system("cls");
		}else
			if(aux == 2){
				temp = qd + 1;
				Ped = malloc(temp * sizeof(Tprod));
				
				printf("\nInforme os dados do produto adicional:");
				printf("\nInforme o codigo do %i produto:\t", i+1);
				scanf("%i", &Ped[temp].codig);
				printf("\nInforme o nome do %i produto:\t", i+1);
				fflush(stdin);
				fgets(Ped[temp].nome, sizeof(Ped[temp].nome), stdin);
				printf("\nInforme o preco do %i produto:\t", i+1);
				scanf("%f", &Ped[temp].preco);
				printf("\nInforme a quantidade do %i produto:\t", i+1);
				scanf("%f", &Ped[temp].quant);
				system("cls");
				qd = qd + 1;
		}else
			if(aux == 3){
				printf("\nDigite o codigo do produto que deseja alterar:\t");
				scanf("%i", &alt);
				
				for(j=0; j<qd; j++){
					if(alt == Ped[j].codig){
					printf("\nInforme o nome do produto:\t");
					fflush(stdin);
					fgets(Ped[j].nome, sizeof(Ped[j].nome), stdin);
					printf("\nInforme o preco do produto:\t");
					scanf("%f", &Ped[j].preco);
					printf("\nInforme a quantidade do produto:\t");
					scanf("%f", &Ped[j].quant);	
					}
					system("cls");
				}
			}
		}while(aux != 0);
return 0;	
}
