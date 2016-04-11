import java.util.*;

public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		String s3 = "Ha44y B1r7hda9";
		//System.out.println(s2.indexOf('p'));
		//System.out.println(s2.indexOf('e'));
		//System.out.println(s2.indexOf('z'));
		//System.out.println(Driver.indexOf(s2, 'p'));
		//System.out.println(Driver.indexOf(s2, 'e'));
		//System.out.println(Driver.indexOf(s2, 'z'));
		System.out.println(Driver.removeVowels(s2));
		System.out.println(Driver.removeConsonants(s));
		System.out.println(Driver.removeDigits(s3));
	}

	//returns a new String with all of those vowels
	//removed from the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		String answer = ""; 
		ArrayList<Character> vowelsArrayList = new ArrayList<Character>();
		String vowels =  "AaEeIiOoUu";
		char [] vowelCharArray = vowels.toCharArray();
		for(int i = 0; i < vowelCharArray.length; i++){
			vowelsArrayList.add(vowelCharArray[i]);
		}
		answer = returnString(s, vowelsArrayList); 
		return answer; 

	}

	//returns a new String with all of those consonants
	//removed from the parameter String
	//"hello" -> eo
	static String removeConsonants(String s)
	{
		String answer = "";  
		ArrayList<Character> consonantsArrayList = new ArrayList<Character>();
		String consonants =  "BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz";
		char [] consonantsCharArray = consonants.toCharArray();
		for(int i = 0; i < consonantsCharArray.length; i++){
			consonantsArrayList.add(consonantsCharArray[i]);
		}
		answer = returnString(s, consonantsArrayList); 
		return answer; 

	}

	//returns a new String with all of those digits
	//removed from the parameter String
	//"he11o" -> heo
	static String removeDigits(String s)
	{
		String answer = "";  
		ArrayList<Character> numbersArrayList = new ArrayList<Character>();
		String numbers =  "1234567890";
		char [] numbersCharArray = numbers.toCharArray(); // ['1', '2', '3' ... '0']
		//before for loop numbersArrayList == [];
		for(int i = 0; i < numbersCharArray.length; i++){
			numbersArrayList.add(numbersCharArray[i]); 
		}
		//after for loop numbersArrayList ['1', '2', '3' ... '0']
		answer = returnString(s, numbersArrayList); 
		return answer; 

	}

	//return the first occurrence in s where c is found or -1 if
	//it was not found- we can't use String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}

	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}

	//this method should display on a single the input string
	//in reverse: "hello" -> "olleh"
	static String reverseString(String s)
	{
		String answer = "";
		for(int i = s.length() - 1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
	
	//helper method
	//returnString("hello", vowelsArrayList)
	private static String returnString(String s, ArrayList<Character> removeChars)
	{
		char [] sArray = s.toCharArray(); // ['h', 'e', 'l', 'l', 'o'] 
		ArrayList<Character> answerArrayList = new ArrayList<Character>(); //initializes answerArrayList
		
		for(int i = 0; i < sArray.length; i++){
			if(removeChars.contains(sArray[i]) == false){
				answerArrayList.add(sArray[i]);
				// i == 0 answerArrayList = ['h']
				// i = 1 answerArrayList = ['h']
				// i = 2 answerAL = ['h', 'l']
			}
		}
		//http://stackoverflow.com/questions/4389480/print-array-without-brackets-and-commas
		return answerArrayList.toString().replace(",", "").replace("[", "").replace(" ",  "").replace("]", "").trim();
	}
}
