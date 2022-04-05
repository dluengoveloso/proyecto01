package cl.delv.inicial.proyecto01.web;

import cl.delv.inicial.proyecto01.dto.ExerciseResponseDTO;
import cl.delv.inicial.proyecto01.dto.UploadRequestDTO;
import cl.delv.inicial.proyecto01.service.UploadService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Proyecto01Controller {

    private UploadService uploadService;

    public Proyecto01Controller(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PutMapping(value = "/new-exercise", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ExerciseResponseDTO uploadExercises(@RequestBody UploadRequestDTO request) {

        System.out.println("paso");

        return uploadService.newExercise(request);
    }

//    public ExerciseResponseDTO deleteExercises(@RequestBody DeleteRequestDTO request){
//
//    }
}
