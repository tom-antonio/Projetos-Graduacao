#include <stdio.h>
#include <stdlib.h>

int main (){
	
	float valor, preco;

	while (valor != 0){
		printf("\nDigite o valor do produto ou zero para sair: ");
		scanf("%f", &valor);
		
		if (valor < 20){
			preco = valor * 1.45;
			printf("\nO valor de venda tera um lucro de 45%% sendo o preco: %.2f !", preco);
		} else{
			preco = valor * 1.30;
			printf("\nO valor de venda tera um lucro de 30%% sendo o preco: %.2f !", preco);
		}
	}	
return 0;
}

