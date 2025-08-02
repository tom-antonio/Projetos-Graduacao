#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	char senha[20], s2[] = "eh4nois";
	
	printf("Digite a senha de entrada: \t");
	scanf("%s", &senha);
	
	if (strcmp(senha, s2)==0){
		printf("Senha correta!");	
	}else{
		while (strcmp(senha, s2)!= 0){
			printf("Senha incorreta! Digite novamente: \t");
			scanf("%s", &senha);
		}
		printf("Senha correta!");	
	}	
return 0;
}



