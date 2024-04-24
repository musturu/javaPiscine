import java.util.UUID;

public class Transaction {

	public enum Category {
		DEBIT,
		CREDIT
	}

	UUID	uuid;
	User	recipient;
	User	sender;
	Category category;
	float	transferAmount;

	public Transaction(UUID uuid, User recipient, User sender, Category category, float transferAmount) {
		this.uuid = uuid;
		this.recipient = recipient;
		this.sender = sender;
		this.category = category;
		this.transferAmount = transferAmount;
		if (category == Category.DEBIT && transferAmount < 0 || category == Category.CREDIT && transferAmount > 0) {
			System.err.println("Invalid transaction type");
			System.exit(-1);
		}
		checkBalance();
	}

	private void checkBalance() {
		if (transferAmount > 0 && sender.balance < transferAmount) {
			System.out.println("Error insufficient funds");
			System.exit(-1);
		}
		if (transferAmount < 0 && recipient.balance < transferAmount) {
			System.out.println("Error insufficient funds");
			System.exit(-1);
		}
	}
}
