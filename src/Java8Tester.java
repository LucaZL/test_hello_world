import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Tester {
    public static void main(String args[]){

        int[] A = {2,3,4,2,3,4,5,7,5};

        Set<Integer> set = new HashSet<Integer>();
        int num = 0;
        for(int i: A) {
            if(set.contains(i)) {
                num -= i;
                set.remove(i);
            }else{
                num += i;
                set.add(i);
            }
        }
        System.out.println(num);
        IntStream intStream = Arrays.stream(A);
//        intStream.forEach(i -> System.out.println(i));
        Map<Integer, Long> map = intStream.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Integer> result = map.entrySet().stream().filter(p -> p.getValue() % 2 == 1).map(p -> p.getKey()).max(Comparator.comparing(Function.identity()));
        System.out.println(result.get());
//        System.out.println(list);
//        Java8Tester tester = new Java8Tester();
//
//        // 类型声明
//        MathOperation addition = (int a, int b) -> a + b;
//
//        // 不用类型声明
//        MathOperation subtraction = (a, b) -> a - b;
//
//        // 大括号中的返回语句
//        MathOperation multiplication = (int a, int b) -> { return a * b; };
//
//        // 没有大括号及返回语句
//        MathOperation division = (int a, int b) -> a / b;
//
//        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
//        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
//        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
//        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
//
//        // 不用括号
//        GreetingService greetService1 = message ->
//                System.out.println("Hello " + message);
//
//        // 用括号
//        GreetingService greetService2 = (message) ->
//                System.out.println("Hello " + message);
//
//        greetService1.sayMessage("Runoob");
//        greetService2.sayMessage("Google");
    }

    interface MathOperation {
        int testMethod(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.testMethod(a, b);
    }
}
