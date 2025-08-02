#include <stdio.h>
#include <stdlib.h>

int main (){
	
	int n;
	
	printf("Digite o numero: \t");
	scanf("%d", &n);
	
	if (n%2 == 0){
		printf("O numero e par!");
	}
	else{
		printf("O numero e impar!");
	}
return 0;
}
