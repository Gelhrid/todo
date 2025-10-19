package pl.kodz.todo.modeldata;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "list", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ToDo> toDos = new ArrayList<>();
}
