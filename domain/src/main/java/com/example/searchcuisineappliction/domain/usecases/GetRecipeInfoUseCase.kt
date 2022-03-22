package com.example.searchcuisineappliction.domain.usecases

import com.example.searchcuisineappliction.domain.model.FinalRecipeModel
import com.example.searchcuisineappliction.domain.model.RecipeItem
import com.example.searchcuisineappliction.domain.repository.RecipeRepository

class GetRecipeInfoUseCase(var finalDishList: MutableList<RecipeItem>, var favoriteRecipe: String, private val recipeRepository: RecipeRepository) {
    lateinit var description: String
    lateinit var ingredients: String
    fun execute(): FinalRecipeModel {
        for (finalDish in finalDishList) {
            if (finalDish.stepsMap.keys.toString() == favoriteRecipe) {
                ingredients = finalDish.ingredientMap.toString()
                description = finalDish.stepsMap.values.toString()
            }
        }
        return FinalRecipeModel(ingredients, description)
    }
}
