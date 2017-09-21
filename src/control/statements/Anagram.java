package control.statements;

import java.util.Arrays;

public class Anagram {
	public boolean isAnagram(String sentence1, String sentence2) {
		// use [\\W+] or "[^a-zA-Z0-9]" as regex to match any special characters and
		// also use String.replaceAll(regex, String) to replace the special character
		// with
		// an empty string
		String Newsentence1 = sentence1.replaceAll("\\W+", "").toLowerCase();
		String Newsentence2 = sentence2.replaceAll("\\W+", "").toLowerCase();

		boolean status = true;

		if (Newsentence1.length() != Newsentence2.length()) {
			status = false;
		} else {

			char[] sentence1Array = Newsentence1.toCharArray();// Newsentence1&2 and converting them to char array
			char[] sentence2Array = Newsentence2.toCharArray();

			Arrays.sort(sentence1Array);// Sorting both sentence1Array and word2Array
			Arrays.sort(sentence2Array);
			// Checking whether sentence1Array and sentence2Array are equal
			status = Arrays.equals(sentence1Array, sentence2Array);

		}
		return status;
	}

}