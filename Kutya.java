public class Kutya {
	String nev;
	String[] kedvencEtelek = new String[3];
	short ehseg;
	long jokedv;
	
	public Kutya(String nev) {
		this.kedvencEtelek[0] = "csirke";
		this.kedvencEtelek[1] = "sajt";
		this.kedvencEtelek[2] = "lazac";
	}
	public Kutya(String nev, String[] kedvencEtelek) {
		this.nev = nev;
		this.kedvencEtelek = kedvencEtelek;
		this.ehseg = 0;
		this.jokedv = 0;
	}
	
	public boolean szereti(String etel) {
		String temp = etel.toLowerCase();
		if("csirke" == temp && "sajt" == temp && "lazac" == temp){
			return true;
		}else {
			return false;
		}
	}
	
	public void ehesenNez(){
		this.ehseg = this.ehseg++;
		System.out.println("Vau!");
	}
	
	public Kutya farokCsovalas() {
		this.jokedv = this.jokedv++;
		Kutya xd = new Kutya();
	}
	public boolean odajon(String nev) {
		return false;
	}
}
