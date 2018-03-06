package br.ucb.main;

import br.ucb.model.Cesar;

public class CesarMain {
	public static void main(String[] args) {

		int chave = 2;
		String texto = "testando";

		String textoCriptografado = Cesar.encrypt(chave, texto);
		String textoDecriptografado = Cesar.decrypt(chave, textoCriptografado);

		System.out.println("Texto Criptografado: " + textoCriptografado);
		System.out.println("Texto Descriptografado: " + textoDecriptografado);

	}

}
