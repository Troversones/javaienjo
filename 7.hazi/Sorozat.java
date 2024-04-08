
public class Sorozat extends TVMusor{
	private int korhatarBesorolas;
	
	public Sorozat(String nev, double hossz, int... reszekKorhatarBesorolasa) {
		super(nev,hossz);
		this.korhatarBesorolas = reszekKorhatarBesorolasa[0];
	}
	
	public int getKorhatarBesorolas() {
		return korhatarBesorolas;
	}
}
