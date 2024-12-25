package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRespository;

@Service
public class BookService {
  @Autowired
  
   private BookRespository bRepo;
	   public void save(Book b) {
		   bRepo.save(b);
	   }
	   
	   public List<Book>getAllBook(){
		   return bRepo.findAll();
	   }
	   
	   public Book getBookbyId(int id) {
		   return bRepo.findById(id).get();
	   }
	   
	   public void deletebyID(int id) {
		   bRepo.deleteById(id);
	   }
}
