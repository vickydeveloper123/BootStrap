package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BooksDetails;
import com.example.demo.repository.BooksIdRepository;

@Service
public class BooksService {

	private BooksIdRepository booksRepository;

	public BooksIdRepository getBooksRepository() {
		return booksRepository;
	}

	@Autowired() // bytype [Setter]

	public void setBooksRepository(BooksIdRepository booksRepository) {
		this.booksRepository = booksRepository;
	}

	public void bookSavingDetails() {

		BooksDetails details = new BooksDetails();
		details.setOrderBy("Madhavi");
		booksRepository.save(details);

		System.out.println("==================================================");

		BooksDetails details1 = new BooksDetails();
		details1.setOrderBy("Dora Sri Vignesh");
		booksRepository.save(details1);
		
		
		System.out.println("==================================================");

		BooksDetails details2 = new BooksDetails();
		details2.setOrderBy("Uma Maheswari");
		booksRepository.save(details2);

	}

}
