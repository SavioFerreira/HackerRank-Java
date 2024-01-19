package solution;

import java.util.Scanner;

public class Solution {

	public static String verZero(Integer nmr) {

		String comprimento = nmr.toString();
		if (comprimento.length() < 3) {
			if (comprimento.length() < 2) {

				return "00" + comprimento;
			}
			return "0" + comprimento;
		}
		return comprimento;
	}

	public static String verCompri(String str) {

		String separador[] = str.split(" ");
		String palavra = separador[0];
		String nmr = separador[1];
		
		int tamanhoDaFrase = str.length() -1; 
		int tamanhoMax = 15;
		
		if (tamanhoDaFrase < tamanhoMax) {
			int redutor = (tamanhoMax -= tamanhoDaFrase);
			for (int i = 0; i < redutor; i++) {
				palavra += " ";
			}
		} else if (tamanhoDaFrase > tamanhoMax) {
			String sub = palavra.substring(0, 12);
			palavra = sub;
			
//			Caso o substituto seja menor que 15 e diminua
//			o tamanho da palavra, nesse caso seria preciso 
//			incluir os espaços em branco novamente, mas com isso, o código fica duplicado.	
//			
//			if (tamanhoDaFrase < tamanhoMax) {
//			int redutor = (tamanhoMax -= tamanhoDaFrase);
//				for (int i = 0; i < redutor; i++) {
//					palavra += " ";
//				}
//			}

		} else return "erro\n";
		return palavra.concat(nmr).concat("\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		String resultado1 = "";
		String resultado2 = "";
		String resultado3 = "";
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			if (i == 0) {
				resultado1 = verCompri(s1 + " " + verZero(x));
			}
			if (i == 1) {
				resultado2 = verCompri(s1 + " " + verZero(x));
			}
			if (i == 2) {
				resultado3 = verCompri(s1 + " " + verZero(x));
			}
		}

		System.out.println(resultado1 += resultado2 += resultado3);
		System.out.println("================================");
		sc.close();
	}
}