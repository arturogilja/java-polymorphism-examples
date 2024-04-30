import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functions {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        var doubleNumbers = doubleAndFilterPairNumbers(numbers);

        for (int number : doubleNumbers) {
            System.out.println("Number: " + number);
        }

    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        var doubledNumbers = numbers
                .stream()
                .map((number) -> number * 2)
                .collect(Collectors.toList());

        return doubledNumbers;

//        List<Integer> doubledNumbers = new ArrayList<>();
//
//        for(int number : numbers) {
//            doubledNumbers.add(number * 2);
//        }
//
//        return doubledNumbers;
    }

    public static List<Integer> doubleAndFilterPairNumbers(List<Integer> numbers) {
        var doubledNumbers = numbers
                .stream()
                .filter((number) -> number % 2 == 0)
                .map((number) -> number * 2)
                .collect(Collectors.toList());

        return doubledNumbers;

//        List<Integer> doubledNumbers = new ArrayList<>();
//
//        for(int number : numbers) {
//            if (number % 2 == 0) doubledNumbers.add(number * 2);
//        }
//
//        return doubledNumbers;
    }



}
