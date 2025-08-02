#include <stdio.h>
#include <stdlib.h>

int main (){
	int n1, n2;
	
	printf("Informe o valor de A: \t");
	scanf("%d", &n1);
	
	printf("Informe o valor de B: \t");
	scanf("%d", &n2);
	

	if (n2 > n1+1){
		printf("Os valores fornecidos sao: %d, %d!", n1, n2);
	}
	else{
		while (n2 < n1+1){
			printf("Informe um valor que B seja maior que A!\t");
			scanf("%d", &n2);
		}
		printf("Os valores fornecidos sao: %d, %d!", n1, n2);	
	}
return 0;
}
