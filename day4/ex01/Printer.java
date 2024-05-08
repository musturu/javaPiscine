public class Printer extends Thread {

	String message;
	int count;
	Boolman	bool;
	boolean value;

@Override 
	public void run() {
		int i = 0;
		while (i <= count) {
			if (bool.checkbool() == value) {
				System.out.println(message);
				bool.changeBool();
				i++;
			}
		}
	}

	public Printer(String msg, int times, Boolman boolman, boolean ref) {
		this.message = msg;
		this.count = times;
		this.bool = boolman;
		this.value = ref;
	}
}
