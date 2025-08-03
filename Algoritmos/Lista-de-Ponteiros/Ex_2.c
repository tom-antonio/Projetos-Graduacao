#include<stdio.h>

int main(){
	
	int v1, v2, *p_v1, *p_v2;
	
	printf("\nInforme o valor para a variavel 1:\t");
	scanf("%i", &v1);
	printf("\nInforme o valor para a variavel 2:\t");
	scanf("%i", &v2);
	
	p_v1 = &v1;
	p_v2 = &v2;
	
	if(&v1 > &v2){
		printf("\nO maior endereco eh: %x da variavel %i", &v1, v1);
	}else{
		printf("\nO maior endereco eh: %x da variavel %i", &v2, v2);
	}
	
	if(*p_v1 > *p_v2){
		printf("\nA maior variavel eh: %i com endereco %x", v1, p_v1);
	}else{
		printf("\nA maior variavel eh: %i com endereco %x", v2, p_v2);
	}
	
}
