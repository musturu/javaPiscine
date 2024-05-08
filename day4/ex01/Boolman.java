public class Boolman {
    
	boolean bool;

	public Boolman(boolean bool) {
		this.bool = bool;
	}

	public void changeBool() {
		bool = !bool;
	}
	public synchronized boolean checkbool() {
		return (bool);
	}
}
