package collections.task1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Yuliia Tesliuk on 10/28/2018
 */
public class NumberOfRepetitions {
    public static void main(String[] args) {


        Random random = new Random();
        ArrayList<Integer> arrayList = IntStream.generate(() -> random.nextInt(10))
                .limit(10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("array: \n" + Arrays.toString(arrayList.toArray()));



        System.out.println("number of repetitions:\n" + arrayList.stream()
                .collect(Collectors.groupingBy(x -> x,
                Collectors.counting())).toString());


    }
}
