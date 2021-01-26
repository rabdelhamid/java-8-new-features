import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//https://www.baeldung.com/java-8-streams
public class StreamsConcepts {

    public static void main(String[] args)
    {
        StreamLaziness streamLaziness=new StreamLaziness();

        //streamLaziness.callLazystream();
        //System.out.println("counter :" + streamLaziness.getCounter());

        //streamLaziness.callEvaluatedstream();
        //System.out.println("counter after evaluated stream intermediate operations:" + streamLaziness.getCounter());

        //INFINITE STREAMS
       // streamLaziness.createInfiniteStream();


        //streamTraversal
        StreamTraversal streamTraversal=new StreamTraversal();
       streamTraversal.traverse();
    }



}
