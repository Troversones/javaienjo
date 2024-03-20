public class Character {
	private int mana;
	private int stamina;
	private int health;
	private String name;
	
	public Character(String name, int health, int mana, int stamina) {
		this.name = name;
		this.health = health;
		this.mana = mana;
		this.stamina = stamina;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMana() {
		return this.mana;
	}
	
	public int getStamina() {
		return this.stamina;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public String useSpell() {
		return "";
	}
}
