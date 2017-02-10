package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/9/17.
 * Write a method that takes a string parameter. For longer strings, the method returns a new string constructed
 * out of the first three letters of the argument, followed by three periods ("..."),
 * followed by the last letter of the argument.
 * However, if the resulting string is not shorter than the argument, the method should return the argument instead.
 */
public class Exer4 {

    public String elide(String word){
        String newStr = word.substring(0,3)+"..."+ word.substring(word.length()-1, word.length());
        if(newStr.length()>word.length()){
            return word;
        }
        return newStr;
    }
}
