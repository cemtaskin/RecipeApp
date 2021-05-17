package tr.edu.trakya.cemtaskin.recipe.services;

import tr.edu.trakya.cemtaskin.recipe.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
