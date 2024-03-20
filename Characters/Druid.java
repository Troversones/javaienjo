public class Druid extends Character{
	private boolean isBearFormActive;
	
	public Druid(String name) {
		super(name,10,6,4);
	}
	
	public String toString() {
		return String.format("Druid: Health:%d, Mana:%d, Stamina:%d", getHealth(),getMana(),getStamina());
	}
	
	@Override
	public String useSpell() {
		setMana(getMana() - 3);
		return "Moonbeam";
	}
	
	
}