package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> list)
    {
        return list.stream()
                .limit(2) // it will take first two element only and skip all remaining
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> list)
    {
        return list.stream()
                .skip(2) // it will skip first two element only and take all remaining
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,6,8,4,3);

        Optional<Integer> limitInt = limit(list);
        System.out.println("Limit Example="+limitInt.get());

        Optional<Integer> skip = skip(list);
        System.out.println("Skip Example="+skip.get());
    }
}
