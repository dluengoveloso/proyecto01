package cl.delv.inicial.proyecto01.service;

import cl.delv.inicial.proyecto01.dto.DeleteRequestDTO;
import cl.delv.inicial.proyecto01.dto.ExerciseResponseDTO;

public interface DeleteService {
    ExerciseResponseDTO delExercise(DeleteRequestDTO requestDTO);

    ExerciseResponseDTO delCategoryExercise(DeleteRequestDTO requestDTO);
}
