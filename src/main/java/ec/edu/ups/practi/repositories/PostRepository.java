package ec.edu.ups.practi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.practi.models.Post;

public interface PostRepository extends JpaRepository<Post,Long>{
    
}
