package cl.delv.inicial.proyecto01.service;

import cl.delv.inicial.proyecto01.dto.UploadExerciseResponseDTO;
import cl.delv.inicial.proyecto01.dto.UploadRequestDTO;


public interface UploadService {

    UploadExerciseResponseDTO newExercise(UploadRequestDTO requestDTO);

}
