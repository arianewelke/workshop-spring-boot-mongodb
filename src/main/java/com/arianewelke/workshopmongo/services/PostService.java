package com.arianewelke.workshopmongo.services;

import com.arianewelke.workshopmongo.domain.Post;
import com.arianewelke.workshopmongo.domain.User;
import com.arianewelke.workshopmongo.dto.UserDTO;
import com.arianewelke.workshopmongo.repository.PostRepository;
import com.arianewelke.workshopmongo.repository.UserRepository;
import com.arianewelke.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}


