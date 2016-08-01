package lab;

public class Store {
	
	ProductCatalog allCatalog;
	
	public Store(ProductCatalog catalog){
		this.allCatalog = catalog;
	}
	
	public void printCatalog(){
		allCatalog.print();
	}
}
