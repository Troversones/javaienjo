public class Ember {
	protected String nev;
	protected int eletEro;
	
	public Ember() {
		this.nev = "ismeretlen";
		this.eletEro = 10;
	}
	
	public Ember(String nev, int eletEro) {
		this.nev = nev;
		if(eletEro < 0) {
			this.eletEro = (int)Math.abs(eletEro);		
		}else {
			this.eletEro = eletEro;
		}
	}
	
	public void setEletEro(int ujEletEro) {
		if(ujEletEro > 0) {
			this.eletEro = ujEletEro;
		}else {
			this.eletEro = 0;
		}
	}
	
	public int getEletEro() {
		return this.eletEro;
	}
	
	public String getNev() {
		return this.nev;
	}
	
	public String toString() {
		String tmp = "";
		if(this.eletEro > 10) {
			tmp = "majd kicsattan az egeszsegtol";
		}else if(this.eletEro <= 10 && this.eletEro >= 1) {
			tmp = "atlagos az allapota";
		}else if(this.eletEro == 0) {
			tmp = "halott";
		}
			
		return String.format("Emberunk neve %s, es jelenleg %s.", this.nev,tmp);
	}
	
	public boolean vajonElMeg() {
		return this.eletEro > 0 ? true : false;
	}
	
	public void gyogyul(int mennyivel) {
		if(this.eletEro == 0) {
			System.err.println("Sajnalom, elkestetek.");
		}else {
			this.eletEro += mennyivel;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
