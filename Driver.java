import java.util.*;

public class Driver 
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = new int[10];
		Driver.fillArrayWithRandomInts(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
		Driver.bubbleSort(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
	}
	
	static void bubbleSort(int[] arrayOfNumbers) 
	{ 
		int i;
		boolean j = true;
		int bubble;

		while(j)
		{
			j = false;
			for(i = 1; i < arrayOfNumbers.length; i++)
			{
				if(arrayOfNumbers[i] < arrayOfNumbers[i-1])
				{
					bubble = arrayOfNumbers[i-1];
					arrayOfNumbers[i-1] = arrayOfNumbers[i];
					arrayOfNumbers[i] = bubble;
					j = true;
				}
			}
		}
	}  

	static void sortArray(int[] ar)
	{
		//put the elements of the array in order SOMEHOW!!!
		for (int i = 1; i < ar.length; i++)
		{ 
			int numbers = ar[i]; 
			while ((i > 0) &&  (ar[i-1] > numbers))
			{ 
				ar[i] = ar[i-1]; 
				i--; 
			} 
		ar[i] = numbers; 
 		} 

	}
	
	static void fillArrayWithRandomInts(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(101);
		}
	}
	
	static void printIntArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	static String charArrayToString(char[] ar)
	{
		String answer = "";
		for(int i = 0; i < ar.length; i++)
		{
			answer += ar[i];
		}
		return answer;
	}
	static char[] stringToCharArray(String s)
	{
		return  s.toCharArray(); // ['h', 'e', 'l', 'l', 'o']
	}
	
	static String substring(String s, int beginPos, int endPos)
	{
		String answer = "";
		for(int i = beginPos; i < endPos; i++)
		{
			answer += s.charAt(i);
		}
		return answer;
	}
	static String substring(String s, int pos)
	{
		String answer = "";
		for(int i = pos; i < s.length(); i++)
		{
			answer += s.charAt(i);
			//answer = answer + s.charAt(i)
		}
		return answer;
	}
	static String decimalToBase(int decimalNumber, int radix )
	{
		String result = "";
		while(decimalNumber != 0)
		{
			int remainder = decimalNumber % radix;
			result = Driver.intToChar(remainder) + result;

			decimalNumber = decimalNumber / radix;
			
		}
		return result;
	}
	
	static char intToChar(int val)
	{
		return ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").charAt(val);
	}
	
	static int baseToInteger(String s, int radix)
	{
		int place = 1; 
		int runningTotal = 0; 
		char currChar;
		for (int i = s.length()-1; i >= 0; i--) 
		{ 
			currChar = s.charAt(i);
			currChar = s.charAt(i);
			runningTotal += (Driver.charToInt(currChar)) * place;
			place *= radix;
		}
		return runningTotal; 
	}
	
	static int hexToInteger(String hex)
	{
		int place = 1; 
		int runningTotal = 0; 
		char currChar;
		for (int i = hex.length()-1; i >= 0; i--) 
		{ 
			currChar = hex.charAt(i);
			currChar = hex.charAt(i);
			runningTotal += (Driver.charToInt(currChar)) * place;
			place *= 16;
		}
		return runningTotal; 
			 
	}
	static int octalToInteger(String oct)
	{
		int place = 1; 
		int runningTotal = 0; 
		char currChar;
		for (int i = oct.length()-1; i >= 0; i--) 
		{ 
			currChar = oct.charAt(i);
			if(currChar == '-')
			{
				currChar = oct.charAt(i);
				runningTotal += (Driver.charToInt(currChar)) * place;
				place *= 8;
				
			}
			 
			 
		}
	    return runningTotal;
	}
	//this guy should take a String representation of a binary number 
	//as a parameter and return as a int the decimal equivalent 
	//"1011" -> 11 
	static int binaryToInteger(String bin) 
 	{ 	 
		int place = 1; 
		int runningTotal = 0; 
		char currChar;
		for (int i = bin.length()-1; i >= 0; i--) 
		{ 
			currChar = bin.charAt(i);
			if(currChar == '-')
			{
				return runningTotal * -1;
			}
			runningTotal += (Driver.charToInt(currChar)) * place; 
			place *= 2; 
		}
	    return runningTotal;
 	} 

	//return the integer version of the char parameter
	static int charToInt(char c)
	{
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c);
	}
	
	//converts s, which is a string representation
	//of an int into int representation
	//"124" -> 124
	static int stringToInt(String s)
	{ 	int place = 1; 
		int runningTotal = 0; 
		char currChar;
		for (int i = s.length()-1; i >= 0; i--) 
		{ 
			currChar = s.charAt(i);
			if(currChar == '-')
			{
				return runningTotal * -1;
			}
			runningTotal += (Driver.charToInt(currChar)) * place; 
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
