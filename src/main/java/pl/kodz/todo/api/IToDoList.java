package pl.kodz.todo.api;

import org.springframework.http.ResponseEntity;
import pl.kodz.todo.model.CreateToDoListDto;

public interface IToDoList {
    public ResponseEntity<Void> createList(Long creator, CreateToDoListDto list);
}
