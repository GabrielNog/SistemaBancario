package redeInterna;

import java.util.Scanner;

public class Administrador extends Usuario {

	
	public static void main(String[] args) {
		Scanner operador = new Scanner(System.in);
		System.out.println("O que deseja fazer?");
		System.out.println("1-Cadastrar Cliente / 2-Remover Cliente / 3-Buscar Cliente"
				+ "4-logut / 5-Encerrar Aplicacao.");
		int num = operador.nextInt();
		switch (num) {
		case 1:
			cadastrarCliente();
			break;
		case 2:
			RemoverCliente();
			break;
		case 3:
			BuscarCliente();
			break;
		case 4:
			Logout();
			break;
		case 5:
			EncerrarAplicacao();
			break;
		default:
			System.out.println("Sistema de escolha encerrado.");
		}
		
	}
	private static void cadastrarCliente() {
		// TODO Auto-generated method stub
		
	}
	private static void RemoverCliente() {
		// TODO Auto-generated method stub
		
	}
	private static void BuscarCliente() {
		// TODO Auto-generated method stub
		
	}
	private static void Logout() {
		// TODO Auto-generated method stub
		
	}
	private static void EncerrarAplicacao() {
		// TODO Auto-generated method stub
		
	}

}



	
