package com.jpa2.app;

import java.util.List;
import java.util.Scanner;

import com.jpa2.dao.JPAUtility;
import com.jpa2.entities.Author;
import com.jpa2.entities.Book;
import com.jpa2.service.BookAuthorService;
import com.jpa2.service.BookAuthorServiceImpl;

public class App {
	
	private static BookAuthorService service = new BookAuthorServiceImpl();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Throwable {
		
		System.out.println("1.Add Book and Author.");
		System.out.println("2.List all books");
		System.out.println("3.List all books of Author.");
		System.out.println("4.List books withing price range.");
		System.out.println("5.List Author of the Book ID.");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter book title:");
			String title1 = sc.next();
			System.out.println("Enter book isbn:");
			String isbn1 = sc.next();
			System.out.println("Enter book Price:");
			double price1=sc.nextDouble();
			System.out.println("Enter book Author:");
			String authorName = sc.next();
			Author a1 = new Author(authorName);			
			Book b1 = new Book(title1,isbn1,price1,a1);
			a1.setBook(b1);
			Book res_b1 = service.createBook(b1);
			System.out.println("Bood added: "+res_b1);
			
			break;
			
		case 2:
			List<Book> res_lst1 = service.allBooks();
			System.out.println("All Books are");
			for(Book b2: res_lst1) {
				System.out.println(b2);
			}					
			System.out.println("Done");
			break;
			
		case 3:
			System.out.println("Enter book Author:");
			String authorName3 = sc.next();			
			List<Book> res_lst2 = service.allBooksByAuthor(authorName3);
			System.out.println("All Books are");
			for(Book b3: res_lst2) {
				System.out.println(b3);
			}
			System.out.println("Done");			
			break;
			
		case 4:
			System.out.println("Enter start price:");
			double a = sc.nextDouble();
			System.out.println("Enter end price:");
			double b =sc.nextDouble();
			List<Book> res_lst4 = service.booksWithinPrice(a, b);
			for(Book b4: res_lst4) {
				System.out.println(b4);
			}
			break;
			
		case 5:
			System.out.println("Enter Book ID");
			long id5 = sc.nextLong();
			String resAut = service.authorNameForId(id5);
			System.out.println("Author is :"+resAut);
			break;
			
	default:
		System.out.println("Invalid choice!");
		JPAUtility.close();
		System.exit(0);
		}
		JPAUtility.close();
	}
}
