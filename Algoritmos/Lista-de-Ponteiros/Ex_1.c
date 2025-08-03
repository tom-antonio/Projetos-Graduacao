#include<stdio.h>

int main(){
	
	int v1, aux1, *p_v1;
	float v2, aux2, *p_v2;
	char v3, aux3, *p_v3;
	
	printf("\nInserindo valor nas variaveis");
	printf("\nInforme o valor da variavel int:\t");
	scanf("%i", &v1);
	printf("\nInforme o valor da variavel float:\t");
	scanf("%f", &v2);
	printf("\nInforme o valor da variavel char:\t");
	fflush(stdin);
	scanf("%c", &v3);
	
	aux1 = v1;
	aux2 = v2;
	aux3 = v3;
	
	p_v1 = &v1;
	p_v2 = &v2;
	p_v3 = &v3;
	
	printf("\nAlterando os valores por meio de ponteiros");
	printf("\nInforme o novo valor da variavel int:\t");
	scanf("%i", p_v1);
	printf("\nInforme o novo valor da variavel float:\t");
	scanf("%f", p_v2);
	printf("\nInforme o novo valor da variavel char:\t");
	fflush(stdin);
	scanf("%c", p_v3);
	
	printf("\nMostrando os novos valores alterados");
	printf("\nSaindo de %i para %i", aux1, v1);
	printf("\nSaindo de %.1f para %.1f", aux2, v2);
	printf("\nSaindo de %c para %c", aux3, v3);
	
}
