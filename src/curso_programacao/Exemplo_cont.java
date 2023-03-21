package curso_programacao;

import java.util.Scanner;

public class Exemplo_cont {
  /*
   * Esse e um projeto que ao digitar 
   * A hora você tera a saudação de 
   * Bom dia/Boa tarde/Boa noite
   * Dando referencia a hora digitada
   * 
   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas;
		System.out.println("Digite a Hora :");
		horas = sc.nextInt();
		
		if(horas < 12) {
		System.out.println("Bom dia \n ");
		}else if(horas < 18) {
			  System.out.println("Boa tarde \n");
		  }
		   else {
			System.out.println("Boa noite \n ");
		  }
	    }
	}


