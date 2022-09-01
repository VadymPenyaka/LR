import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LucasNumber {
    private int number;
    private int value;

    LucasNumber(int number) {
        this.number = number;
        this.value = (int) (pow(-1, number) * (pow((1 + sqrt(5)) / 2, number) + pow(-((1 + sqrt(5)) / 2), -number)));
        ;
    }

    int getNumber() {
        return number;
    }

    int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<LucasNumber> lucasNumbers = new ArrayList<>();

        System.out.println("Enter a negative number of  Luke numbers:");
        int number = obj.nextInt();

        if (number > 0) {
            System.out.println("Entered number greater than zero");
            return;
        }

        number *= -1;
        System.out.println("First " + number + " numbers of Luke numbers for negative N:");
        for (int i = 0; i < number; i++)
            lucasNumbers.add(new LucasNumber(i));

        for (LucasNumber element : lucasNumbers)
            System.out.print(element.getValue() + " ");

    }

}
