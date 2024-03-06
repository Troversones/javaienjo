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
		this.gyanusitottak = gyanusitottak;
	}
	
	public void setNyomok(int[] nyomok) {
		this.nyomok = nyomok;
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
		try {
			int tempIndex = -1;
			String[] tempGyan = new String[this.gyanusitottak.length - 1];
			int count = 0;
			for(int i = 0; i < this.gyanusitottak.length; i++) {
				if(this.gyanusitottak[i] == kit) {
					tempIndex = i;
				}
			}
			
			if(tempIndex == -1) {
				return false;
			}
			
			for(int i = 0;i < this.gyanusitottak.length; i++) {
				if(i != tempIndex) {
					tempGyan[count] = this.gyanusitottak[i];
					count++;
				}
			}
			this.gyanusitottak = tempGyan;
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	public void inditek() {
		if(this.gyanusitottak.length > 0) {
			
			String nev = this.gyanusitottak[0];
			int count = 0;
			String[] temp = new String[this.gyanusitottak.length];
			
			for(int i = 1; i < this.gyanusitottak.length; i++) {
				temp[count] = this.gyanusitottak[i];
				count++;
			}
			
			temp[count] = nev;
			this.gyanusitottak = temp;
		}
	}
	
	public void nyomokatRendez() {
		int[] kekw = new int[this.nyomok.length];
		
		for(int i = this.nyomok.length, k = 0; i > 0; i--,k++) {
			kekw[k] = this.nyomok[i];
		}
		
		this.nyomok = kekw;
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
