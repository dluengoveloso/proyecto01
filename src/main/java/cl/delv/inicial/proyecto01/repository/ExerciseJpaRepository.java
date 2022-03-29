package cl.delv.inicial.proyecto01.repository;

import cl.delv.inicial.proyecto01.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The type Exercise jpa repository.
 */
@Repository
public interface ExerciseJpaRepository extends JpaRepository<Exercise, Integer> {
}
