package com.example.demo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Book_Details")
@Data

public class BooksDetails {
	
	
	@Id  // IT will indicate the primary key values in the table.
	@GenericGenerator(name="books_id_gen" ,strategy="com.example.demo.generator.BooksIdGenerator")
	@GeneratedValue(generator = "books_id_gen")
	private String orderId;
	
	
	private String orderBy;
	
	@CreationTimestamp
	@Column(name = "order_created_Time", updatable = false)
	LocalDateTime orderPlaceDate;

	@UpdateTimestamp
	@Column(name = "order_update_Time", insertable = false)
	LocalDateTime orderUpdateDate;


}
