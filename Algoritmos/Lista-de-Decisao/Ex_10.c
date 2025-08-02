#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int num;
	
	printf("Digite o numero que deseja verificar ou digite 0 para sair: ");
	scanf("%d", &num);

	while( num != 0){
		if(num >= 20 && num <= 90){
			printf("O numero se encontra no intervalo de 20 a 90!");
			printf("\nDigite o numero que deseja verificar ou digite 0 para sair: ");
			scanf("%d", &num);
		}else{
			printf("O numero NAO se encontra no intervalo de 20 a 90!");
			printf("\nDigite o numero que deseja verificar ou digite 0 para sair: ");
			scanf("%d", &num);
		}
	}
return 0;
}
