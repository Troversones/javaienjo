import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtremeShopping {
	private Map<String, List<Product>> extremeList;
	
	public ExtremeShopping() {
		this.extremeList = new HashMap<>();
	}
	
	public void addShoppingList(String shops, List<Product> productList) {
		this.extremeList.put(shops, productList);
	}
	
	public void printShoppingLists() {
		
	}
}
