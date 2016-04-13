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
		//System.out.println(Driver.removeVowels(s2));
		//System.out.println(Driver.removeConsonants(s));
		//System.out.println(Driver.removeDigits(s3));
		Driver.stringToInt(s3);
	}
	
	//return the integer version of the char parameter
	static int charToInt(char c)
	{
		return "0123456789".indexOf(c);
	}
	
	//converts s, which is a string representation
	//of an int into int representation
	//"124" -> 124
	static int stringToInt(String s)
	{ 	int place = 1;
		int runningTotal = 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
	        runningTotal += (s.charAt(i) - '0') * place;
	        place *= 10;
	    }
	    return runningTotal;

	}
	static String removeChars(String s, String charsToRemove)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i++)
		 {
			if(charsToRemove.indexOf(s.charAt(i)) == -1)
			{
			answer = answer + s.charAt(i);
			}
		}
		return answer;
	}
	
	static String removeVowels(String s)
	{
		return Driver.removeChars(s, "AaEeIiOoUu");
	}

	static String removeConsonants(String s)
	{
		return Driver.removeChars(s, "BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz"); 
	}
	
	static String removeDigits(String s)
	{
		return Driver.removeChars(s, "1234567890");
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
