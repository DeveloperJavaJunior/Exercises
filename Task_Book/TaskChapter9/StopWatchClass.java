

public class StopWatchClass {

	private double startTime;
	private double endTime;

	public static void main(String[] args) {

	}

	public void stopWatch(double startTime) {
		startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();

	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return (long) startTime;
	}

	public long getEndTime() {
		return (long) endTime;
	}

	public long getElapsedTime() {
		return (long) (System.currentTimeMillis() - startTime);
	}

	public short getMilliSeconds() {
		return (short) ((System.currentTimeMillis() - startTime) % 1000);
	}

}