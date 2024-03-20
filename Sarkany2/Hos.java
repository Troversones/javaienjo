public class Hos extends Ember{
	private int tamadas;
	private int sikerSzam;
	
	public Hos(String nev, int eletEro, int tamadas, int sikerSzam) {
		if(sikerSzam < 0) {
			this.sikerSzam = 0;
		}else {
			this.sikerSzam = sikerSzam;
		}
		
		if(tamadas < 0) {
			this.tamadas = 0;
		}else {
			this.tamadas = tamadas;
		}
		
		if(eletEro > 0) {
			this.eletEro = eletEro;
		}
		this.nev = nev;
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
		
		return String.format("Emberunk neve %s, es jelenleg %s. Ez az ember egy sarkanyolo hos, tamadasa %d, es eddig %d darab sarkanyt olt meg.", getNev(), tmp, getTamadas(), getSikerSzam());
	}
	
	public void gyogyul(int mennyivel) {
		this.eletEro += mennyivel;
	}
	
	public void edzes() {
		if(this.eletEro > 0) {
			this.tamadas++;
		}
	}
	
	public boolean erosebb(Hos[] hosok) {
		for (int i = 0; i < hosok.length; i++) {
			if(hosok[i].tamadas > this.tamadas) {
				return false;
			}else if(hosok[i].tamadas == this.tamadas && hosok[i].eletEro > this.eletEro) {
				return false;
			}
		}
		return true;
	}
	
	
}