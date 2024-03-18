public class Hos extends Ember{
	private int tamadas;
	private int sikerSzam;
	
	public Hos(String nev, int eletEro, int tamadas, int sikerSzam) {
		if(tamadas > 0 && sikerSzam > 0 && eletEro > 0) {
			this.eletEro = eletEro;
			this.nev = nev;
			this.tamadas = tamadas;
			this.sikerSzam = sikerSzam;
		}
	}
	
	public int getTamadas() {
		return this.tamadas;
	}
	
	public int getSikerSzam() {
		return this.sikerSzam;
	}
	
	public void setSikerSzam(int ujSzam) {
		if(this.sikerSzam < ujSzam) {
			this.sikerSzam = ujSzam;
		}
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
		return String.format("Emberunk neve %s, es jelenleg %s. Ez az ember egy sarkanyolo hos, tamadasa %d, es eddig %d darab sarkanyt olt meg.", this.nev, tmp, this.tamadas,this.sikerSzam);
	}
	
	
}