package ExStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Given a list of strings, write a stream pipeline that converts all the strings to uppercase and collects them into a new list.
        List<String> strings=new ArrayList<>();
        strings.add("level");
        strings.add("Power");
        strings.add("succes");
        strings.add("lettER");

        List<String> upperCases=strings.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println( "The strings with uppercases are : " + upperCases);

        //Given a list of integers, write a stream pipeline that filters out the even numbers and then squares the remaining numbers.

        System.out.println();
        List<Integer> integers=new ArrayList<>();
        integers.add(25);
        integers.add(4);
        integers.add(13);
        integers.add(100);

        System.out.println("The inial list is : " + integers);
        List<Integer> integerList=integers.stream()
                .filter(s->s%2 !=0)
                .map(integer -> integer*integer)
                .toList();

        System.out.println("The filtered list : " +  integerList);
        System.out.println();

        //Given a list of integers, write a stream pipeline that finds the maximum value.

        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(20);
        numbers.add(25);
        numbers.add(40);
        numbers.add(25);
        numbers.add(32);

        Optional<Integer> maxNumber=numbers.stream()
                .max(Comparator.naturalOrder());

        System.out.print("Max number is :");
        maxNumber.ifPresent(System.out::println);
        System.out.println();

        //Given a list of integers, write a stream pipeline that calculates the sum of all the integers.

        Integer sum=numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("The numbers are : " + numbers);
        System.out.println("Sum of the numbers is : " + sum);

        System.out.println();

        //Given a list of integers, write a stream pipeline that removes duplicates and collects the unique integers into a list.

        System.out.println("The string is : "+ numbers);
        List<Integer>uniqueNumbers=numbers.stream()
                .distinct()
                .toList();

        System.out.println("The string without duplicates : "+ uniqueNumbers);
    }
}
