package tr.edu.trakya.cemtaskin.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.edu.trakya.cemtaskin.recipe.models.Category;
import tr.edu.trakya.cemtaskin.recipe.repositories.CategoryRepository;
import tr.edu.trakya.cemtaskin.recipe.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage (){


        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");
        System.out.println("Cat id is : " + categoryOptional.get().getId());
        return "index";
    }
}
