
public class Book {
	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}

	public Book(String t) {
		this(t, "���ڹ̻�");
	}

	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}

	public static void main(String[] args) {
		Book javabook = new Book("Java", "Ȳ����");
		Book emptyBook = new Book();
		Book bible = new Book("Bible");

		bible.show();
	}
}
