package redeInterna;

import java.util.Scanner;

public class Banco {
	public static Administrador adm = null;
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.println("Escolha 1-Adm / 0-SAIR");
		int a = op.nextInt(); 
		if(a == 1) {
			System.out.println("Criar Login:");
			String lg = op.next();
			System.out.println("Definir senha:");
			String sh = op.next();
			if(lg.equals("admin") && sh.equals("admin")) {
				adm = new Administrador(); 
			}/*else {
				//[cliente1,cliente2,cliente3]
				Cliente c = null;
				for (Cliente cg : lista) {
					if(c.lg && c.sh){
						c = cg;
					}
				}
			}*/
		}
	}
}
