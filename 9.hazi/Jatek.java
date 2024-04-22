
public class Jatek {
	private String nev;
	private String[] genre;
	
	public Jatek(String nev) {
		this.nev = nev;
		this.genre = new String[3];
	}
	
	public Jatek(String nev, String... list) {
		this.nev = nev;
		this.genre = new String[3];
		
		for (int i = 0; i < this.genre.length; i++) {
			this.genre[i] = genre[i];
		}
	}
	
	public String[] getGenre() {
		return this.genre;
	}
	
	public void addGenre(String name) {
		for (int i = 0; i < this.genre.length; i++) {
			if(this.genre[i] != null) {
				this.genre[i] = name;
			}
		}
	}
	
	public boolean equals(Object o) {
		return true;
	}
	
	public int hashCode() {
		return 0;
	}
}
