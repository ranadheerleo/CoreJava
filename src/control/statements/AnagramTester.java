package control.statements;

public class AnagramTester {
	
	public static void main(String[] args)
	    {
		Anagram anagram =new Anagram();
		String sentence1 = "Bad-credit";
		String sentence2 = "Debit card";
	
		String sentence3 = "Election results";
		String sentence4 = "Lies-let's recount";
		
		String sentence5 = "Ranadheer";
		String sentence6 = "Rajitha";

		System.out.println(sentence1 + " and " + sentence2 + " are anagrams: " + anagram.isAnagram(sentence1,sentence2));
		System.out.println(sentence3 + " and " + sentence4 + " are anagrams: " + anagram.isAnagram(sentence3,sentence4));
		System.out.println(sentence5 + " and " + sentence6 + " are anagrams: " + anagram.isAnagram(sentence5,sentence6));
		
      }
    
		
}
        
