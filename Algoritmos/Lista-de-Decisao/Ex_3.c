#include <stdio.h>
#include <stdlib.h>

int main (){
	int n1, n2;
	
	printf("Digite o primeiro numero: \t");
	scanf("%d", &n1);
	
	printf("Digite o segundo numero: \t");
	scanf("%d", &n2);
	
	if(n1%n2 == 0){
		printf("O primeiro numero e divisivel pelo segundo!");
	}
	else{
		printf("O primeiro numero nao e divisivel pelo segundo!");
	}
	return 0;
}

