package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/8/17.
 *
 * 2) Write a function truncate(String input, int truncateBy) to truncate a string if it is longer than
 * the specified number of characters. The function should take two arguments, the first argument being
 * the string and the second argument being the number of characters to truncate the string by.
 * Truncated strings should end with an ellipsis sequence ("..."). If the specified number is large than
 * the length of the string, the entire string should be returned.
 */
public class Exer2 {

    public String truncate(String input, int truncateBy){

        if (input.length() > truncateBy){
            String newInput = input.substring(0,truncateBy)+"...";
            return newInput;
        }else
            return input;
    }
}
