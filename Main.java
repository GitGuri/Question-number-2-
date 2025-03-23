import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main{
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(7);
        numbers.add(25);
        numbers.add(13);
        numbers.add(15);

        List<Integer> divisableFive = numbers.stream().filter(number -> number% 5 == 0).collect(Collectors.toList());

        System.out.println("Divisable by Five:"+ divisableFive );

    }
}