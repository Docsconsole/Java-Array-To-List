package docsconsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListExample {
    public static void main(String[] args) {

        Integer[] numbers1 = new Integer[] { 1, 2, 3 };
        List<Integer> list1 = new ArrayList<>();
        for (Integer item: numbers1 )
            list1.add(item);
        list1.stream().forEach(System.out::println);

        Integer[] numbers2 = new Integer[] { 4, 5, 6 };
        List<Integer> list2 = Arrays.asList(numbers2);
        list2.stream().forEach(System.out::println);

        Integer[] numbers3 = new Integer[] { 4, 5, 6 };
        List<Integer> list3 = new ArrayList<>(Arrays.asList(numbers3));
        list3.stream().forEach(System.out::println);

        Integer[] numbers4 = new Integer[] { 7,8,9 };
        List<Integer> list4 = Arrays.stream(numbers4)
                .collect(Collectors.toList());
        list4.stream().forEach(System.out::println);

        int[] numbers5 = { 10, 11, 12 };
        List<Integer> list5 = Arrays.stream(numbers5)
                .boxed()
                .collect(Collectors.toList());
        list5.stream().forEach(System.out::println);

        String[] Strings = {"13", "14", "15"};
        List<String> stringList = List.of(Strings); // immutable list
        stringList.stream().forEach(System.out::println);

        Integer[] numbers6 = new Integer[] { 7,8,9 };
        List.copyOf(Arrays.asList(numbers6)); // immutable list
        Arrays.stream(numbers6).collect(Collectors.toUnmodifiableList());

    }
}
