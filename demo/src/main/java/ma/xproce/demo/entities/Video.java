package ma.xproce.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private String description;
    private LocalDate datePublication;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private Creator creator;
}