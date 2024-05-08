public class Program {

    public static void main(String[] args) throws InterruptedException {
		
		Printer one;
		Printer two;
		int	count;

		count = Integer.parseInt(args[0]);
		one = new Printer("Egg", count);
		two = new Printer("Hen", count);
		one.start();
		two.start();
		one.join();
		two.join();
		for (int i = 0; i < count; i++) {
			System.out.println("Human");
		}
    }
}
