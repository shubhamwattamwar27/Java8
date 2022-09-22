package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollectionExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Test1");
        names.add("Test2");
        names.add("Test3");
        names.add("Test4");
        names.remove(0);
        System.out.println(names);

        //names.stream().add() / remove() is not possible, you can not add
        // or remove elements from stream

        for(String name : names)
            System.out.println(name);

        for(String name : names)
            System.out.println(name);

        Stream<String> streamName = names.stream();
        streamName.forEach(System.out::println);
        //streamName.forEach(System.out::println); // you will get exception because you can not
        // use stream multiple times
        /*
        * Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
	    at java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
	    at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
	    at Stream.StreamVsCollectionExample.main(StreamVsCollectionExample.java:29)
        * */

    }

}
