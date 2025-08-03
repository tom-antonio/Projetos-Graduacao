#include<stdio.h>

int verifica(int num){
	int i;
	
	for(i=2; i<num; i++){
		if(num%i == 0){
			return 0;	
		}
	}
	return 1;
}

int main(){
	int cont;
	
	do{
	printf("\nInforme o numero que deseja verificar ou zero para sair:\t");
	scanf("%i", &cont);
	if (cont !=0){
		if(verifica(cont)){
		printf("O numero %i eh primo", cont);
	}else{
		printf("O numero %i nao eh primo", cont);
			}
		}	
	}while(cont != 0);	
	

	
	return 0;
}
