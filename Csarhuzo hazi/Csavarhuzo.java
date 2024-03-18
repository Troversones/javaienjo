public class Csavarhuzo {
	private int meret;
	protected Csavarfej csavarfej;
	
	public Csavarhuzo(int meret, Csavarfej fej) {
		this.meret = meret;
		this.csavarfej = fej;
	}
	
	public int getMeret() {
		return this.meret;
	}
	
	public Csavarfej getCsavarfej() {
		return this.csavarfej;
	}
	
	public void setMeret(int meret) {
		this.meret = meret;
	}
	
	public String toString() {
		String tmp = "";
		switch(this.csavarfej) {
			case EGYHORNYU:
				tmp = "hagyomanyos feju csavarhuzo";
				break;
			case PHILLIPS:
				tmp = "csillagfeju csavarhuzo";
				break;
			case IMBUSZ:
				tmp = "imbuszfeju csavarhuzo";
		}
		return tmp;
	}
}
