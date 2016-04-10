
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
		Driver.removeVowels(s2);
		Driver.removeConsonants(s);
		Driver.removeDigits(s3);
	}
	
	//returns a new String with all of those vowels
	//removed from the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		String answer = ""; 
		answer = answer.replaceAll("AaEeIiOoUu", ""); 
		return answer; 

	}
	
	//returns a new String with all of those consonants
	//removed from the parameter String
	//"hello" -> eo
		static String removeConsonants(String s)
		{
			String answer = ""; 
			answer = answer.replaceAll("BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz", ""); 
			return answer; 

		}
	
	//returns a new String with all of those digits
	//removed from the parameter String
	//"he11o" -> heo
		static void removeDigits(String s)
		{
			String answer = ""; 
			answer = answer.replace("1234567890","");	 
			System.out.println(answer);

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
}
