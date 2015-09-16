package com.blogspot.viminas;

/**
 * Labeled loops: The break statement has two forms: labeled and unlabeled
 * 
 * To try use:	
 * public static void main(String[] args) {
		Loops l = new Loops();
		l.FindString();
	}
 * */
public class Loops {

	protected Loops() {

	}

	public boolean FindString() {
		boolean output = false;
		String phrase = "012345";
		System.out.println("phrase.length()[" + phrase.length() + "]");

		MyLabeled:

		for (int i = 0; i <= phrase.length(); i++) {

			while (i < 3) {
				System.out.println("i[" + i + "]");

				continue MyLabeled;
			}
			System.out.println("<><> Valeu of i[" + i + "] before break.");
			output = true;
			break MyLabeled;
		}

		return output;
	}

}
