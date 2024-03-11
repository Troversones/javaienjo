public class Bokor {
	private String fajta;
	private int forma;
	private double suruseg;
	
	public Bokor(String fajta, double suruseg) {
		this.fajta = fajta;
		if(suruseg <= 100.0 && suruseg >= 0.0) {			
			this.suruseg  = suruseg;
		} else if(suruseg < 0) {
			this.suruseg = 0.0;
		} else if(suruseg > 100) {
			this.suruseg = 100.0;
		}
	}
	
	public String getFajta() {
		return this.fajta;
	}
	
	public double getSuruseg() {
		return this.suruseg;
	}
	
	public void setForma(int ujForma) {
		if(ujForma >= 0 && ujForma <= 4) {			
			this.forma = ujForma;
		}
	}
	
	public void setSuruseg(double ujSuruseg) {
		if(ujSuruseg <= 100.0 && ujSuruseg >= 0.0) {			
			this.suruseg = ujSuruseg;
		} else if(ujSuruseg < 0) {
			this.suruseg = 0;
		} else if(ujSuruseg > 100) {
			this.suruseg = 100;
		}
	}
	
	public void setFajta(String fajta) {
		this.fajta = fajta;
	}
	
	public String forma() {
		String temp = new String();
		switch(this.forma) {
		case 0:
			temp = "cserje";
			break;
		case 1:
			temp = "bokor";
			break;
		case 2:
			temp = "formara nyirt";
			break;
		case 3:
			temp = "kisse elburjanzott";
			break;
		case 4:
			temp = "teljesen elburjanzott";
			break;
		}
		return temp;
	}
	
	public void nyiras(SovenyvagoOllo ollo) {
		if(ollo.vag(this.suruseg)) {
			this.forma = 2;
		}
	}
	
	public void novekedes() {
		if(this.forma < 4) {
			this.forma++;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
