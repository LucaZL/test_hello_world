

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6};

        Optional<BigDecimal> t = Optional.ofNullable(null);
        t = Optional.empty();
        System.out.println(!t.isPresent());
        t = Optional.of(new BigDecimal(1000));
        if(t.isPresent() && t.get().compareTo(BigDecimal.ZERO)>0) {
            System.out.println("get it");
        }


        List<Integer> list = Arrays.asList(a);
        List<Integer> list2 = list.stream().filter(e-> e>2).map(x -> x+1).collect(Collectors.toList());
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = stream.filter(e-> e>2);
        System.out.println(stream.getClass());
        System.out.println(stream2.getClass());
        List<Integer> list3 = stream2.filter(e -> e>5).collect(Collectors.toList());
        System.out.println(list3);

        System.out.println(list2);
        BigDecimal b = new BigDecimal(0);
        if(b!=null) {
            System.out.println(b.compareTo(BigDecimal.ZERO));
        }
    }
}
