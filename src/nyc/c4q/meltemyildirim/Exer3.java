package nyc.c4q.meltemyildirim;

import java.util.HashMap;

/**
 * Created by meltemyildirim on 2/8/17.
 *
 * 3) Write a function called checkUnique(String input) that takes in a string as an argument and
 * checks if the string has all unique characters. In other words, the function should check to make sure
 * there are no duplicate characters in the string. If the string's characters are all unique,
 * the function should return true. Otherwise it should return false.
 */
public class Exer3 {

    public boolean checkUnique(String input) {
        HashMap<String, Integer> charMap = new HashMap<>();
        if (input.equals("")) {
            return true;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (!(charMap.containsKey(input.charAt(i) + ""))) {
                    charMap.put(input.charAt(i) + "", 1);
                } else
                    return false;

            }
        }
        return true;
    }
}
