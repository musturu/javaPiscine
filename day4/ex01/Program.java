public class Program {

    public static void main(String[] args) throws InterruptedException {
		
		Printer one;
		Printer two;
		Boolman boolman;
		int	count;

		boolman = new Boolman(true);
		count = Integer.parseInt(args[0]);
		one = new Printer("Egg", count, boolman, true);
		two = new Printer("Hen", count, boolman, false);
		two.start();
		one.start();
    }
}
