package fr.atatorus.bookclient;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.atatorus.bookservice.services.Book;
import fr.atatorus.bookservice.services.BookService;
import fr.atatorus.bookservice.services.Book_Type;


@SuppressWarnings("restriction")
public class BookClient {
	

	public static void main(String args[]) throws Exception {
		

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BookClientConfig.class);
		BookService service = ctx.getBean(BookService.class);

		Book bookPort = service.getBookPort();
        List<Book_Type> books = bookPort.getBooksByTitle("vert");
        
        for (Book_Type book : books) {
			System.out.println(book.getTitle());
			//System.out.println(book.getType().name());
		}
        
    }

}
