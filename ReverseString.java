
public class ReverseString {
	ublic class ReverseTHeString {

		public static void main(String[] args) {

			// to declare the string variable
			String name = "vinoth";

			// to split the string values into separate character
			char[] charArray = name.toCharArray();

			// to iterate
			for (int i = charArray.length - 1; i >= 0; i--) {

				// to get the each character by index

				char charAt = charArray[i];
				// to print the output
				System.out.println(charAt);

			}

		}

	}

}
