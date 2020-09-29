package Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 1;
        int x = 2;
        ZeroArgument z = () -> "Det virker det pis";
        OneArgument o = (int y) -> y%2 == 0;
        TwoArguments t = (int j, int p) -> j+p;
        System.out.println(z.zeroArg());
        System.out.println(o.oneArg(x));
        System.out.println(t.twoArg(i, x));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(i);
        numbers.add(x);

        List<Integer> numberStream = numbers.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
        System.out.println(numberStream);

    }
}
