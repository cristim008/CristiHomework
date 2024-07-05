package TemaLambda;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //Create a Runnable that prints "Hello, World!" using a lambda expression.
        Runnable helloRunnable = () -> System.out.println("Hello Word");

        Thread thread = new Thread(helloRunnable);
        thread.start();


        // Create a Comparator<String> using a lambda expression that compares strings based on their length.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first string :");

        String string1 = scanner.nextLine();
        System.out.print("Please enter second string :");
        String string2 = scanner.nextLine();

        List<String> strings = new ArrayList<>();
        strings.add(string1);
        strings.add(string2);

        Comparator<String> stringComparator = (a, b) -> {
            return Integer.compare(a.length(), b.length());
        };
        int comparisonResult = stringComparator.compare(string1, string2);
        if (comparisonResult > 0) {
            System.out.println("First string is higher");
            System.out.println("The string is : " + string1);
        } else if (comparisonResult < 0) {
            System.out.println("Second string is higher");
            System.out.println("The string is : " + string2);
        } else {
            System.out.println("Strings are equal");
        }
        strings.sort(stringComparator);
        System.out.println("Sorted strings based on their length = " + strings);

        //Create a Function<String, Integer> using a lambda expression that takes a string and returns its length.

        Function<String, Integer> stringLength = a -> a == null || a.isEmpty() ? 0 : a.length();
        System.out.println("The string is : " + string1);
        System.out.println("The string length is : " + stringLength.apply(string1));
        System.out.println("The string lentgh is : " + stringLength.apply(null));

        //Create a BiPredicate<String, String> using a lambda expression that tests whether the first string is longer than the second string.

        BiPredicate<String, String> longerString = (a, b) ->
                a.length() > b.length();
        System.out.println("Is first string longer than  the second string ? " + "Response : " + longerString.test(string1, string2));


        //Create a UnaryOperator<Integer> using a lambda expression that squares an integer.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner2.nextInt();
        UnaryOperator<Integer> squareOfTheNumber = s -> s * s;
        System.out.println("The square of the number is :  " + squareOfTheNumber.apply(number));

        //Create a BinaryOperator<Integer> using a lambda expression that adds two integers.

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("First number : ");
        int number2 = scanner3.nextInt();
        System.out.print("Second number : ");
        int number3 = scanner3.nextInt();
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        //BinaryOperator<Integer> sum = Integer::sum;
        System.out.println("Sum of the numbers  : " + sum.apply(number2, number3));

        //Given a list of strings, use a lambda expression to sort the list in reverse alphabetical order.

        List<String> stringList = new ArrayList<>();
        stringList.add("seven");
        stringList.add("american");
        stringList.add("night");

        Collections.sort(stringList, (s1, s2) -> s2.compareTo(s1));

        System.out.println(stringList);
    }
}
