package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category extends ProductCatalog {

	List<ProductCatalog> categories = new ArrayList<>();
	private String title;

	public Category(String title) {
		this.title = title;
	}

	public void add(ProductCatalog productCatalog) {
		categories.add(productCatalog);
	}

	public void remove(ProductCatalog productCatalog) {
		categories.remove(productCatalog);
	}

	public ProductCatalog getchild(int i) {
		return (ProductCatalog) categories.get(i);
	}
	
	public void print(){
		System.out.println("\n");
		System.out.println("Category Title : " + title);
		System.out.println("---------------------------");
		
		Iterator<ProductCatalog> iterator = categories.iterator();
		
		while(iterator.hasNext()){
			ProductCatalog productCatalog = (ProductCatalog) iterator.next();
			productCatalog.print();
		}
	}
}
