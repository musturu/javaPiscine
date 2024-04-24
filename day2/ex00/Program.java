import java.util.UUID;

public class Program {
    public static void main(String[] args) {

		User user1;
		User user2;
		Transaction transaction;

		user1 = new User(1, "Lorenzo", 100000f);
		user2 = new User(2, "Fabi", 100000f);
		transaction = new Transaction(new UUID(1,2), user1, user2, Transaction.Category.INCOME, 500f);
		System.out.println("user1.name = " + user1.name);
		System.out.println("user1.ID = " + user1.identifier);
		System.out.println("user1.balance = " + user1.balance);
		System.out.println("transaction.ID = " + transaction.uuid);
		System.out.println("transaction.sender.name = " + transaction.sender.name);
		System.out.println("transaction.recipient.name = " + transaction.recipient.name);
		System.out.println("transaction.`Category = " + transaction.category);
		System.out.println("transaction.transferAmount = " + transaction.transferAmount);
    }
}
