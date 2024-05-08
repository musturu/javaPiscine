import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileSequencer {

	private		byte[] byteArr = new byte[20];
	private		byte[][] byteKVP = new byte[10][20];

	public FileSequencer(String path) throws FileNotFoundException,IOException {
			FileInputStream fileStream;
		try {
			fileStream = new FileInputStream(path);
		}
		catch (FileNotFoundException e) {
			throw e = new FileNotFoundException("Invalid Path");
		}
		readFromFile(fileStream);
	}

	private	void	generateByteKVP() {

	}

	private void	readFromFile(FileInputStream fileStream) throws IOException {
		

		try {
			fileStream.read(byteArr, 0, 20);
		} catch (IOException e) {
			throw e = new IOException("Invalid read");
		}
		for (int i = 0; i < byteArr.length; i++) {
			System.out.printf("%s\n", byteArr[i]);
		}
	}




} 
