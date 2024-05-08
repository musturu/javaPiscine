import java.util.Scanner;
import java.io.IOException;

public class Program {
	public static void main(String[] args) throws IOException {
		
		Scanner			scan = new Scanner(System.in);
		FileSequencer	fileSeq;

		System.out.printf("->");
		String userInput = scan.nextLine();
		System.out.println("userInput = " + userInput);
		try {
			fileSeq = new FileSequencer(userInput);
		} catch (IOException e) {
			throw e = new IOException("DIOCANE");
		}

	}
}
