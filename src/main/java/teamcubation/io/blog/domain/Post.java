package teamcubation.io.blog.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "tb_post")
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String title;
    private String text;
    @Column(nullable = false)
    private Boolean isPublished;

    @OneToMany(mappedBy = "tb_post")
    private List<Comment> comments;



}
