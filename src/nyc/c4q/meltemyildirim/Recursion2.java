package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/10/17.
 *
 * 2) Write a recursive function to reverse the words in a string, i.e., ”cat is running” becomes ”running is cat”.
 *
 */
public class Recursion2 {
    public String reverseWords ( String input , String delimeter){
        int position = input.indexOf(delimeter);
        if ( position > 0 ){

            return reverseWords(input.substring(position), delimeter) +  input.substring(0, position -1);

        }else {
            return input;
        }
    }
}
