/*
@Author pratik katariya
@Date 1-01-2020
*/
import java.util.*;
public class Fibbo {
	public static void main(String...asd ) {
		System.out.println(new Fibbo().fib(10).toString());
	}

	public ArrayList<Integer> fib(int till) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(0, 1));
		for (int i = 1; i < till; i++) {
			number.add(number.get(i-1) + number.get(i));
		} 
		return number;
	}
}