package pl.kodz.todo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ToDoDto {
    private String title;
    private String description;
}
