package pl.kodz.todo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class ToDoListResponseDto {
    private Long id;
    private String title;
    private Set<ToDoDto> toDos;
}
