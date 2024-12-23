package com.arianewelke.workshopmongo.repository;

import com.arianewelke.workshopmongo.domain.Post;
import com.arianewelke.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
