/*
@Author pratik katariya
@Date 1-01-2020
*/
import java.util.*;
public class PrimeNumber {
	public static void main(String...rDx) {
		System.out.println(new PrimeNumber().primeList().toString());
	}

	public ArrayList<Integer> primeList() {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					isPrime = false;
				}
			}
			if (isPrime)
				list.add(i);
		}

		return list;
	}
}