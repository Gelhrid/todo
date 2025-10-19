package pl.kodz.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kodz.todo.modeldata.ToDoList;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {}
