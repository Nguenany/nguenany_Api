package nguenany.gmail.com.demo.todosimple.repositories;

import nguenany.gmail.com.demo.todosimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    //@Query(value = "SELECT * FROM task t WHERE t.user_id")
    List<Task> findByUser_Id( Long id);
}
