package ma.xproce.demo.repositories;

import ma.xproce.demo.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
}