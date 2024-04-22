import java.util.Map;
import java.util.HashMap;

public class Jatekos {
	private String nev;
	private Jatek kedvenc;
	private Map<Jatek, Integer> eddigJatszott;
	
	public Jatekos(String nev) {
		this.nev = nev;
		this.kedvenc = null;
		this.eddigJatszott = new HashMap<>();
	}
	
	public void jatszik(Jatek mit, int mennyit) {
		int diffCount = 0;
		for (int i = 0; i < mit.getGenre().length; i++) {
			if(mit.getGenre()[i] != this.kedvenc.getGenre()[diffCount]) {
				
			}
		}
	}
}
