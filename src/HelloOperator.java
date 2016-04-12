import java.util.Scanner;

/**
 * Follow the instructions in the comments below.
 * Only add one line per comment. The output from this program should be:
 *
 *      134.4
 *      true
 *      125.19999999999999=125.2? false
 *      425.0
 *      425.0
 *      false
 *      false
 *      true
 *      false
 */


public class HelloOperator {

    public static void main(String[] args){

        // Create a variable named "result". Set it to 504.
        double result = 504;

        // Divide "result" by 10 and then add 84 to it.
        result = result / 10d + 84;

        // output "result" to the console
        System.out.println(result);

        // create a new variable named "expected". Set this to 134.4.
        double expected = 134.4;

        // create a variable named "matches". Compare "result" and "expected". If they're the same then set "matches" to true.
        boolean matches = result == expected;

        // output whether or not the two variables match
        System.out.println(matches);

        // reset "result" to 125.1
        result = 125.1;

        // reset "expected" to 125.3
        expected = 125.3;

        // add 0.1 to "result"
        result = result + 0.1;

        // subtract 0.1 from "expected"
        expected = expected - 0.1;

        // Compare "result" and "expected". If they're the same then set "matches" to true.
        matches = result == expected;

        // output the value of "result", the value of "expected", and the whether or not they are equal. (EG: "result=expected? matches")
        System.out.println(result + "=" + expected + "? " + matches);

        // Start with 56. Multiply it by the sum of 50 and 26. Subtract 6 from that. Divide this by the remainder left over when you divide 723 by 23. Set "result" to the resulting value.
        result = (56 * (50 + 26) - 6) / (723d % 23);

        // output "result"
        System.out.println(result);

        // Add 1203 and 72. Divide the total by 3 and set "expected" to the result.
        expected = (1203 + 72) / 3;

        // output "expected"
        System.out.println(expected);

        // Output true if "result" is greater than "expected"
        System.out.println(result > expected);

        // Output true if "result" is less than "expected"
        System.out.println(result < expected);

        // Output true if "result" is equal to "expected"
        System.out.println(result == expected);

        // Output false if either "result" or "expected" are equal to 425
        System.out.println(result != 425 && expected != 425);

    }

}
