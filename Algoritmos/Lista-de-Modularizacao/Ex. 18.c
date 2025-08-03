#include<stdio.h>
#define MAX 20

int serie(int ordem){
	
	int aux =0;
	if (ordem == 1 || ordem == 2){
		aux = 1;
		return aux;
	}else{
		aux = serie(ordem-1)+serie(ordem-2);
		return aux;
	}
}

int main(){
	
	int num;
	
	printf("\nInforme a ordem da serie Fibonacci:\t");
	scanf("%i", &num);
	
	if(num <=20){
		printf("\nA sequencia Fibonacci eh: %i", serie(num));
	}else{
	printf("\nNao sera executado Fibonacci de ordem maior que %i", MAX);
	}
	return 0;
}
