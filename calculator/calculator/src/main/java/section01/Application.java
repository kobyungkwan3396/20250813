package section01;

import divison.division_class;
import minus.minus_class;
import mutiple.MutipleNumbers;
import plus.plus_class;

public class Application {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;

        plus_class plus = new plus_class();
        minus_class minus = new minus_class();
        MutipleNumbers multiple = new MutipleNumbers();
        division_class division = new division_class();

        System.out.println("덧셈 결과: " + plus.calculate(a, b));
        System.out.println("뺄셈 결과: " + minus.calculate(a, b));
        System.out.println("곱셈 결과: " + multiple.calculate(a, b));
        System.out.println("나눗셈 결과: " + division.calculate(a, b));

    }
}
