import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        IntegerValidator isPositive = (value) -> value >= 0;
        int value = reader.readInt("GIVE ME A POSITIVE NUMBER", isPositive);
        System.out.println("NUMBER: " + value);
    }

    Scanner scanner = new Scanner(System.in);
    public int readInt(String prompt) {
        System.out.print(prompt + ": ");
        int value = scanner.nextInt();
        scanner.nextLine();

        return value;
    }

    public int readInt(String prompt, IntegerValidator validator) {
        boolean valid = false;
        while(!valid) {
            System.out.print(prompt + ": ");
            int value = scanner.nextInt();
            scanner.nextLine();
            boolean isValid = validator.validate(value);
            if (isValid) return value;
        }
        return -1;
    }

//    public int readPositiveInt(String prompt) {
//        System.out.print(prompt + ": ");
//        int value = scanner.nextInt();
//        scanner.nextLine();
//        if (value < 0)
//        // DO VALIDATIONS HERE
//        return value;
//    }

}
@FunctionalInterface
interface IntegerValidator {
    boolean validate(int value);
}
