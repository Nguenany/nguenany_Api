package nguenany.gmail.com.demo.todosimple.repositories;

import nguenany.gmail.com.demo.todosimple.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
