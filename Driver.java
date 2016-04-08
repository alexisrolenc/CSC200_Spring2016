
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		//Driver.displayString(s);
		//Driver.displayWithSpaces(s);
		Driver.displayInReverse(s);
		Driver.displayInReverse(s2);
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
	static void displayInReverse(String s)
	{
		String answer = "";
		for(int i = s.length() - 1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i) + answer;
		}
		System.out.println(answer);
	}
}
