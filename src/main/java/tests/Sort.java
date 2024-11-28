package tests;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> myList = List.of(3, 5, 3, 4, 6, 5, 7, 9, 6, 8);
        var result = Try.sort(myList);
        System.out.println(result);

        List<String> myList2 = List.of("a", "g", "a", "e", "a", "g", "w");
        var result2 = Try.sort(myList2);
        System.out.println(result2);
    }
}

class Try {
    public static <T> List<T>  sort(List<T> notSorted) {

        List<T> result = new ArrayList<>();
        for (T e : notSorted) {
            if (!result.contains(e)) {
                result.add(e);
            }
        }
        return result;
    }
}