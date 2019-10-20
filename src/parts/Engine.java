package parts;

public interface Engine {
	public void start();
	public void stop();
	public boolean isOn();
	public int getShifts();
	public int getMaxVelocity();
	public int getWeight();
}
