package com.project.coffeeIngredient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CoffeeIngredientController {

    @Autowired
    private CoffeeIngredientServiceImpl coffeeIngredientService;
}
