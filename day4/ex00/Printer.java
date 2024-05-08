public class Printer extends Thread {

	String message;
	int count;


@Override 
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				return ;
			}
		}
	}

	public Printer(String msg, int times) {
		this.message = msg;
		this.count = times;
	}

}
