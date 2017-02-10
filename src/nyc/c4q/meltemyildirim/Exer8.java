package nyc.c4q.meltemyildirim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meltemyildirim on 2/9/17.
 *
 * 8) Write a function decode(code) that decodes a string of 0's and 1's into a two-digit number.
 * The input string will consist of a sequence of 0's - representing the first digit, followed by a sequence
 * of 1's - representing the second digit. Return an array which contains both digits.
 *
 For example, the string:
 "0001111"
 Represents the number 34, and will be returned in an array: [3, 4]
 *
 */
public class Exer8 {

    public List<Integer> decode(String code) {

        List<Integer> numArray = new ArrayList<Integer>();
        int zeros = 0; //sum of 0's
        int ones = 0; //sum of 1's

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '0') {
                zeros++;
            } else
                ones++;
        }
        numArray.add(zeros);
        numArray.add(ones);
        return numArray;
    }
}
