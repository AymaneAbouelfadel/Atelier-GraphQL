package ma.xproce.demo.repositories;

import ma.xproce.demo.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {

}