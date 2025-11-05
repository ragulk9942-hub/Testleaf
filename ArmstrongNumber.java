package assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
        int num = 153; // you can change this number
        int originalNum = num;
        int remainder, result = 0;

        while (num != 0) {
            remainder = num % 10;
            result += remainder * remainder * remainder;
            num /= 10;
        }

        if (result == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is not an Armstrong number.");
    }

}
