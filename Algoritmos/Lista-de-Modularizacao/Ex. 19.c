#include<stdio.h>

int fatorial(int fat){

	if(fat == 0){
		return 1;
	}else{
		if(fat > 0){
			return fat*fatorial(fat-1);
		}else{
			if(fat < 0){
				return -1;
			}
		}
	}
}

int main(){
	
	int num, aux;
	
	printf("\nInforme o numero que deseja verificar:\t");
	scanf("%i", &num);
	
	aux = fatorial(num);
	
	if(aux == -1){
	printf("\nNão existe fatorial negativo!");
	}else
		if(aux == 1){
			printf("\nO fatorial de %i eh %i", num, aux);
		}else{
		printf("\nO fatorial de %i eh %i", num, aux);
	}
	return 0;
}
