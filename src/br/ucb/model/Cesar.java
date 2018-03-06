package br.ucb.model;

public class Cesar {
	
	public static String encrypt(int key, String text) {
		
		StringBuilder textEncrypt = new StringBuilder();
		int textLenght = text.length();
		
		for (int c = 0; c < textLenght; c++) {
			
			int letterASCIIEncrypt = ((int) text.charAt(c)) + key;
			
			while (letterASCIIEncrypt > 126)
				letterASCIIEncrypt -= 94;
			
			textEncrypt.append((char) letterASCIIEncrypt);
		}
		
		return textEncrypt.toString();
	}
	
	public static String decrypt(int key, String textEncrypt) {
		
		StringBuilder text = new StringBuilder();
		int textLenght = textEncrypt.length();
		
		for (int c = 0; c < textLenght; c++) {
			
			int letterASCIIDecrypt = ((int) textEncrypt.charAt(c)) - key;
			
			while (letterASCIIDecrypt > 126)
				letterASCIIDecrypt -= 94;
			
			text.append((char) letterASCIIDecrypt);
		}
		
		return text.toString();
	}
}
