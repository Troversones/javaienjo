
public class Product {
	private String name;
	private int amount;
	private boolean important;
	
	public Product(String name, int amount, boolean important) {
		this.name = name;
		this.amount = Math.max(0, amount);
		this.important = important;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public boolean isImportant() {
		return this.important;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAmount(int amount) {
		this.amount = Math.max(0, amount);
	}
	
	public void setImportant(boolean important) {
		this.important = important;
	}
}
