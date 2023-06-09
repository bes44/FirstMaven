import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HelloWorld {
    private static <T> Set<T> findCommonElements(List<T> first, List<T> second) {
        return new HashSet<>(CollectionUtils.intersection(first, second));
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 3, 1, 6, 5, 7, 3);
        List<Integer> second = Arrays.asList(2, 3, 4, 5, 3);

        Set<Integer> common = findCommonElements(first, second);
        System.out.println(common);
    }


}
