package cl.delv.inicial.proyecto01.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteDataRequestDTO {
    @JsonProperty(value = "option", required = true, defaultValue = "1")
    private String optionValue;

    @JsonProperty(value = "name_exercise", required = false)
    private String nameExercise;

    @JsonProperty(value = "description_exercise", required = false)
    private String descriptionExercise;

    @JsonProperty(value = "id_category", required = false)
    private Integer idCategory;

    @JsonProperty(value = "name_category", required = false)
    private String nameCategory;
}
