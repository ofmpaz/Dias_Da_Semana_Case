package projetoextra;

import java.util.Scanner;

public class DiasdaSemana {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 

		System.out.println("Informe o dia da semana em forma de n�meral "); 
		//Variavel que aloja dia da semana 
		int diaSemana;
		//Receptor do valor infomado pelo usu�rio 
		diaSemana = input.nextInt(); 
		
		//Estrutura de decis�o switch/case
		switch(diaSemana){
		case 1: System.out.println("Domingo");
		break;
		case 2: System.out.println("Segunda");
		break; 
		case 3: System.out.println("Ter�a");
		break; 
		case 4: System.out.println("Quarta");
		break; 
		case 5: System.out.println("Quinta");
		break; 
		case 6: System.out.println("Sexta");
		break; 
		case 7: System.out.println("Sab�do");
		break; 
		default: System.out.println("Dia da semana inv�lido");
		}


	}

}
