package io.github.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David","Anna"));
        List<String> result = names.stream()
                                    .filter(name->name.startsWith("A"))
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());

        //Calculate total length of names
        int totalLength=names.stream()
                                .mapToInt(String::length)
                                .sum();

        //Stream-builder
        Stream<String> builtStream = Stream.<String>builder()
                                            .add("First")
                                            .add("Second")
                                            .build();
        System.out.println(builtStream);
    }

}
