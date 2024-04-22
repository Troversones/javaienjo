
public class NemSzeretiException {
	private final Jatek melyikJatekot;
	
	public NemSzeretiException(Jatek melyiket) {
		this.melyikJatekot = melyiket;
		System.err.println("A jatekos nem szereti a "+ melyiket +" jatekot.");
	}
	
	public Jatek getMelyikJatekot() {
		return this.melyikJatekot;
	}
}
