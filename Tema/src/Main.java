import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create a Runnable that prints "Hello, World!" using a lambda expression.
        Runnable helloRunnable = () -> System.out.println("Hello Word");

        Thread thread = new Thread(helloRunnable);
        thread.start();

        // Create a Comparator<String> using a lambda expression that compares strings based on their length.
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Please enter first string :");

        String string1 = scanner.nextLine();
        System.out.print("Please enter second string :");
        String string2 = scanner1.nextLine();

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
    }
}

