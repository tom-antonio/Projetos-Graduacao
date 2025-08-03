#include <stdio.h>

int maior (int x, int y){
	
	if(x>=y){
		return x;
	}else{
		return y;
	}
}

int main (){
	
	int n1, n2, num;
	
	printf("\nInforme o primeiro numero que deseja verificar:\t");
	scanf("%i", &n1);
	printf("\nInforme o segundo numero que deseja verificar:\t");
	scanf("%i", &n2);
	
	num = maior (n1, n2);
	system("cls");
	
	printf("\nO maior numero eh: %i", num);
	getch();
	return 0;
}
