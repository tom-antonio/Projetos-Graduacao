#include <stdio.h>
#include <stdlib.h>

int main (){
	
	int n1, n2, n3, temp;
	
	printf("Informe o primeiro numero positivo: \t");
	scanf("%d", &n1);
	
	if (n1<0){
		while(n1<0){
			printf("Digite um numero positivo! \t");
			scanf("%d", &n1);
		}
	}
	
	printf("Informe o segundo numero positivo: \t");
	scanf("%d", &n2);

	if (n2<0){
		while(n2<0){
			printf("Digite um numero positivo! \t");
			scanf("%d", &n2);
		}
	}
	
	printf("Informe o terceiro numero positivo: \t");
	scanf("%d", &n3);

	if (n3<0){
		while(n3<0){
			printf("Digite um numero positivo! \t");
			scanf("%d", &n3);
		}
	}	
		
    if (n1 > n2) {
        temp = n1;
        n1 = n2;
        n2 = temp;
    }

    if (n1 > n3) {
        temp = n1;
        n1 = n3;
        n3 = temp;
    }

    if (n2 > n3) {
        temp = n2;
        n2 = n3;
        n3 = temp;
    }
    
    printf("\nA ordem crescente dos numeros sao: %d, %d, %d!", n1, n2, n3);
    
return 0;
}
