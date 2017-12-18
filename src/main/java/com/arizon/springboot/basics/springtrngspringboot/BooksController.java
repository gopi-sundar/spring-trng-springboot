package com.arizon.springboot.basics.springtrngspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1, "Spring Trng", "Gopi"), new Book(2, "Spring Trng Webapp", "Author 2"));
	}
}
