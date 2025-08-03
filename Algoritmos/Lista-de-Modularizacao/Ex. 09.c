#include<stdio.h>

int fatorial(int fat){
	
	if(fat == 0){
		return 1;
	}else{
		return fat * fatorial(fat-1);
	}
}

int main(){
	
	int num;
	
		printf("\nInforme o numero que deseja saber o fatorial:\t");
		scanf("%i", &num);
		
		if(num<0){
			printf("\nNao existe fatorial deste numero!");
		}else{
			printf("\nO fatorial do %i eh %i", num, fatorial(num));		
		}
	return 0;
}
