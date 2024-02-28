public class Kutya {
	public String nev;
	private String[] kedvencEtelek = new String[3];
	private short ehseg;
	private long jokedv;
	
	public Kutya(String nev) {
		this.kedvencEtelek[0] = "csirke";
		this.kedvencEtelek[1] = "sajt";
		this.kedvencEtelek[2] = "lazac";
	}
	public Kutya(String nev, String... kedvencEtelek) {
		if (nev != null && kedvencEtelek != null) {
			this.nev = nev;
			this.kedvencEtelek = kedvencEtelek;	
		}
		
	}
	
	public boolean szereti(String etel) {
		for (int i = 0; i < kedvencEtelek.length; i++) {
			if(kedvencEtelek[i].equalsIgnoreCase(etel)){
				return true;
			}
		}
		return false;
	}
	
	public void ehesenNez(){
		this.ehseg = this.ehseg++;
		System.out.println("Vau!");
	}
	 
	public Kutya farokCsovalas() {
		this.jokedv = this.jokedv++;
		return this;
	}

	public void eszik(String etel){
		if (szereti(etel) == false) {
			ehesenNez();
			return;
		}else if(this.ehseg <= 0){
			farokCsovalas();
		}else{
			this.ehseg--;
		}
	}
	
	public boolean odajon(String nev) {
		if (nev.length() > this.nev.length() || nev.length() < this.nev.length()) {
			return false;
		}

		int wrng = 0;
		for (int i = 0; i < nev.length(); i++) {
			
			if(this.nev.toCharArray()[i] != nev.toCharArray()[i]){
				wrng++;
			}
		}

		return wrng > 2 ? false : true;
	}

	public static Kutya kutyaEtetes(Kutya elso, Kutya masodik, String etel){
		if(elso.szereti(etel) && !masodik.szereti(etel)){
			return elso;
		}else if(!elso.szereti(etel) && masodik.szereti(etel)){
			return masodik;
		}else if(elso.szereti(etel) && masodik.szereti(etel)){
			double egyedik = KE(elso);
			double maslo = KE(masodik);
			if (egyedik == maslo) {
				return elso;
			}else if (egyedik > maslo) {
				return elso;
			}else{
				return masodik;
			}
		}

		return null;
	}

	public static double KE(Kutya egyedik){
		double xd = Math.sqrt((egyedik.ehseg / 2.0) * (egyedik.jokedv / 3.0));
		return xd;
	}

}
