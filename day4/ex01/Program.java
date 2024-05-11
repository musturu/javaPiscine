public class Program {

    public static void main(String[] args) throws InterruptedException {
		
		Printer one;
		Printer two;
		Boolman boolman;
		int	count;

		try {
			count = Integer.parseInt(args[0]);
		} catch (Exception e) {
			return ;
		}
		boolman = new Boolman(true);
		one = new Printer("Egg", count, boolman, true);
		two = new Printer("Hen", count, boolman, false);
		two.start();
		one.start();
    }
}
