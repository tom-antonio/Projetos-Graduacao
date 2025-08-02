#include <stdio.h>
#include <stdlib.h>

int main(){
	
	float salario, num;
	
	printf("\nDigite o valor do salario a ser ajustado ou zero para sair: ");
	scanf("%f", &salario);
	
	while( salario !=0 ){

			if (salario <= 600){
				num = salario * 1.30;
				printf("O salario tera ajuste de 30%%, sendo o novo salario com: %.2f ", num);
			}
			if (salario > 600 && salario <= 1100){
				num = salario * 1.25;
				printf("O salario tera ajuste de 25%%, sendo o novo salario com: %.2f ", num);				
			}
			if (salario > 1100 && salario <= 2400){
				num = salario * 1.20;
				printf("O salario tera ajuste de 20%%, sendo o novo salario com: %.2f ", num);				
			}
			if (salario > 2400 && salario <= 3550){
				num = salario * 1.15;
				printf("O salario tera ajuste de 15%%, sendo o novo salario com: %.2f ", num);				
			}
			if (salario > 3550){
				num = salario * 1.10;
				printf("O salario tera ajuste de 10%%, sendo o novo salario com: %.2f ", num);				
			}
		printf("\nDigite o valor do salario a ser ajustado ou zero para sair: ");
		scanf("%f", &salario);	
	}
return 0;
}
