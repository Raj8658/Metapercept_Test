import java.util.Scanner;

class NumberInput {
    private int num1, num2;

    public void acceptNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}

class LastDigitFetcher {
    public int[] getLastDigits(int num1, int num2) {
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        return new int[]{lastDigit1, lastDigit2};
    }
}

class DigitMultiplier {
    public int multiplyDigits(int[] digits) {
        return digits[0] * digits[1];
    }
}

public class Fourth_NumberProcessor {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        numberInput.acceptNumbers();

        LastDigitFetcher digitFetcher = new LastDigitFetcher();
        int[] lastDigits = digitFetcher.getLastDigits(numberInput.getNum1(), numberInput.getNum2());

        DigitMultiplier digitMultiplier = new DigitMultiplier();
        int result = digitMultiplier.multiplyDigits(lastDigits);

        System.out.println("Result of multiplying the last digits: " + result);
    }
}