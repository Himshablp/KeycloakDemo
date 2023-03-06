package com.spring.security.KeyclockDemo.controller;

import java.util.Map;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.KeyclockDemo.entities.Book;
import com.spring.security.KeyclockDemo.repository.BookRepository;

@RestController
public class MyController {

	@GetMapping("/books")
//	@RolesAllowed()
	public Map<String, Book> getBooks() {
		return BookRepository.books;
	}

}
