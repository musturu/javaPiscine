import java.util.UUID;
import java.util.LinkedList;

public interface TransactionsList {

	void    addTransaction(Transaction transaction);
    void    removeTransactionById(UUID id);
    Transaction[]   toArray();

    public class TransactionNotFoundException extends RuntimeException {
        public TransactionNotFoundException(String message) {

            super(message);

        }
    }
}
