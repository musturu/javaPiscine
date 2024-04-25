public class User {

	public final int	identifier;
	String	name;
	float	balance;

	public User(String name, float balance) {
		if (balance < 0) {
			System.out.println("Error: User balance Negative");
			System.exit(-1);
		}
		this.identifier = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return ("Account ID: " + identifier + " - " + "Account Name: " + name + " - " +
				"Balance: " + balance);
	}
}