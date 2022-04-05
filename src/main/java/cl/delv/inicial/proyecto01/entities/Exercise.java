package cl.delv.inicial.proyecto01.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_exercise", nullable = false)
    private Integer idExercise;

    @Column(name = "name_exercise")
    private String nameExercise;

    @Column(name = "desc_exercise")
    private String descExercise;

    @Column(name = "img_exercise")
    private Byte imgExercise;

    @ManyToOne
    @JoinColumn(name = "cat_id_exercise")
    private CategoryExercise categoryExercise;

}
