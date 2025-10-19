package pl.kodz.todo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
public class ToDoListDto {
    private Set<ToDoDto> toDos;
    private String creator;
    private String title;
}
