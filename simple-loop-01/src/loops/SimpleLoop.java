package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleLoop {

	/*
	 * Objective In this challenge, we're going to use loops to help us do some
	 * simple math.
	 * 
	 * Task Given an integer, , print its first multiples. Each multiple (where )
	 * should be printed on a new line in the form: N x i = result.
	 * 
	 * Input Format
	 * 
	 * A single integer, .
	 * 
	 * Constraints
	 * 
	 * Output Format
	 * 
	 * Print lines of output; each line (where ) contains the of in the form: N x i
	 * = result.
	 * 
	 * Sample Input
	 * 
	 * 2 Sample Output
	 * 
	 * 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 2 x 4 = 8 2 x 5 = 10 2 x 6 = 12 2 x 7 = 14 2 x
	 * 8 = 16 2 x 9 = 18 2 x 10 = 20
	 */

	public static void main(String[] args) throws IOException {

		System.out.println("Enter a number\n");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine().trim());

		Integer sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = N * i;
			System.out.printf(" %d x %d = %d", N, i, sum);
		}

		bufferedReader.close();
	}
} 
