package SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootApplication.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
	User findByEmail(String email);
}
