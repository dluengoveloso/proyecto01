package cl.delv.inicial.proyecto01.service.impl;

import cl.delv.inicial.proyecto01.dto.ExerciseResponseDTO;
import cl.delv.inicial.proyecto01.entities.CategoryExercise;
import cl.delv.inicial.proyecto01.entities.Exercise;
import cl.delv.inicial.proyecto01.repository.ExerciseJpaRepository;
import cl.delv.inicial.proyecto01.service.DataService;
import cl.delv.inicial.proyecto01.vo.UploadDataRequestVO;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    private ExerciseJpaRepository exerRepo;

    public DataServiceImpl(ExerciseJpaRepository exerRepo) {
        this.exerRepo = exerRepo;
    }

    @Override
    public ExerciseResponseDTO saveExercise(UploadDataRequestVO requestVO, ExerciseResponseDTO response) {
        Exercise exer = new Exercise();
        CategoryExercise cat = new CategoryExercise();
        try {
            exer.setNameExercise(requestVO.getName());
            exer.setDescExercise(requestVO.getDescription());
            exer.setImgExercise(null);
            cat.setIdCategoryExercise(requestVO.getCategory());
            cat.setNameCategoryExercise("bla");
            cat.setDescCategoryExercise("bla bla bla");
            exer.setCategoryExercise(cat);
            exerRepo.save(exer);
        } catch (Exception e) {
            response.setCode("01");
            response.setDescription("Error in save Exercise," + e.getMessage());
        }
        return response;
    }
}
