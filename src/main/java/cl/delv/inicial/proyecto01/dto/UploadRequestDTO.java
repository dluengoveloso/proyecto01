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
public class UploadRequestDTO {
    @JsonProperty(value = "request")
    private UploadExerciseRequestDTO request;
}
