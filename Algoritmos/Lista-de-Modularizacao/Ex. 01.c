#include <stdio.h>
#include <locale.h>

int main (){
	
	
	int mes;
	
	void meses() {
		switch (mes){
			case 1:
				printf("\nJaneiro\n");
				break;
				
			case 2:
				printf("\nFevereiro\n");
				break;
				
			case 3:
				printf("\nMarco\n");
				break;
				
			case 4:
				printf("\nAbril\n");
				break;
				
			case 5:
				printf("\nMaio\n");
				break;
			
			case 6:
				printf("\nJunho\n");
				break;
				
			case 7:
				printf("\nJulho\n");
				break;
				
			case 8:
				printf("\nAgosto\n");
				break;
				
			case 9:
				printf("\nSetembro\n");
				break;
				
			case 10:
				printf("\nOutubro\n");
				break;
				
			case 11:
				printf("\nNovembro\n");
				break;
				
			case 12:
				printf("\nDezembro\n");
				break;	
		}
	}
	
	do{
		printf("\nInforme o mes que deseja (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 e 12 ou 0 para sair):\t");
		scanf("%i", &mes);
		meses(mes);
		
	}while(mes != 0);

	return 0;
}
