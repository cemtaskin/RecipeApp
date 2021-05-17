package tr.edu.trakya.cemtaskin.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.cemtaskin.recipe.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
