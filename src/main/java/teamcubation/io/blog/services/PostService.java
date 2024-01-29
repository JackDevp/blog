package teamcubation.io.blog.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teamcubation.io.blog.domain.Post;
import teamcubation.io.blog.respository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;


    public List<Post> getAllPublishedPosts() {
        return postRepository.findAllByPublished();
    }

}
