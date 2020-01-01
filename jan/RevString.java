/*
@Author pratik katariya
@Date 1-01-2020
*/
import java.util.*;
public class RevString {
	public static void main(String...rDx) {
		System.out.println(new RevString().rev("pratik."));
	}

	public String rev(String in_var) {
		StringBuilder build = new StringBuilder();

		for (int i = in_var.length()-1; i >= 0; i--) {
			build.append(in_var.charAt(i));
		}
		return build.toString();
	}
}