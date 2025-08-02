#include <stdio.h>
#include <stdlib.h>


int main () {
	int n1, n2;
	
	printf("Digite o primeiro numero? \t");
	scanf("%d", &n1);
	
	printf("Digite o segundo numero? \t");
	scanf("%d", &n2);
	
	if (n1 == n2){
		printf("Os dois numeros sao iguais!");
	}
	else{
		printf("Os dois numeros sao diferentes!");
	}
	return 0;
}


