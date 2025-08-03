#include <stdio.h>

int verifica(int data){
	if(data%4 == 0 && data%100 != 0 || data%400 == 0){
		return 1;
	}else{
		return 0;
	}
}
	
int main (){
	
	int ano;
	
	do{
	printf("\nInforme o ano que deseja verificar ou zero para sair:\t");
	scanf("%i", &ano);
	
	if(verifica(ano)){
		printf("\nO ano eh bisexto");
	}else{
		printf("\nO ano nao eh bisexto");
	};	
	
	}while(ano != 0);

	
	return 0;
}
