/*
@Author pratik katariya
@Date 1-01-2020
*/
public class DistinctAlphabet {
	public static void main(String...saf ) {
		System.out.println(new DistinctAlphabet().distinct("aaaBcccv"));
	}

	public int distinct(String input) {
		input = input.toLowerCase();
		int countDist = 0;

		for (int i = 0; i < input.length(); i++) {
			boolean isDistinct = true;
			for (int j = 0; j < input.length(); j++) {
				if (j!=i && String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(j)))) {
					isDistinct=false;
				}
			}
			if (isDistinct) {
				countDist+=1;
			}
		}

		return countDist;
	}
}