package cl.delv.inicial.proyecto01.mappers;

import cl.delv.inicial.proyecto01.dto.UploadExerciseRequestDTO;
import cl.delv.inicial.proyecto01.vo.UploadDataRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface DataMapper {
  //  DataMapper INSTANCE = Mappers.getMapper( DataMapper.class );
    UploadDataRequestVO uploadExerciseRequestDTOtoVO(UploadExerciseRequestDTO p);
}
