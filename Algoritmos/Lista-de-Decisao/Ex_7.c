#include <stdio.h>
#include <stdlib.h>

int main (){
	int l1, l2, l3;
	
	printf("Digite o primeiro lado do triangulo: \t");
	scanf("%d", &l1);
	printf("Digite o segundo lado do triangulo: \t");
	scanf("%d", &l2);
	printf("Digite o terceiro lado do triangulo: \t");
	scanf("%d", &l3);
	
	if ((l1 < l2+l3) && (l2 < l1+l3) && (l3 < l1+l2)){
		printf("\nAs medidas sao um triangulo!");
		
		if ((l1 == l2) && (l2==l3)){
			printf("\nEste e um triangulo Equilatero!");
			
		} else{
			if((l1==l2) || (l1==l3 ) || (l2==l3)){
			printf("\nEste e um triangulo Isosceles!");	
			} else{
				printf("\nEste é um triangulo escaleno!");
			}
		}
	}else{
	printf("\nAs medidas dos lados NAO formam um triangulo!");		
	}
	
return 0;
}
