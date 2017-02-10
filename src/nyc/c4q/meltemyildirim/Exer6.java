package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/9/17.
 *
 * 6) Write a function stringArrays that takes two arrays as arguments and returns ONE
 * string that contains all the words in both arrays, separated by commas.
 * In other words, the function joins both arrays together then turns everything into a string.
 Example:
 stringArrays(['arya', 'sansa', 'bran'], ['daenerys', 'tyrion', 'jon']);
 returns 'arya, sansa, bran, daenerys, tyrion, jon'
 */

public class Exer6 {

    public String stringArrays (String  [] arr1, String  [] arr2){
        String [] mergedArrays = new String[arr1.length + arr2.length];
        System.arraycopy(arr1 ,0, mergedArrays, 0, arr1.length );
        System.arraycopy(arr2, 0, mergedArrays, arr1.length, arr2.length);

        String newStr ="";

        for (int i= 0; i< mergedArrays.length; i++){
            newStr = newStr + mergedArrays[i]+", ";
        }
        return newStr;
    }
}
