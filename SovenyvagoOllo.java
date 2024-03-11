public class SovenyvagoOllo {
	private double elesseg;
	
	public SovenyvagoOllo() {
		this.elesseg = 100.0;
	}
	
	public double getElesseg() {
		return this.elesseg;
	}
	
	public boolean vag(double suruseg) {
		if(this.elesseg >= suruseg) {
			this.elesseg -= suruseg;
			if(this.elesseg < 0.0) {
				this.elesseg = 0.0;
			}
			return true;
		}else {
			return false;
		}
	}
	
	public void elez() {
		this.elesseg += 15.0;
		if(this.elesseg > 100.0) {
			this.elesseg = 100.0;
		}
	}
	
	public static void main(String[] args) {
		SovenyvagoOllo kek = new SovenyvagoOllo();
		kek.elez();
		kek.vag(5.0);
	}
}