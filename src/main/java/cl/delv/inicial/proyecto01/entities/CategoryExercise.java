package cl.delv.inicial.proyecto01.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category_exercise")
public class CategoryExercise {

    @Id
    @Column(name = "id_category")
    private Integer idCategoryExercise;

    @Column(name = "name_category_exercise")
    private String nameCategoryExercise;

    @Column(name = "desc_category_exercise")
    private String descCategoryExercise;

}