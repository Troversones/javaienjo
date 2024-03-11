import java.util.Iterator;

public class MotorizedVehicle {
	private int fuelLevel;
	private int maxFuelCapacity;
	private int tireCount;
	private int baseWeight;
	
	public MotorizedVehicle(int tireCount, int maxFuelCapacity, int weight) {
		this.tireCount = tireCount;
		this.maxFuelCapacity = maxFuelCapacity;
		this.baseWeight = weight;
	}
	
	public int getTireCount() {
		return this.tireCount;
	}
	
	public int getMaxFuelCapacity() {
		return this.maxFuelCapacity;
	}
	
	public int getFuelLevel() {
		return this.fuelLevel;
	}
	
	public int getWeight() {
		return this.baseWeight;
	}
	
	private void setFuelLevel(float level) {
		this.fuelLevel = (int)level;
	}
	
	public float averageConsumption() {
		float x = 0.0f;
		x = 5.0f * (float)Math.sqrt((double)this.baseWeight / (double)1302);
		return x;
	}
	
	public boolean go(float km) {
		try {
			for (int i = 0; i < (int)km; i++) {
				this.fuelLevel -= averageConsumption();
				
			}
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
}