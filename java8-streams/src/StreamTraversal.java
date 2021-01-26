import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTraversal {

    public StreamTraversal() {

    }

   //stream traversal
    public  void traverse()
    {
        System.out.println("First Stream Traversal" );
        List<Integer> numbers = Arrays.asList(4, 2, 8, 9, 5, 6, 7);
        Stream<Integer> numbersGreaterThan5 = numbers.stream().filter(i -> i > 5);
        //Traversing numbersGreaterThan5 stream first time
        numbersGreaterThan5.forEach(System.out::println);
        //Second time traversal will throw error
        //Error : stream has already been operated upon or closed
    //    System.out.println("Second Stream Traversal" );
       // numbersGreaterThan5.forEach(System.out::println);
    }

}
