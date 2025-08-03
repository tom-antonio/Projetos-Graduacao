#include <stdio.h>

int main (){
	
	int v1, v2, *p_v1, *p_v2, aux;
	
	printf("\nFazendo a leitura das variaveis\n");
	printf("\nInforme o valor da primeira variavel:\t");
	scanf("%i", &v1);
	
	printf("\nInforme o valor da segunda variavel:\t");
	scanf("%i", &v2);
	
	p_v1 = &v1;
	p_v2 = &v2;
	
	printf("\nTrocando o valor das variaveis\n");
	
	aux = *p_v1;
	*p_v1 = *p_v2;
	*p_v2 = aux;
	
	printf("\nOs valores trocados sao respectivamente: %i e %i", v1, v2);
}
