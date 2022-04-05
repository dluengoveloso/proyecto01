package cl.delv.inicial.proyecto01.service;

import cl.delv.inicial.proyecto01.dto.ExerciseResponseDTO;
import cl.delv.inicial.proyecto01.vo.UploadDataRequestVO;

public interface DataService {
    ExerciseResponseDTO saveExercise(UploadDataRequestVO requestDTO, ExerciseResponseDTO response);
}
