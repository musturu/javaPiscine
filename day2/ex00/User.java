public class User {
	int		identifier;
	String	name;
	float	balance;

	public User(int identifier, String name, float balance) {
		if (balance < 0) {
			System.out.println("Error: User balance Negative");
			System.exit(-1);
		}
		this.identifier = identifier;
		this.name = name;
		this.balance = balance;
	}
}
