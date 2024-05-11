import java.util.Random;

public class Program {

	private static final int MAX_ARRAY_SIZE = 2000000;
    private static final int MAX_MODULO = 1001;
    public static int threadSum = 0;

    public static void main(String[] args) {
    	
		int	threadNum;
		int	size;
		SummationThread[] threads;
		int	array[];

		try {
			size = Integer.parseInt(args[0]);
			threadNum = Integer.parseInt(args[1]);
			threads = new SummationThread[threadNum];
			array = generateArray(size);
			int chunkSize = size / threadNum;
			for (int i = 0; i < threadNum; i++) {
				int startIdx = i * chunkSize;
            	int endIndex = (i == threadNum - 1) ? size - 1 : (i + 1) * chunkSize - 1; //note
            	threads[i] = new SummationThread(array, startIdx, endIndex);              
            	threads[i].start();
			}
		} catch (Exception e) {
			System.out.println("Usage: <arraySize> <numberOfThreads>");
			return ;
		}

		try {
            for (int i = 0; i < threadNum; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
            System.exit(-1);
        }

        for (int i = 0; i < threadNum; i++) {
            threadSum += threads[i].getSum();
        }
        System.out.println("Multi thread Sum: " + threadSum); 

		int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Single thread Sum: " + sum);
    }

	private static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(MAX_MODULO);
        }
        return array;
    }
}
