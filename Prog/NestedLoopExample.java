public class NestedLoopExample {
	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		while (p-- > 0) {
			for (int i = 1; i <= m; i++)
				System.out.print(i + " ");
			System.out.println("");
		}
	}
}
