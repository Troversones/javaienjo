public class MotorizedVehicle {
	private float fuelLevel;
	private int maxFuelCapacity;
	private int tireCount;
	private int baseWeight;
	
	public MotorizedVehicle(int tireCount, int maxFuelCapacity, int weight) {
		if(tireCount >= 0 && maxFuelCapacity >= 0 && weight >= 0) {			
			this.tireCount = tireCount;
			this.maxFuelCapacity = maxFuelCapacity;
			this.baseWeight = weight;
			this.fuelLevel = maxFuelCapacity;
		}
	}
	
	public int getTireCount() {
		return this.tireCount;
	}
	
	public int getMaxFuelCapacity() {
		return this.maxFuelCapacity;
	}
	
	public float getFuelLevel() {
		return this.fuelLevel;
	}
	
	public int getWeight() {
		double suruseg = 0.77;
		double fuelWeight = this.fuelLevel * suruseg;
		return (int)fuelWeight + this.baseWeight;
	}
	
	private void setFuelLevel(float level) {
		if(level >= 0 && level <= this.maxFuelCapacity) {			
			this.fuelLevel = level;
		}else if(level < 0) {
			this.fuelLevel = 0;
		}else if(level > this.maxFuelCapacity) {
			this.fuelLevel = this.maxFuelCapacity;
		}
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
	
	public void refuel(float l) {
		setFuelLevel(l);
	}
	
	public int range() {
		float x = this.fuelLevel / averageConsumption();
		return (int)Math.floor(x);
	}
	
	public String toString() {
		return String.format("Alapsuly: %d Kg, Kerekek szama: %d, Uzemanyag tartaj: %.1f/50\n", this.baseWeight,this.tireCount,this.fuelLevel);
	}
	
}