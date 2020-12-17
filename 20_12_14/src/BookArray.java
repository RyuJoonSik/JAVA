import java.util.Scanner;

class Book2 {
	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public Book2() {
		this("", "");
		System.out.println("������ ȣ���");
	}

	public Book2(String t) {
		this(t, "���ڹ̻�");
	}

	public Book2(String t, String a) {
		this.title = t;
		this.author = a;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Book[] book = new Book[2];

		for (int i = 0; i < book.length; i++) {
			System.out.println("����>>");
			String title = scanner.nextLine();
			System.out.println("����>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author);
		}

		for (int i = 0; i < book.length; i++)
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
	}
}
