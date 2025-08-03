#include<stdio.h>

int numero(int *A, int *B){

	if(B !=0 && *A % *B == 0){
		return 1;
	}else{
		return 0;
	}
}
	
int main (){
	
	int n1, n2;
	
	printf("\nInforme o primeiro numero:\t");
	scanf("%i", &n1);
	
	printf("\nInforme o segundo numero:\t");
	scanf("%i", &n2);
	
	system("cls");
	
	if(numero(&n1, &n2)){
		printf("\n%i eh divisivel por %i\n", n1, n2);
	}else{
		printf("\n%i nao eh divisivel por %i\n", n1, n2);
	}
	return 0;
}
