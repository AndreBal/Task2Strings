import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Main.splitOddEven("hweolrllod");
		Main.countLettersPercentage("AAAAArllod");
		Main.deleteDuplicates("AArllllllllllllod");
		Main.countCharFrequency("AArllllllllllllod", 'l');
		Main.reverseString("word");
		Main.insertSubstring("Somethsing", "ingMis", 6);
		Main.deleteSubstring("Something", 2, 5);
		Main.copyStringPart("Something", 2, 3);
		Main.countStringtLength("Something");
		Main.countSubstringOccurrences("oraoraoraora", "ora");
		Main.printWordsReverse("One Two Three");
		Main.replaceSpace("Som   \\ethi 	ng");
		Main.replaceAwithB("One Two Thraeaea");
		Main.determineLengthShortest("One Two Three a");
		Main.countWords("One Two Three a");
		Main.swapWords("One Two");
		Main.deleteLast("One Two Three a");
		Main.insertSpace("OneTwo", 3);
		Main.checkIsPalindrome("anlna");
		Main.replaceSubstring("One Two", "Two");
		Main.addingVeryLongNumbers("123", "1239");
		Main.deleteWordsLength("One Two Three a", 3);
		Main.removeExtraSpaces("One     Two");
		Main.highligthWords("2354234One@#@# Two$%^$^hey#@hay");
	}

	public static void splitOddEven(String str) {
		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				odd.append(str.charAt(i));
			} else {
				even.append(str.charAt(i));
			}
		}
		System.out.println("odd: " + odd + " even: " + even);
	}

	public static void countLettersPercentage(String str) {
		int lowerCaseCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseCounter++;
			}
		}
		System.out.println("Percentage of lower case letters: " + lowerCaseCounter * 100 / str.length());
	}

	public static void deleteDuplicates(String str) {
		StringBuilder newString = new StringBuilder(str);
		char unicChar;
		for (int i = 0; i < newString.length(); i++) {
			unicChar = newString.charAt(i);
			for (int j = i + 1; j < newString.length(); j++) {
				if (newString.charAt(j) == unicChar) {
					newString.deleteCharAt(j);
					j--;
				}
			}
		}
		System.out.println("Old string: " + str + " New string: " + newString);
	}

	public static void countCharFrequency(String str, char ch) {
		int characterCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				characterCounter++;
			}
		}
		int frequency = characterCounter * 100 / str.length();
		System.out.println("Frequency of " + ch + " is " + frequency + " percent");
	}

	public static void reverseString(String str) {
		StringBuilder reverseStr = new StringBuilder(str);
		reverseStr.reverse();
		System.out.println("Old string " + str + ", reverse String " + reverseStr);
	}

	public static void insertSubstring(String str, String subString, int insertPosition) {
		StringBuilder insertResult = new StringBuilder(str);
		insertResult.insert(insertPosition, subString);

		System.out.println("Old string " + str + ", String after substring insertion: " + insertResult);
	}

	public static void deleteSubstring(String str, int start, int end) {
		StringBuilder result = new StringBuilder(str);
		result.delete(start, end);
		System.out.println("Old string " + str + ", new String: " + result);
	}

	public static void copyStringPart(String str, int start, int end) {
		String result = new String(str.toCharArray(), start, end);
		System.out.println("Old string " + str + ", result: " + result);
	}

	public static void countStringtLength(String str) {
		System.out.println("String length: " + str.length());
	}

	public static void countSubstringOccurrences(String str, String substring) {
		int counter = 0;
		str = str.replaceAll(substring, "~");

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '~') {
				counter++;
			}
		}

		System.out.println("The number of occurrences of a substring in a string is: " + counter);
	}

	public static void printWordsReverse(String str) {
		String[] words = str.split(" ");

		System.out.print("Words in reverse order are: ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		System.out.println("");
	}

	public static void replaceSpace(String str) {
		String result = str.replaceAll("\\s+", "*");
		System.out.println("Old string " + str + ", result: " + result);
	}

	public static void replaceAwithB(String str) {
		String[] words = str.split(" ");
		int biggestWordPosition = 0;
		int biggestWordSize = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > biggestWordSize) {
				biggestWordPosition = i;
			}
		}
		words[biggestWordPosition] = words[biggestWordPosition].replaceAll("a", "b");
		System.out.println(str + "->" + Arrays.toString(words));
	}

	public static void determineLengthShortest(String str) {
		String[] words = str.split(" ");
		int shortestWordSize = words[0].length();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < shortestWordSize) {
				shortestWordSize = words[i].length();
			}
		}
		System.out.println("Shortest word size is: " + shortestWordSize);
	}

	public static void countWords(String str) {
		String[] words = str.split(" ");
		System.out.println("Words number is: " + words.length);
	}

	public static void swapWords(String str) {
		String[] words = str.split(" ");
		String reverse = words[1] + " " + words[0];
		System.out.println(str + "--reverse-->" + reverse);
	}

	public static void deleteLast(String str) {
		String[] words = str.split(" ");
		String result = "";
		for (int i = 0; i < words.length - 1; i++) {
			result += words[i] + " ";
		}
		System.out.println(str + "--delete last word-->" + result);
	}

	public static void insertSpace(String str, int position) {
		StringBuilder result = new StringBuilder(str);
		result.insert(position, " ");
		System.out.println("Old string " + str + ", new String: " + result);
	}

	public static void checkIsPalindrome(String str) {
		StringBuilder result = new StringBuilder(str).reverse();
		System.out.println("String " + str + " is palindrome :" + str.equals(result.toString()));
	}

	public static void replaceSubstring(String str, String substring) {
		String result = str.replaceAll(substring, "REPLACED");
		System.out.println("Old string " + str + ", result: " + result);
	}

	public static void addingVeryLongNumbers(String first, String second) {
		StringBuilder result = new StringBuilder();
		int biggestNumberSize = first.length() > second.length() ? first.length() : second.length();
		int oneFromPreviousIteration = 0;
		for (int i = 0; i < biggestNumberSize; i++) {
			int number = 0;
			if (oneFromPreviousIteration != 0) {
				number++;
				oneFromPreviousIteration = 0;
			}
			if (first.length() > i) {
				number += Character.getNumericValue(first.charAt(first.length() - 1 - i));
			}
			if (second.length() > i) {
				number += Character.getNumericValue(second.charAt(second.length() - 1 - i));
			}
			if (number > 9) {
				oneFromPreviousIteration = 1;
			}
			result.insert(0, number % 10);

		}
		System.out.println("Result of adding " + first + " and " + second + " is " + result);
	}

	public static void deleteWordsLength(String str, int length) {
		String[] words = str.split(" ");
		String result = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != length) {
				result += words[i] + " ";
			}
		}
		System.out.println(str + "--delete words of length " + length + "-->" + result);
	}

	public static void removeExtraSpaces(String str) {
		String result = str.replaceAll("\\s+", " ");
		System.out.println("Old string " + str + ", result: " + result);

	}

	public static void highligthWords(String str) {
		String[] words = str.split("\\W|\\d");
		String result = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 0) {
				result += words[i].trim() + " ";
			}
		}
		System.out.println(str + "--Highlight words-->" + result);
	}

}
