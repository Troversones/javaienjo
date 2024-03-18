public class CserelhetoFejuCsavarhuzo extends Csavarhuzo {
	private final int fejMeret;
	private boolean egyhornyuFej;
	private boolean phillipsFej;
	private boolean imbuszFej;
	
	public CserelhetoFejuCsavarhuzo(int meret,int fejMeret, Csavarfej csavarFej) {
		super(meret,csavarFej);
		this.fejMeret = fejMeret;
		this.egyhornyuFej = true;
		this.imbuszFej = true;
		this.phillipsFej = true;
	}
	
	public void fejElhagy(String melyik) {
		switch(melyik) {
			case "egyhornyu":
				this.egyhornyuFej = false;
				break;
			case "phillips":
				this.phillipsFej = false;
				break;
			case "imbusz":
				this.imbuszFej = false;
				break;
		}
	}
	
	public boolean fejCsere(String melyikre) {
		switch(melyikre) {
			case "egyhornyu":
				if(this.csavarfej == Csavarfej.EGYHORNYU) {
					return false;
				}else if(this.egyhornyuFej == false) {
					return false;
				}else if(this.egyhornyuFej == true){
					this.csavarfej = Csavarfej.EGYHORNYU;
				}
				break;
				
			case "phillips":
				if(this.csavarfej == Csavarfej.PHILLIPS) {
					return false;
				}else if(this.phillipsFej == false) {
					return false;
				}else if(this.phillipsFej == true){
					this.csavarfej = Csavarfej.PHILLIPS;
				}
				break;
				
			case "imbusz":
				if(this.csavarfej == Csavarfej.IMBUSZ) {
					return false;
				}else if(this.imbuszFej == false) {
					return false;
				}else if(this.imbuszFej == true){
					this.csavarfej = Csavarfej.IMBUSZ;
				}
				break;
		}
		return true;
	}
	
	public int getMeret() {
		return super.getMeret() - this.fejMeret;
	}
}