package cl.delv.inicial.proyecto01.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UploadDataRequestVO {

    private String name;
    private String description;
    private String image;
    private Integer category;
}
