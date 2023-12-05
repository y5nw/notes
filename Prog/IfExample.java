public class IfExample {
	public static int cmpnum(int x, int y) {
		if (x > y) {
			return 1;
		} else if (x < y) {
			return -1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(cmpnum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}
