package cl.delv.inicial.proyecto01.service;

import cl.delv.inicial.proyecto01.dto.ExerciseResponseDTO;
import cl.delv.inicial.proyecto01.dto.UploadRequestDTO;

public interface UploadService {
    ExerciseResponseDTO newExercise(UploadRequestDTO requestDTO);
}