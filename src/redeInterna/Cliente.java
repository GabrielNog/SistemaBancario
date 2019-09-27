package redeInterna;

import java.util.Scanner;

public class Cliente extends Usuario {
	private String ListaContabancaria;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O que deseja fazer?");
		int num2 = sc.nextInt();
		switch (num2) {
		case 1:
			abrirConta();
			break;
		case 2:
			fecharConta();
			break;
		case 3:
			consultarSaldo();
			break;
		case 4:
			transferir();
			break;
		case 5:
			depositar();
			break;
		case 6:
			pagarConta();
			break;
		case 7:
			logout();
			break;
		case 8:
			encerrar();
			break;
			
		}
	}

	private static void encerrar() {
		// TODO Auto-generated method stub
		
	}

	private static void logout() {
		// TODO Auto-generated method stub
		
	}

	private static void pagarConta() {
		// TODO Auto-generated method stub
		
	}

	private static void depositar() {
		// TODO Auto-generated method stub
		
	}

	private static void transferir() {
		// TODO Auto-generated method stub
		
	}

	private static void consultarSaldo() {
		// TODO Auto-generated method stub
		
	}

	private static void fecharConta() {
		// TODO Auto-generated method stub
		
	}

	private static void abrirConta() {
		// TODO Auto-generated method stub
		
	}
}
