#include <stdio.h>

char verifica (char letra){
	
	letra = toupper (letra);
	if(
	letra == 'A'|| letra == 'B'|| letra == 'C'|| letra == 'D'|| letra == 'E'|| letra == 'F'|| letra == 'G'|| letra == 'H'|| letra == 'I'|| letra == 'J'||
	letra == 'K'|| letra == 'L'|| letra == 'M'|| letra == 'N'|| letra == 'O'|| letra == 'P'|| letra == 'Q'|| letra == 'R'|| letra == 'S'|| letra == 'T'||
	letra == 'U'|| letra == 'V'|| letra == 'W'|| letra == 'X'|| letra == 'Y'|| letra == 'Z'){
		return 1;
	}else{
		return 0;
	}
}

int main (){
	char alfa;
	
	printf("\nInforme o simbolo que deseja verificar:\t");
	scanf("%c", &alfa);
	
	if(verifica(alfa)){
		printf("\nO simbolo pertence ao alfabeto");
	}else{
		printf("\nO simbolo nao pertence ao alfabeto");	
	};
	return 0;
}
