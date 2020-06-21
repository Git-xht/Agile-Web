import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	private static List<Integer> fib = new ArrayList<Integer>(1);
	public static int N;
	
	public static void buildFibonacci(int N) {
		if(N < 1) return;
		fib.add(0);
		fib.add(1);
		fib.add(1);
		for(int i = 3;fib.get(i-1) + fib.get(i-2) < N;++i) {
			fib.add(fib.get(i-1) + fib.get(i-2));
		}
	}
	
	public static int of(int idx) {
		return fib.get(idx);
	}

	public static void main(String[] args) {
		Fibonacci.buildFibonacci(200);
		for(int i = 1;i < Fibonacci.fib.size();++i)
			System.out.println("Fibonacci.of(" + i + ") = " + Fibonacci.of(i));

	}

}
