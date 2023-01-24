package com.unitycourse.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.unitycourse.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	//IgnoreCase == ignorar letras maiusculas
	List<Post> findByTitleContainingIgnoreCase(String text);

}
