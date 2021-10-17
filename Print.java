public class Print {

	public static void main(String[] args) {

		Receipt r1 = new Receipt("t1.txt");

		r1.totals();

		System.out.println("Output 1");
		r1.printReceipt();
		System.out.println();

		Receipt r2 = new Receipt("t2.txt");

		r2.totals();

		System.out.println("Output 2");
		r2.printReceipt();
		System.out.println();

		Receipt r3 = new Receipt("t3.txt");

		r3.totals();

		System.out.println("Output 3");
		r3.printReceipt();

	}

}