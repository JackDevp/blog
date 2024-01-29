package teamcubation.io.blog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamcubation.io.blog.domain.Comment;

import java.util.UUID;


@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {
}
