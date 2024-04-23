class Program {

	public static void main(String[] args) {
		 int	print;

		 print = 479598;
		 print = factorize(print);
		 System.out.println(print);
	}

	static private int factorize(int number) {
		
		int ret;

		ret = 0;
		ret = ret + (number % 10);
		number = number / 10;
		ret = ret + (number % 10);
		number = number / 10;
		ret = ret + (number % 10);
		number = number / 10;
		ret = ret + (number % 10);
		number = number / 10;
		ret = ret + (number % 10);
		number = number / 10;
		ret = ret + (number % 10);
		return (ret);
	}
}
