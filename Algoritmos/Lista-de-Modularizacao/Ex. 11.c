#include <stdio.h>
#include <stdlib.h>

int divisao (int x, int y){
	
	int cont=0, i;
	
	for(i=0; i<x/y; i++){
		if(x%y==0){
			cont++;
		}
	}
	return cont;
}

int main (){
	
	int n1, n2, num;
	
	printf("\nInforme o primeiro numero:\t");
	scanf("%i", &n1);
	printf("\nInforme o seghundo numero:\t");
	scanf("%i", &n2);
	
	num = divisao(n1, n2);
	
	printf("\nO numero %i eh divisivel pelo numero %i, %i vezes!", n1, n2, num);
	
	getch();
	return 0;
	
}
