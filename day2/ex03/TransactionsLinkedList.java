import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {

    public Transaction              current;
    public TransactionsLinkedList   next;
    public TransactionsLinkedList   prev;

    public TransactionsLinkedList (Transaction current, TransactionsLinkedList prev) {
        this.prev = prev;
        this.current = current;
        this.next = null;
    }
    public TransactionsLinkedList (Transaction current) {
        this.prev = null;
        this.current = current;
        this.next = null;
    }

    public Transaction getTransactionById(UUID id) {

        TransactionsLinkedList tmp = this;

        while (tmp != null) {
            if (id.equals(tmp.current.uuid)) {
                return (tmp.current);
            }
            tmp = tmp.next;
        }
        throw new TransactionNotFoundException("Transaction not found");
    }

	public void	addTransaction(Transaction transaction) {

        TransactionsLinkedList tmp = this;
        TransactionsLinkedList tmpPrev = this;

        while (tmp != null) {
            tmpPrev = tmp;
            tmp = tmp.next;
        }
        tmp = new TransactionsLinkedList(transaction, tmpPrev);
        tmpPrev.next = tmp;
	}

	public void	removeTransactionById(UUID id) {
		
		TransactionsLinkedList tmp = this;

        while (tmp != null) {
            if (id.equals(tmp.current.uuid)) {
				tmp.prev.next = tmp.next;
				break ;
            }
            tmp = tmp.next;
        }
        throw new TransactionNotFoundException("Transaction not found");
	}

    public Transaction[]	toArray() {
		
		Transaction[] ret;
		//todo
		return (ret);
	}
}
