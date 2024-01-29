package teamcubation.io.blog.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teamcubation.io.blog.domain.Post;
import teamcubation.io.blog.services.PostService;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;




    @GetMapping
    public ResponseEntity<List<Post>> getAllPublishedPosts() {
        return ResponseEntity.ok(postService.getAllPublishedPosts());
    }
}
