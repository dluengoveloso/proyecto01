package cl.delv.inicial.proyecto01.service;


import cl.delv.inicial.proyecto01.dto.UploadExerciseResponseDTO;
import cl.delv.inicial.proyecto01.vo.UploadDataRequestVO;

public interface DataService {

    UploadExerciseResponseDTO saveExercise(UploadDataRequestVO requestDTO, UploadExerciseResponseDTO response);
}
