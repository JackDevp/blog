package teamcubation.io.blog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import teamcubation.io.blog.domain.Post;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID>{


   @Query("SELECT p FROM Post p WHERE p.isPublished = true") //JPQL
   //@Query(value = "Select * FROM post where isPublished is true", nativeQuery = true)Native Query
    List<Post> findAllByPublished();
}
