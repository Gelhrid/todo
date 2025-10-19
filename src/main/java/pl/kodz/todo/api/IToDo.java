package pl.kodz.todo.api;

import org.springframework.http.ResponseEntity;
import pl.kodz.todo.model.ToDoDto;

public interface IToDo {
    public ResponseEntity<Void> createToDo(Long listId, ToDoDto todo);
}
