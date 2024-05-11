public class SummationThread extends Thread {
	
    private int[] array;
    private int startIdx;
    private int endIdx;
    private int partialSum;

    public SummationThread(int[] array, int startIdx, int endIdx) {
        this.array = array;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = startIdx; i <= endIdx; i++) {
            partialSum += array[i];
        }
        System.out.println(Thread.currentThread().getName() + ": "
        + "from " + startIdx + " to " + endIdx + " sum is: " + partialSum);   
    }

    public int getSum() {
        return partialSum;
    }
}


