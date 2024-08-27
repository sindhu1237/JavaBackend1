package Streams.DemoOnStreams;
import java.util.stream.Stream;
import java.util.*;
// Wrapper on data source for operations on data.
public class HowToCreateStreams {
    public static void main(String[] args) {
        // Array to Streams
        Integer arr[]={10,20,30,40,50};
        Stream<Integer> s1=Stream.of(arr);
        // Items to Streams
        Stream<Integer> s2=Stream.of(10,20,30,40,50);
        // List or Collection to Stream
        List<Integer> list=Arrays.asList(10,20,30,40,50);
        Stream<Integer> s3=list.stream();

        // use builder to create Streams
        Stream.Builder<Integer> sb=Stream.builder();
        sb.accept(10);
        sb.accept(20);
        sb.accept(30);
        sb.accept(40);
        sb.accept(50);
        Stream<Integer> s4=sb.build();
    }
}
