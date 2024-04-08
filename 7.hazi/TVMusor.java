public abstract class TVMusor implements BesorolassalRendelkezo{
	protected double hossz;
	protected final String nev;
	
	public TVMusor(String nev, double hossz) {
		this.nev = nev;
		if(hossz >= 0) {			
			this.hossz = hossz;
		}
	}
	
	public String getNev() {
		return nev;
	}
	
	public double getHossz() {
		return this.hossz;
	}
	
	public void setHossz(double hossz) {
		if(hossz >= 0.0) {			
			this.hossz = hossz;
		}else {
			this.hossz = 0.0;
		}
	}
}