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
	
	
	
	public static void main(String[] args) {
		
	}

}
