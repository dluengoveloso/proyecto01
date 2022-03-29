package cl.delv.inicial.proyecto01.service.impl;

import cl.delv.inicial.proyecto01.dto.UploadExerciseResponseDTO;
import cl.delv.inicial.proyecto01.dto.UploadRequestDTO;
import cl.delv.inicial.proyecto01.entities.CategoryExercise;
import cl.delv.inicial.proyecto01.entities.Exercise;
import cl.delv.inicial.proyecto01.mappers.DataMapper;
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
    public UploadExerciseResponseDTO saveExercise(UploadDataRequestVO requestVO, UploadExerciseResponseDTO response) {
        Exercise exer = new Exercise();
        exer.setNameExercise(requestVO.getName());
        exer.setDescExercise(requestVO.getDescription());
        exer.setImgExercise(null);
        CategoryExercise cat = new CategoryExercise();
        cat.setIdCategoryExercise(requestVO.getCategory());
        cat.setNameCategoryExercise("bla");
        cat.setDescCategoryExercise("bla bla bla");
        exer.setCategoryExercise(cat);
        exerRepo.save(exer);
        return response;
    }


}
