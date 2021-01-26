import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamLaziness {

    private long counter=0;
    private List<String> list = Arrays.asList("abc1","abc2","abc3");

    public StreamLaziness() {

    }
//getter&setter
    public long getCounter() {
        return counter;
    }
    public void setCounter(long counter) {
        this.counter = counter;
    }
//private methods
    private  void wasCalled() {
        counter++;
    }
    //public methods
   //example 1
    public  void callLazystream()
    {

        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            System.out.println("counter in intermediate operations:" + counter);
            return element.contains("2");
        });

        System.out.println("counter in intermediate operations:" + counter);
    }
    public  void callEvaluatedstream()
    {

        Optional<String> stream = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        }).map(element -> {
            return element.toUpperCase();
        }).findFirst();

       System.out.println("counter in terminal operations:" + counter);
    }
//example 2

    public  void createInfiniteStream()
    {
       List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
        List<Integer> collect = infiniteStream
                .filter(t->t %2==0)
                .limit(10)
                .collect(Collectors.toList());


        collect.forEach(System.out::println);


        //assertEquals(collect, Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18));
    }
}
