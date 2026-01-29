package vinaya;
import java.util.Scanner;

public class query {
	 
	    public static void main(String[] args) {
	 
	        Scanner sc = new Scanner(System.in);
	 
	        int N = sc.nextInt();
	        int[] A = new int[N];
	 
	        for (int i = 0; i < N; i++) {
	            A[i] = sc.nextInt();
	        }
	 
	        sortArray(A, N);
	 
	        for (int i = 0; i < N; i++) {
	            System.out.print(A[i] + " ");
	        }
	 
	        sc.close();
	    }
	 
	    public static int[] sortArray(int[] A, int N) {
	 
	        for (int i = 0; i < N - 1; i++) {
	            for (int j = 0; j < N - i - 1; j++) {
	 
	                int d1 = countDigits(A[j]);
	                int d2 = countDigits(A[j + 1]);
	 
	                // Stable swap
	                if (d1 > d2) {
	                    int temp = A[j];
	                    A[j] = A[j + 1];
	                    A[j + 1] = temp;
	                }
	            }
	        }
	        return A;
	    }
	 
	    private static int countDigits(int num) {
	        if (num == 0) return 1;
	 
	        int digits = 0;
	        while (num > 0) {
	            digits++;
	            num /= 10;
	        }
	        return digits;
	    }
	}


