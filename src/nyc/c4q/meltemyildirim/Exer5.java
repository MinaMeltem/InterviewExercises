package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 2/9/17.
 *
 * 5) Write a function xToNum(x, num) that takes as arguments two numbers:
 * x and num and returns the sum of all numbers from x to num (including both). For example:
 xToNum(4, 8)  // = 4 + 5 + 6 + 7 + 8 = 30
 will return 30.
 */
public class Exer5 {

    public int xToNum(int x, int num) {
        int sum = 0;
        for (int i = x; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
