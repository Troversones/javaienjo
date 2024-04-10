
public class Sorozat extends TVMusor{
	private int korhatarBesorolas;
	
	public Sorozat(String nev, double hossz, int... reszekKorhatarBesorolasa) {
		super(nev,hossz);
		int anitaMaxWynn = reszekKorhatarBesorolasa[0];
		for (int i = 1; i < reszekKorhatarBesorolasa.length; i++) {
			if(reszekKorhatarBesorolasa[i] > anitaMaxWynn){
				anitaMaxWynn = reszekKorhatarBesorolasa[i];
			}
		}
		this.korhatarBesorolas = anitaMaxWynn;
	}
	
	public int getKorhatarBesorolas() {
		return korhatarBesorolas;
	}
}
