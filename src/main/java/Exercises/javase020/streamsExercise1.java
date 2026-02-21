package Exercises.javase020;

import java.util.*;
import java.util.stream.*;


public class streamsExercise1 {
    public static void main(String[] args) {
        
    }
    //Combine multiple stream sources
    public static void streamCombine(){
        Stream<String> stream1=Stream.of("A", "B", "C", "D");
        Stream<String> stream2=Stream.of("E", "F");
        Stream<String> stream3=Stream.of("G");

        Stream<String> combined =
                Stream.of(stream1, stream2, stream3)
                .flatMap(s->s);


    }

    //Streams from different collection types
    public static void diffCollections(){
        Set<String> set1=new HashSet<>();
        Stream<String> setStream=set1.stream();

        String[] array = {"1","2","3"};
        Stream<String> streamArray=Arrays.stream(array);
    }

    //Primitive Streams with ranges
    public static void primitiveStreams(){
        IntStream numbers = IntStream.range(1, 6);
        LongStream longed = LongStream.rangeClosed(1,5);
        DoubleStream doubled = DoubleStream.of(1.1, 1.2);
    }

    //infinite streams
    public static void infinites(){
        Stream<Double> infinityx=Stream.generate(Math::random).limit(10);
        Stream<Integer> iterator=Stream.iterate(1, n->n+1).limit(5);
    }

    

}
