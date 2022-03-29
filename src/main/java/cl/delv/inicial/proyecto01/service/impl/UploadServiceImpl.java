package cl.delv.inicial.proyecto01.service.impl;

import cl.delv.inicial.proyecto01.dto.UploadExerciseResponseDTO;
import cl.delv.inicial.proyecto01.dto.UploadRequestDTO;
import cl.delv.inicial.proyecto01.mappers.DataMapper;
import cl.delv.inicial.proyecto01.service.DataService;
import cl.delv.inicial.proyecto01.service.UploadService;
import cl.delv.inicial.proyecto01.vo.UploadDataRequestVO;
import org.springframework.stereotype.Service;

@Service
public class UploadServiceImpl implements UploadService {

    private DataService dataService;
    private DataMapper dataMapper;

    public UploadServiceImpl(DataService dataService, DataMapper dataMapper) {
        this.dataService = dataService;
        this.dataMapper = dataMapper;
    }

    @Override
    public UploadExerciseResponseDTO newExercise(UploadRequestDTO request) {
        UploadExerciseResponseDTO response = new UploadExerciseResponseDTO();
        UploadDataRequestVO requestVO = new UploadDataRequestVO();
        //set a lo antiguo
        requestVO.setName(request.getRequest().getName());
        requestVO.setCategory(request.getRequest().getCategory());
        requestVO.setDescription(request.getRequest().getDescription());
        requestVO.setImage(request.getRequest().getImage());

        return dataService.saveExercise(requestVO, response);
    }
}
