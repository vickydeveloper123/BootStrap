package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BooksDetails;

public interface BooksIdRepository extends JpaRepository<BooksDetails, String>{

}
