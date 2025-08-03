#include<stdio.h>

void tabuada (int num){
	
	int i, soma=0;
	
	printf("=============================");
	printf("\nTabuada do %i", num);
	printf("\n============================");
	printf("\n");
	
	for(i=1; i<=10; i++){
		soma = num+soma;
		printf("\n %i * %i = %i", num, i, soma);
	}
}

int main(){
		int n1;
		
	do{
		printf("\nInforme o valor da tabuada que deseja verificar ou zero para sair:\t");
		scanf("%i", &n1);
	
		tabuada(n1);
			
	}while(n1 != 0);
	
	return 0;
}
