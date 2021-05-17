package tr.edu.trakya.cemtaskin.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.cemtaskin.recipe.models.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
