#include<stdio.h>

float convert(float grad){
	
	float rad;
	
	rad = grad/180;
	
	return rad;
}

int main(){

	float grau;
	
	printf("\nInforme o valor em grau que deseja converter para radianos:\t");
	scanf("%f", &grau);
	
	printf("\nO valor em pi radianos eh: %.2f", convert(grau));
	
	return 0;
}
