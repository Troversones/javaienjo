import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	private List<Product> items;
	
	public ShoppingList() {
		this.items = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		this.items.add(product);
	}
	
	public int countProducts() {
		return this.items.size();
	}
	
	public Product getProduct(int index) {
		if(index > 0 && index >= items.size()) {
			return null;
		}
		return this.items.get(index);
	}
	
	public void printProducts() {
		for (int i = 0; i < this.items.size(); i++) {
			System.out.println(this.items.get(i));
		}
	}
	
	public void delete(Product product) {
		this.items.remove(product);
	}
	
	public int deleteUnimportant() {
		return 0;
	}
}
