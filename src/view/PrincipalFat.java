package view;

import controller.FatorialLimitado;

public class PrincipalFat {
	
	public static void main(String[] args) {
		
		//instanciando a classe controller e criando um objeto
		FatorialLimitado f = new FatorialLimitado();
		
		int n = 13;
		int fat = f.fatorial(n);
		System.out.println("Fatorial do número informado: " + fat);
		
	}
}
