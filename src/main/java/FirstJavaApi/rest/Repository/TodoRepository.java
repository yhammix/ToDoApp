package FirstJavaApi.rest.Repository;

import FirstJavaApi.rest.Model.Task;

public interface TodoRepository extends JpaRepository <Task, Long>{
}
