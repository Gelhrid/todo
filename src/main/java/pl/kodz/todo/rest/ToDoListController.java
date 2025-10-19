package pl.kodz.todo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.kodz.todo.api.IToDoList;
import pl.kodz.todo.model.ToDoListDto;

@RestController
public class ToDoListController implements IToDoList {

    @Override
    @PostMapping("/{creatorId}/lists")
    public ResponseEntity<Void> createList(@PathVariable  Long creatorId, @RequestBody ToDoListDto list){
        System.out.println("Dodaję ToDoList do listy: " + creatorId + " -> " + list.getTitle());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
