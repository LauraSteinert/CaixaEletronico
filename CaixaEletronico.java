/******************************************************************/
/**  ACH2001 - Introdução à Programação                          **/
/** EACH-USP - Primeiro Semestre de 2020                         **/
/** Matutino - Luciano Digiampietri                              **/
/**                                                              **/
/** Laura Steinert de Freitas          10725244                  **/
/**                                                              **/
/** Data de entrega: 15/04                                       **/
/******************************************************************/

/* 
	Programa que simula um caixa eletrônico das Ilhas Weblands, 
	com estoque ilimitado de cédulas de R$50,00 , R$10,00 ,
	R$5,00 e R$ 1,00.

*/

public class CaixaEletronico {
	//Número de cédulas de R$50,00
	static int n50;

	//Número de cédulas de R$10,00
	static int n10;

	//Número de cédulas de R$5,00
	static int n5;

	//Número de cédulas de R$1,00
	static int n1;

	/*
		Determina a quantidade de cada nota necessária para
		totalizar um determinado valor de retirada, de modo
		a minimizar a quantidade de cédulas entregues.
		
		Abastece as variáveis globais, n50,n10,n5 e n1 com seu
		respectivo número de cédulas.
		
		Parâmetro:
			valor - o valor a ser retirado
	*/

	static void fazRetirada(int valor) {
		//Método para saber quantas células serão retiradas

		//Caso o valor seja negativo
		if (valor<0){
			n50 = -1;
			n10 = -1;
			n5 = -1;
			n1 = -1;
		}
	
		//Caso o valor seja positivo
		while(valor>0){
			if (valor >=50){
			valor = valor-50;
			n50++;
			}
			else{
				if(valor>=10){
				valor = valor-10;
				n10++;
				}
				else{
					if(valor>=5){
					valor = valor-5;
					n5++;
					}
					else{
						if(valor>=1){
						valor = valor-1;
						n1++;
						}
					}
				}
			}
		}
	}

	public static void main(String[]args){
		
		//Definição do valor a ser retirado
		
		fazRetirada(28);

		//Saída do programa
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5: "+n5);
		System.out.println("Notas de 1: "+n1);
	}
}