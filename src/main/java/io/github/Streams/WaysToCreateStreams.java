package io.github.Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysToCreateStreams {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Stream<String> streamList= list.stream();
        //same happens for set

        String[] arrays = {"A", "B", "C"};
        Stream<String> streamArrays=Arrays.stream(arrays);
        //Arrays don’t have .stream(), so we use Arrays.stream().

        //Passing values to a stream directly
        Stream<String> words=Stream.of("Hello", "World");

        //Stream-builder, manually add elements one-by-one
        //Used when elements are generated dynamically and you 
        // cannot prepare them all at once
        Stream<String> built=Stream.<String>builder()
                                    .add("Hello")
                                    .add("World")
                                    .build();
        
        //Use .generate to create Infinite Streams
        Stream<Double> infinity=Stream.generate(Math::random).limit(10);

        //.iterate
        Stream<Integer> iteratorx=Stream.iterate(1, n->n+1).limit(10);

        //Primitive streams
        IntStream intStream = IntStream.range(1, 6);  // 1,2,3,4,5
    }

}
