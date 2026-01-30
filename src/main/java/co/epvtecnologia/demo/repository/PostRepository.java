package co.epvtecnologia.demo.repository;

import co.epvtecnologia.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
