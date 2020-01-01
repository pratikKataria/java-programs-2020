/*
@Author pratik katariya
@Date 1-01-2020
*/
public class StringPalindrome {
	public static void main(String...sd ) {
		System.out.println(new StringPalindrome().isPalindrome("aaaabbbbaaaa"));
	}

	public boolean isPalindrome(String input) {
		return new StringBuilder().append(input).reverse().toString().equals(input);
	}
}