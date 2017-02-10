package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/9/17.
 *
 * Assume you have a function called isSubstring(String s1, String s2)
 * which checks if one word  is a substring of another.
 * Given two strings, s1 and s2,
 * write a function called isRotated to check if s2 is a rotation of s1 using only one call to isSubstring
 * (e.g., "waterbottle" is a rotation of "erbottlewat").

 Examples:

 isRotated("waterbottle","erbottlewat" ); //returns true
 isRotated("waterbottle","bottlerewat" ); //returns false
 isRotated("dragon","agondr" ); //returns true
 isRotated("dragon","dog" ); //returns false
 */
public class Exer7 {

    public boolean isRotated(String s1, String s2) {

        if(isSubstring(s1,s2)){
            return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
        }
        return false;
    }


    public boolean isSubstring(String s1, String s2) {
        if (s1.contains(s2) || s2.contains(s1)) {
            return true;
        }
        return false;
    }


}
