
public class Fibonacci {
	private static double[] fib;
	public static int N;
	
	public static void buildFibonacci(int N) {
		Fibonacci.N = N;
		Fibonacci.fib = new double[N + 1];
		if(Fibonacci.N >= 2) {
			Fibonacci.fib[1] = 1;
			Fibonacci.fib[2] = 1;
			for(int i = 3;i <= N;++i)
				Fibonacci.fib[i]= Fibonacci.fib[i - 1] + Fibonacci.fib[i - 2]; 
		}
		else if (Fibonacci.N >= 1) {
			Fibonacci.fib[1] = 1;
		}
	}
	
	public static double of(int idx) {
		return fib[idx];
	}

	public static void main(String[] args) {
		Fibonacci.buildFibonacci(200);
		for(int i = 1;i <= Fibonacci.N;++i)
			System.out.println("Fibonacci.of(" + i + ") = " + Fibonacci.of(i));

	}

}
