#include<stdio.h>

int convert(int grad){
	
	int fah;
	
	fah = (grad*1.8) + 32;
	
	return fah;
}

int main(){
	
	int  graus;
	
	printf("\nInforme a temperatura em Graus que deseja converter:\t");
	scanf("%i", &graus);
	
	printf("\nA temperatura em Fahrenheit: %i", convert(graus));
	
	return 0;
}
