package FirstJavaApi.rest.Repository;

import FirstJavaApi.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
