package cl.delv.inicial.proyecto01.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Upload exercise response dto.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseResponseDTO {
    @JsonProperty(value = "code")
    private String code;
    @JsonProperty(value = "description")
    private String description;

}
