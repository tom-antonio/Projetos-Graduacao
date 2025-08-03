#include <stdio.h>
#include <math.h>
#define MAX 3

int main(){
	
	struct coodpolar{
		float rad;
		float raio;
	};
	typedef struct coodpolar Tpolar;
	
	int i;
	float x, y;

	Tpolar dados;
	
	for(i=0; i<MAX; i++){
		printf("\nInforme o valor do raio:\t");
		scanf("%f", &dados.raio);
		printf("\nInforme o valor do radiano:\t");
		scanf("%f", &dados.rad);
		
		x = dados.raio * cos(dados.rad);
		y = dados.raio * sin(dados.rad);
		
		printf("\nAs coordenadas cartesianas eh: X: %.3f e Y: %.3f", x, y);
		printf("\n\n");
	}
		
	return 0;
}
