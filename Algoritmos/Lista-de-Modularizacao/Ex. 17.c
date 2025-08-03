#include<stdio.h>

float convert (float num){
	
	float cm;
	cm = num*2.54;
	
	return cm;
}

int main(){
	float dado;
	
	printf("\nInforme a polegada que deseja converter:\t");
	scanf("%f", &dado);
	
	printf("\n A polegada corresponde a %.2f cm", convert(dado));
	
	return 0;
}
