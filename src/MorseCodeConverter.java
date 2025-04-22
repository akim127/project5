/*
 * Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: MorseCodeConverter
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MorseCodeConverter {
	/*
	 * converts morse code to eng characters
	 */
	public static String convertToEnglish(String code) {
		MorseCodeTree myTree = new MorseCodeTree();
		myTree.buildTree();
		
		StringBuilder sb = new StringBuilder();
		String[] words = code.trim().split(" ");

		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("/")) {
				sb.append(" ");
			}
			else {
				String letter = myTree.fetchLetter(myTree.getRoot(), words[i]);
				sb.append(letter);
			}
		}
		
		return sb.toString().trim();
	}
	
	/*
	 * converts morse code from file to eng characters
	 */
	public static String convertToEnglish(File codeFile) throws FileNotFoundException {
		Scanner myScanner = new Scanner(codeFile);
		StringBuilder sb = new StringBuilder();
		
		return null;
	}
}
