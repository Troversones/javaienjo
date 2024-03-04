public class Nyomozo {

	public String nev;
	private String[] gyanusitottak;
	private int[] nyomok;
	
	public Nyomozo(String[] gyanusitottak, int[] nyomok) {
		this.nev = "Columbo";
		this.gyanusitottak = gyanusitottak;
		this.nyomok = nyomok;
	}
	
	public Nyomozo(String nev, String[] gyanusitottak, int[] nyomok) {
		this.nev = nev;
		this.gyanusitottak = gyanusitottak;
		this.nyomok = nyomok;
	}
	
	public String[] getGyanusitottak() {
		return this.gyanusitottak;
	}
	
	public int[] getNyomok() {
		return this.nyomok;
	}
	
	public void setGyanusitottak(String[] gyanusitottak) {
		this.gyanusitottak = getGyanusitottak();
	}
	
	public void setNyomok(int[] nyomok) {
		this.nyomok = getNyomok();
	}
	
	public boolean nyomotFelhasznal(int index) {
		try {
			int[] temp = new int[this.nyomok.length - 1];
			int count = 0;
			for(int i = 0; i < this.nyomok.length; i++) {
				if(i != index) {
					temp[count] = this.nyomok[i];
					count++;
				}
			}
			this.nyomok = temp;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean felmentoBizonyitek(String kit) {
		return false;
	}
	
	public void inditek() {
		
	}
	
	public void nyomokatRendez() {
		
	}
	
	public void alibikEliminalasa() {
		
	}
	
	public boolean bajbanVan() {
		return false;
	}
	
	public String nyomozas() {
		return "xd";
	}
	
	public static void main(String[] args) {
		

	}

}
