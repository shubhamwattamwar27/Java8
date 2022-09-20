import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeProgrammingEx2 {

    public static void main(String[] args) {
       /*
            Imperative style of programming
       */

        List<Integer> list = Arrays.asList(1,2,3,4,5,5,6,7,8,3,4,5,2);

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer data :list)
        {
            if(!uniqueList.contains(data))
                uniqueList.add(data);
        }

        System.out.println("uniqueList with Imperative approach=" +uniqueList);
        /*
            Declarative style of programming
       */

        List<Integer> uniqueList1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueList1 with Imperative approach=" +uniqueList1);
    }
}
