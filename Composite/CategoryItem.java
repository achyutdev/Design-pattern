package lab;

public class CategoryItem extends ProductCatalog {

	private String title;
	private String isbn;

	public CategoryItem(String title) {
		this.title = title;
		this.isbn = null;
	}

	public CategoryItem(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void print() {
		System.out.println("Title : " + title);
		if (isbn != null)
			System.out.println("\tISBN :" + isbn);
	}
}
