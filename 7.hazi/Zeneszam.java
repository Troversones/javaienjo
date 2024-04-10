public class Zeneszam implements BesorolassalRendelkezo{
	private String eloado;
	private String szamCim;
	private String szoveg;
	
	public Zeneszam(String eloado, String szamCim, String szoveg) {
		this.eloado = eloado;
		this.szamCim = szamCim;
		this.szoveg = szoveg;
	}
	
	public String getEloado() {
		return this.eloado;
	}
	
	public String getSzamCim() {
		return this.szamCim;
	}
	
	@Override
	public int getKorhatarBesorolas() {
		String[] szavak = new String[] {"xeierirg","kuoulzz","pqtruei","fktilop","kxre","eifei","csozrox"};
		String[] bontottSzoveg = this.szoveg.split(" ");
		int szam = 0;
		for (int i = 0; i < bontottSzoveg.length; i++) {
			for (int j = 0; j < szavak.length; j++) {
				if(bontottSzoveg[i].equals(szavak[j])) {
					szam++;
				}
			}
		}
		
		return szam;
	}
}