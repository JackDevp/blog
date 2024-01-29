package teamcubation.io.blog.records;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record CommentRecord(
        @NotBlank(message = "text is required") String text,
        @NotBlank(message = "Post id is required") UUID postId) {

}
