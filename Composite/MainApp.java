package lab;

public class MainApp {

	public static void main(String[] args) {
		
		ProductCatalog bookcategory = new Category("BookCategory");
		
		ProductCatalog fictionCategory = new Category("FictionCategory");
		ProductCatalog computerBookCategory = new Category("ComputerBookCategory");
		
		ProductCatalog fictionCategoryBook1 = new CategoryItem("Herry Potter","1234");
		ProductCatalog fictionCategoryBook2 = new CategoryItem("Hobbit","1534");
		ProductCatalog computerCategoryBook1 = new CategoryItem("Digital Era","S123d");
		ProductCatalog computerCategoryBook2 = new CategoryItem("Virtural Reality","FF34");
		
		
		fictionCategory.add(fictionCategoryBook1);
		fictionCategory.add(fictionCategoryBook2);
		
		computerBookCategory.add(computerCategoryBook1);
		computerBookCategory.add(computerCategoryBook2);
		
		bookcategory.add(fictionCategory);
		bookcategory.add(computerBookCategory);
		
		ProductCatalog dvdCategory = new Category("DVD Category");
		
		ProductCatalog drama = new Category("Drama");
		ProductCatalog action = new Category("Action");
		
		ProductCatalog dramaDVD1 = new CategoryItem("Game of throne");
		ProductCatalog dramaDVD2 = new CategoryItem("12 Angry man");
		ProductCatalog actionDVD1 = new CategoryItem("Misson Impossible");
		ProductCatalog actionDVD2 = new CategoryItem("Batman");
		
		drama.add(dramaDVD1);
		drama.add(dramaDVD2);
		
		action.add(actionDVD1);
		action.add(actionDVD2);
		
		dvdCategory.add(drama);
		dvdCategory.add(action);
		
		
		ProductCatalog allCatelog = new Category("Product Catelogs");
		
		allCatelog.add(bookcategory);
		allCatelog.add(dvdCategory);
		
		Store store = new Store(allCatelog);
		store.printCatalog();
		
	}

}
