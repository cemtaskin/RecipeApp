package tr.edu.trakya.cemtaskin.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.cemtaskin.recipe.models.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
