package controller;

public class FatorialLimitado {

		//função recursiva
		public static int fatorial(int n) {
			if (n == 0) {
				return 1;
			} 
			else if (n > 12) {
				return n;
			}
			else {
				return n * fatorial(n - 1);
			}
		}
}
