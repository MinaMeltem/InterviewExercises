package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/10/17.
 *
 * 1) Write a recursive function that returns the sum of the digits of an integer, int sumOfDigits(int x)
 If x is 234, the function should return 2 + 3 + 4, that is, 9.
 If x is 12, the function should return 1 + 2, which is 3.
 If x is 39, the function should return 12.
 If x is negative, ignore the minus sign. For example, -12 and 12 both return 3.
 */
public class Recursion1 {
    public int sumOfDigits( int x){
        int sum = 0;

        if(x < 10 ){
            return x;
        }
        if (x < 0){
            x = x * -1;
        }
        return x % 10 + sumOfDigits(x/10);

    }
}
