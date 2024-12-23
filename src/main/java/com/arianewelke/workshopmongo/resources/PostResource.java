package com.arianewelke.workshopmongo.resources;

import com.arianewelke.workshopmongo.domain.Post;
import com.arianewelke.workshopmongo.domain.User;
import com.arianewelke.workshopmongo.dto.UserDTO;
import com.arianewelke.workshopmongo.services.PostService;
import com.arianewelke.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.boot.web.servlet.server.Session.SessionTrackingMode.URL;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}