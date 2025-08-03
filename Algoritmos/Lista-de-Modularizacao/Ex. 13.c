#include<stdio.h>

int divisao(int v1, int v2, int *qcte, int *rest){
	
	if(v2 == 0){
		return -1;
	}else{
		*qcte = v1/v2;
		*rest = v1%v2;
		return 0;
	}
}

int main(){
	
	int n1, n2, quociente, resto;

	printf("\nInforme o primeiro valor:\t");
	scanf("%i", &n1);
	printf("\nInforme o segundo valor:\t");
	scanf("%i", &n2);
	
	if(divisao(n1, n2, &quociente, &resto)){
		printf("\nNao eh possivel fazer a divisao!");
	}else{
		printf("\nA divisão eh possivel e o quociente eh: %i e o resto eh: %.3i", quociente, resto);
	}
	
	return 0;
}
