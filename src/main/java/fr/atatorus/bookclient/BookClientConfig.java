package fr.atatorus.bookclient;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Service;

import org.springframework.context.annotation.Bean;

import fr.atatorus.bookservice.services.BookService;

public class BookClientConfig {
	
	@Bean
	BookService getBookService() {
		return new BookService();
	}
	
	@Bean
	ServiceAdapter serviceAdapter() {
		ServiceAdapter adapter = new ServiceAdapter();
		List<Service> services = new ArrayList<>();
		services.add(getBookService());
		adapter.setServices(services);
		return adapter;
	}

}
