package teamcubation.io.blog.records;

import jakarta.validation.constraints.NotBlank;

public record PostRecord(
        @NotBlank(message = "title is required") String title,
        @NotBlank(message = "text is required") String text) {
}
