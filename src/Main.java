import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9,10};
        Stream.of(integers).map(v->v%2!=0?null:v*v).forEach(System.out::println);
        Optional<Integer> optional = Stream.of(integers).max((x,y)->Integer.compare(x,y));
        System.out.println(optional);
    }
}